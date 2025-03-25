package GUI;

import javax.swing.*;

import ParkingSystem.Booking;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PaymentPage extends JFrame {
    private JLabel hourlyRateLabel;
    private JLabel durationLabel;
    private JLabel totalCostLabel;
    private JComboBox<String> paymentTypeCombo;
    private JTextField cardNumberField;
    private JButton confirmButton;
    private Booking booking;

    public PaymentPage(Booking booking) {
        this.booking = booking;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Payment Processing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Hourly Rate:"));
        hourlyRateLabel = new JLabel(String.format("$%.2f", booking.getTotalCost() / (booking.getDuration() + 1)));        add(hourlyRateLabel);

        add(new JLabel("Duration (hours):"));
        durationLabel = new JLabel(String.valueOf(booking.getDuration()));
        add(durationLabel);

        add(new JLabel("Total Cost:"));
        totalCostLabel = new JLabel(String.format("$%.2f", booking.getTotalCost()));
        add(totalCostLabel);

        add(new JLabel("Payment Type:"));
        paymentTypeCombo = new JComboBox<>(new String[]{"Credit/Debit", "Mobile Pay"});
        paymentTypeCombo.addItemListener(new PaymentTypeListener());
        add(paymentTypeCombo);

        add(new JLabel("Card Number:"));
        cardNumberField = new JTextField();
        add(cardNumberField);

        confirmButton = new JButton("Confirm Payment");
        confirmButton.addActionListener(new ConfirmPaymentListener());
        add(confirmButton);

        cardNumberField.setEnabled(true);
    }

    private class PaymentTypeListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selected = (String) paymentTypeCombo.getSelectedItem();
                cardNumberField.setEnabled(!selected.equals("Mobile Pay"));
                if (selected.equals("Mobile Pay")) {
                    cardNumberField.setText("");
                }
            }
        }
    }

    private class ConfirmPaymentListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String paymentType = (String) paymentTypeCombo.getSelectedItem();
            String cardNumber = cardNumberField.getText().trim();

            boolean paymentSuccess = processPayment(
                booking.getClientId(),
                booking.getTotalCost(),
                paymentType,
                cardNumber
            );

            if (paymentSuccess) {
                JOptionPane.showMessageDialog(PaymentPage.this, 
                    "Payment successful!", 
                    "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(PaymentPage.this, 
                    "Payment failed. Please try again.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void showPaymentDialogue(Component parent, Booking booking) {
        PaymentPage paymentPage = new PaymentPage(booking);
        paymentPage.setLocationRelativeTo(parent);
        paymentPage.setVisible(true);
    }
    
    public static void main(String[] args) {
        Booking booking = new Booking("a", "a", 1, "1", 2, "a", 10.0);
        PaymentPage payment = new PaymentPage(booking);
        payment.setVisible(true);
    }
}

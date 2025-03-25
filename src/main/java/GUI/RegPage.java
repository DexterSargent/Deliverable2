package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegPage implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton confirm = new JButton("Confirm");
    JButton login = new JButton("Login");
    JTextField username;
    JTextField password;

    RegPage() {
        username = new JTextField("Username");
        password = new JTextField("Password");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        username.setMaximumSize(new Dimension(250, 40));
        password.setMaximumSize(new Dimension(250, 40));

        confirm.addActionListener(this);
        login.addActionListener(this);

        panel.add(username);
        panel.add(password);
        panel.add(confirm);
        panel.add(login);

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirm) {
            String user = username.getText();
            String pass = password.getText();
            System.out.println("Registered: " + user + "/" + pass);
        } else if (e.getSource() == login) {
            new LoginPage();
            frame.dispose();
        }
    }

    public static void main(String[] args) {
        new RegPage();
    }
}
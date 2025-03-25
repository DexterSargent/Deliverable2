package GUI;

import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class LoginPage implements ActionListener { 
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton enter = new JButton("Enter");
    JButton register = new JButton("Register");
    JTextField username;
    JTextField password;

    LoginPage() {
        username = new JTextField("Username"); 
        password = new JTextField("Password");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        username.setMaximumSize(new Dimension(250, 40));
        password.setMaximumSize(new Dimension(250, 40));

        enter.addActionListener(this);
        register.addActionListener(this);

        panel.add(username);
        panel.add(password);
        panel.add(enter);
        panel.add(register); 

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enter) {
            String user = username.getText();
            String pass = password.getText();
            System.out.println("Login attempt: " + user + "/" + pass);
        } else if (e.getSource() == register) {
            new RegPage();
            frame.dispose();
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
package GUI;

import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;

public class LoginReg implements ActionListener {
    JFrame frame = new JFrame();
    JButton login = new JButton("Login");
    JButton register = new JButton("Register");

    LoginReg() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setTitle("Login/Register Selection");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 10, 10));

        login.addActionListener(this);
        register.addActionListener(this);

        panel.add(login);
        panel.add(register);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            frame.dispose();
            new LoginPage();
        } else if (e.getSource() == register) {
            frame.dispose();
            new RegPage();
        }
    }

    public static void main(String[] args) {
        new LoginReg();
    }
}
package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegPage implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JButton confirm = new JButton("Confirm");
    JButton login = new JButton(" Switch to Login");
    JTextField username;
    JTextField password;
    JTextField extraID;
    JComboBox clientType;

    RegPage() {
        username = new JTextField("Username");
        password = new JTextField("Password");
        extraID = new JTextField("ID");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setTitle("Register");
        frame.setLayout(new GridLayout(2,1));

        panel.setLayout(new GridLayout(4,2));
        panel2.setLayout(new GridLayout(1,1));
        
        JLabel name = new  JLabel("Username");
		JLabel userPassword = new JLabel("Enter Password");
		JLabel client = new JLabel("Select client type");
		JLabel identification = new JLabel("Enter university ID");

        //username.setMaximumSize(new Dimension(250, 40));
       // password.setMaximumSize(new Dimension(250, 40));

        confirm.addActionListener(this);
        login.addActionListener(this);
        
        String [] clients = {"students", "faculty", "non-faculty", "vistor"};
        
        clientType = new JComboBox(clients);
        panel.add(name);
        panel.add(username);
        panel.add(userPassword);
        panel.add(password);
        panel.add(client);
        panel.add(clientType);
        panel.add(identification);
        panel.add(extraID);
        
        panel2.add(confirm);
        panel2.add(login);

        frame.add(panel);
        frame.add(panel2);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	if(e.getSource() == confirm && clientType.getSelectedItem() != "vistor" && extraID.getText() == null)
    	{
    		JOptionPane.showMessageDialog(null, "Please enter a valid university ID", "ERROR", JOptionPane.INFORMATION_MESSAGE);
    	}
    	
    	
        if (e.getSource() == confirm) {
            String user = username.getText();
            String pass = password.getText();
            String type = (String) clientType.getSelectedItem();
            System.out.println("Registered: " + user + "/" + pass);
            
            // TODO save user input and bring them to Login Window
        } else if (e.getSource() == login) {
            new LoginPage();
            frame.dispose();
        }
    }

    public static void main(String[] args) {
        new RegPage();
    }
}
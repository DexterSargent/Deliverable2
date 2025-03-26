package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Booking implements ActionListener {
	
	JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JButton makeBook = new JButton("Make A booking");
    JButton manageBook = new JButton("Manage booking");
    JButton confirm = new JButton("Confirm");
    JComboBox lots;
    JComboBox spaces;
    JComboBox time;
    JTextField licenseP = new JTextField();
    JTextField length = new JTextField();
    
    
	Booking()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,1));
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setTitle("Booking");
		
		panel.setLayout(new FlowLayout());
		
		panel2.setLayout(new GridLayout(5,2));
		
		panel3.setLayout(new FlowLayout());
		
		JLabel pLots = new  JLabel("Lot number");
		JLabel pSpaces = new JLabel("Space number");
		JLabel plate = new JLabel("license plate");
		JLabel startTime = new JLabel("Start time (24H clock)");
		JLabel duration = new JLabel("Duration");
		
		
		String[] timeAvail = {null, "0","1", "2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
		String[] lotsID = {null/* filled with the id of Lots */};
		String[] spaceID = {null/*filled with spaces from lot*/};
		
		lots = new JComboBox(lotsID);
		spaces = new JComboBox(spaceID);
		time = new JComboBox(timeAvail);
		


		
		panel.add(makeBook);
		panel.add(manageBook);
		
		panel2.add(pLots);
		panel2.add(lots);
		panel2.add(pSpaces);
		panel2.add(spaces);
		panel2.add(plate);
		panel2.add(licenseP);
		panel2.add(startTime);
		panel2.add(time);
		panel2.add(duration);
		panel2.add(length);
		
		panel3.add(confirm);
		
		frame.add(panel);
		frame.add(panel2);
		frame.add(panel3);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == confirm) {
			
			if(licenseP.getText() == null || length.getText() == null || lots.getSelectedItem() == null || spaces.getSelectedItem() == null || time.getSelectedItem() == null)
			{
				JOptionPane.showMessageDialog(null, "Please fill oout all the fields", "ERROR", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		// TODO else if logic to make sure the request is valid
		// TODO load payment window and hold onto values
		
		if(e.getSource() == manageBook)
		{
			frame.dispose();
            new ManageBookPage();
		}
		
		
		
	}

}

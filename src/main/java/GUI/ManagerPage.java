package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ManagerPage implements ActionListener {
	
		JFrame frame = new JFrame();
	    JPanel panel1 = new JPanel();
	    JPanel panel2 = new JPanel();
	    JPanel panel3 = new JPanel();
	    JButton spaceEnable = new JButton("Enable");
	    JButton spaceDisable = new JButton("Disable");
	    JButton lotEnable = new JButton("Enable");
	    JButton lotDisable = new JButton("Disable");
	    JButton scan = new JButton("Scan");
	    JButton lotAdd = new JButton("Add");
	    JButton verify = new JButton("verify");
	    JComboBox enableLot;
	    JComboBox disableLot;
	    JComboBox enableSpace;
	    JComboBox disableSpace;
	    JComboBox scanSpace;
	    JComboBox clientPending;
	    JTextField addLot = new JTextField();
	    JTextField clientID = new JTextField();
	    
	    ManagerPage()
	    {
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(new GridLayout(4,1));
			frame.setVisible(true);
			frame.setSize(500,500);
			frame.setTitle("Manager");
			
			JLabel aLot = new JLabel("Add Lot");
			JLabel spEnable = new  JLabel("Space enable");
			JLabel spDisable = new JLabel("Space disable");
			JLabel ltEnable = new JLabel("lot enable");
			JLabel ltDisable = new JLabel("lot disable");
			JLabel spaceScan = new JLabel("Space Scan");
			JLabel pClient = new JLabel ("Clients that need validation");
			
			
			panel1.setLayout(new GridLayout(6,3));
			panel2.setLayout(new GridLayout(1,3));
			//panel3.setLayout(new GridLayout(1,1));
			
			panel1.add(aLot);
			panel1.add(addLot);
			panel1.add(lotAdd);
			panel1.add(ltEnable);
			panel1.add(enableLot);
			panel1.add(lotEnable);
			panel1.add(ltDisable);
			panel1.add(disableLot);
			panel1.add(lotDisable);
			panel1.add(spEnable);
			panel1.add(enableSpace);
			panel1.add(spaceEnable);
			panel1.add(spDisable);
			panel1.add(disableSpace);
			panel1.add(spaceDisable);
			panel1.add(spaceScan);
			panel1.add(scanSpace);
			panel1.add(scan);
			panel1.add(spEnable);
			
			panel2.add(pClient);
			panel2.add(clientPending);
			panel2.add(verify);
			
			frame.add(panel1);
			frame.add(panel2);

	    }
	    

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

package GUI;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ManageBookPage implements ActionListener {
	
	JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JButton makeBook = new JButton("Make A booking");
    JButton manageBook = new JButton("Manage booking");
    JButton extend = new JButton("Extend");
    JButton edit = new JButton("Edit Booking");
    JButton cancel = new JButton("Cancel Booking");
    JButton checkIn = new JButton("Check In");
    JButton checkOut = new JButton("Check out");
    JTextField exTime = new JTextField("please enter a number");
    
    
    
    
	ManageBookPage()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4,1));
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setTitle("Manage Booking");
		
		panel.setLayout(new FlowLayout());
		
		panel2.setLayout(new GridLayout(4,2));
		
		panel3.setLayout(new GridLayout(1,3));
		
		panel4.setLayout(new FlowLayout());
		
		JLabel lotID = new  JLabel("Lot number");
		JLabel spaceID = new JLabel("Space number");
		JLabel startTime = new JLabel("Start time");
		JLabel duration = new JLabel("Duration");
		
		JLabel thelotID = new  JLabel("input here");
		JLabel thespaceID = new JLabel("input here");
		JLabel thestartTime = new JLabel("input here");
		JLabel theduration = new JLabel("input here");
		
		JLabel extendTime = new JLabel("Extend booking");
		
		extend.addActionListener(this);
		makeBook.addActionListener(this);
		edit.addActionListener(this);
		cancel.addActionListener(this);
		checkIn.addActionListener(this);
		checkOut.addActionListener(this);
		
		
		panel.add(makeBook);
		panel.add(manageBook);
		
		panel2.add(lotID);
		panel2.add(thelotID);
		panel2.add(spaceID);
		panel2.add(thespaceID);
		panel2.add(startTime);
		panel2.add(thestartTime);
		panel2.add(duration);
		panel2.add(theduration);
		
		panel3.add(extendTime);
		panel3.add(exTime);
		panel3.add(extend);
		
		panel4.add(edit);
		panel4.add(cancel);
		panel4.add(checkIn);
		panel4.add(checkOut);
		
		frame.add(panel);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == makeBook)
		{
			frame.dispose();
			new Booking();
		}
		
		if(e.getSource() == checkOut)
		{
			frame.dispose();
			new PaymentPage();
		}
		
	}
	
	

}

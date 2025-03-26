package GUI;

import ParkingSystem.ParkingSpaceProxy;
import ParkingSystem.AccountRegistry;
import ParkingSystem.SpaceManager;

import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;

public class LoginReg implements ActionListener {
    private final JFrame frame = new JFrame();
    private final JButton login = new JButton("Login");
    private final JButton register = new JButton("Register");

    // Shared system-wide proxy
    private static final ParkingSpaceProxy proxy = new ParkingSpaceProxy();

    public LoginReg() {
        initializeSystem();

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

    private void initializeSystem() {
        System.out.println("Loading data from CSV files...");

        // Load accounts
        AccountRegistry registry = proxy.getRegistry();
        registry.loadClientsFromCSV();
        registry.loadManagersFromCSV();
        registry.loadSuperManagerFromCSV();

        // Load parking lots
        SpaceManager spaceManager = proxy.getFacade().getSpaceManager();
        spaceManager.loadParkingLots();
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

    public static ParkingSpaceProxy getProxy() {
        return proxy;
    }

    public static void main(String[] args) {
        new LoginReg();
    }
}

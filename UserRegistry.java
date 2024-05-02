package userregistry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class UserRegistry extends JFrame implements ActionListener {

    private static String username;

    private JTextField usernameField, emailField, passwordField, addressField, contactField;
    private JButton createBtn, readBtn, updateBtn, deleteBtn, loginBtn;
    private HashMap<String, User> userMap;
    private HashMap<String, User> users;
    private HashMap<String, Double> balances;

    public UserRegistry(String username) {
        setTitle("User Registration System - Gappi, Rien Miro M. (Activity 2)");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        
        JLabel headerLabel = new JLabel("Registration Form");
        headerLabel.setFont(new Font("Century Gothic", Font.BOLD, 24)); // Customize font
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center align text
        add(headerLabel, BorderLayout.NORTH); // Add label to the top of the frame
    

        // Initialize components
        usernameField = new JTextField(20);
        emailField = new JTextField(20);
        passwordField = new JTextField(20);
        addressField = new JTextField(20);
        contactField = new JTextField(20);

        createBtn = new JButton("Create");
        readBtn = new JButton("Read");
        updateBtn = new JButton("Update");
        deleteBtn = new JButton("Delete");
        loginBtn = new JButton("Login");
        
        Dimension buttonSize = new Dimension(250, 40);
        createBtn.setPreferredSize(buttonSize);
        readBtn.setPreferredSize(buttonSize);
        updateBtn.setPreferredSize(buttonSize);
        deleteBtn.setPreferredSize(buttonSize);
        loginBtn.setPreferredSize(buttonSize);
        
        Dimension textFieldSize = new Dimension(250, 30);
        usernameField.setPreferredSize(textFieldSize);
        emailField.setPreferredSize(textFieldSize);
        passwordField.setPreferredSize(textFieldSize);
        addressField.setPreferredSize(textFieldSize);
        contactField.setPreferredSize(textFieldSize);
        
        Color buttonColor = new Color(150, 150, 100); // Green
        createBtn.setBackground(buttonColor);
        readBtn.setBackground(buttonColor);
        updateBtn.setBackground(buttonColor);
        deleteBtn.setBackground(buttonColor);
        loginBtn.setBackground(buttonColor);

        // Set colors for labels
        Color labelColor = new Color(0, 0, 0); // Dark Blue
        usernameField.setForeground(labelColor);
        emailField.setForeground(labelColor);
        passwordField.setForeground(labelColor);
        addressField.setForeground(labelColor);
        contactField.setForeground(labelColor);

        // Add action listeners
        createBtn.addActionListener(this);
        readBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
        loginBtn.addActionListener(this);

        // Add components to the frame
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Add components to the panel using GridBagLayout
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Username:"), gbc);

        gbc.gridx = 1;
        panel.add(usernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Address:"), gbc);

        gbc.gridx = 1;
        panel.add(addressField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Contact:"), gbc);

        gbc.gridx = 1;
        panel.add(contactField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(createBtn, gbc);

        gbc.gridx = 1;
        panel.add(readBtn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(updateBtn, gbc);

        gbc.gridx = 1;
        panel.add(deleteBtn, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        panel.add(loginBtn, gbc);

        add(panel);

        // Initialize user HashMap
        userMap = new HashMap<>();

        userMap.put("default", new User("default", "default@example.com", "password", "address", "contact"));
    }

    public void setUser(HashMap<String, Double> User) {
        this.users = users;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createBtn) {
            createUser();
        } else if (e.getSource() == readBtn) {
            readUser();
        } else if (e.getSource() == updateBtn) {
            updateUser();
        } else if (e.getSource() == deleteBtn) {
            deleteUser();
        } else if (e.getSource() == loginBtn) {
            loginUser();
        }
    }
    private void loginUser() {
        
     UserLogin loggin = new UserLogin(username);
               loggin.setLogin(balances);
               loggin.setVisible(true);
                dispose();
 }
    private void createUser() {
        String username = usernameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String address = addressField.getText();
        String contact = contactField.getText();
        String blank = "";

        if (userMap.containsKey(blank)) {
            JOptionPane.showMessageDialog(this, "Fields should not be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (userMap.containsKey(username)) {
            JOptionPane.showMessageDialog(this, "Username already exists, please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create a new user and add it to the HashMap
        User newUser = new User(username, email, password, address, contact);
        userMap.put(username, newUser);
        JOptionPane.showMessageDialog(this, "Account created successfully!");
    }

    private void readUser() {
        // Example: Reading user data
        String username = usernameField.getText();
        User user = userMap.get(username);
        if (user != null) {
            JOptionPane.showMessageDialog(this, user.toString(), "User Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "User not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateUser() {
        // Example: Updating user data
        String username = usernameField.getText();
        if (userMap.containsKey(username)) {
            String email = emailField.getText();
            String password = passwordField.getText();
            String address = addressField.getText();
            String contact = contactField.getText();
            User updatedUser = new User(username, email, password, address, contact);
            userMap.put(username, updatedUser);
            JOptionPane.showMessageDialog(this, "User updated successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "User not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteUser() {
        // Example: Deleting user data
        String username = usernameField.getText();
        if (userMap.containsKey(username)) {
            userMap.remove(username);
            JOptionPane.showMessageDialog(this, "User deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "User not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new UserRegistry(username).setVisible(true);
        });
    }

    // User class representing user data
    private class User {

        private String username;
        private String email;
        private String password;
        private String address;
        private String contact;

        public User(String username, String email, String password, String address, String contact) {
            
            this.username = username;
            this.email = email;
            this.password = password;
            this.address = address;
            this.contact = contact;
        }

        @Override
        public String toString() {
            return "Username: " + username + "\nEmail: " + email + "\nPassword: " + password + "\nAddress: " + address + "\nContact: " + contact;
        }
    }
}

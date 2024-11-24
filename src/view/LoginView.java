package view;

import controller.AdminController;

import java.awt.*;
import javax.swing.*;

public class LoginView extends JFrame {
    public LoginView(AdminController adminController) {
        super();
        setTitle("Login");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(loginButton);

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (adminController.login(username, password)) {
                JOptionPane.showMessageDialog(this, "Login successful");
                // Open Admin Dashboard
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

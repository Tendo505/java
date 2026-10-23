import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton exitButton;
    private LoginCredentials credentials;

    public LoginPanel(CoffeeTeaApp app, LoginCredentials credentials) {
        this.credentials = credentials;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Title
        JLabel titleLabel = new JLabel("Coffee & Tea Management System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(titleLabel, gbc);

        gbc.gridwidth = 1;

        // Username Label
        JLabel usernameLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(usernameLabel, gbc);

        // Username Field
        usernameField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(usernameField, gbc);

        // Password Label
        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        add(passwordLabel, gbc);

        // Password Field
        passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        add(passwordField, gbc);

        // Login Button
        loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(loginButton, gbc);

        // Exit Button
        exitButton = new JButton("Exit");
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(exitButton, gbc);

        // Button Actions
        loginButton.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                handleLogin(app);
            }
        });

        exitButton.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void handleLogin(CoffeeTeaApp app) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (credentials.authenticate(username, password)) {
            // Show student confirmation dialog
            int result = JOptionPane.showConfirmDialog(
                    this,
                    "Are you a student?\n(Students get 10% discount)",
                    "Student Status",
                    JOptionPane.YES_NO_OPTION
            );

            boolean isStudent = (result == JOptionPane.YES_OPTION);
            app.showMenuPanel(isStudent);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password!", "Login Error", JOptionPane.ERROR_MESSAGE);
            usernameField.setText("");
            passwordField.setText("");
        }
    }
}

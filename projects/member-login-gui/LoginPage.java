import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginPage() {
        setTitle("Login Page");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Title Label
        JLabel titleLabel = new JLabel("Login System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(120, 20, 200, 30);
        add(titleLabel);

        // Username Label and TextField
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 80, 100, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 80, 200, 25);
        add(usernameField);

        // Password Label and PasswordField
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 120, 100, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 120, 200, 25);
        add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 160, 100, 30);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Simple validation (you can add your own logic here)
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Open Member Information Page
                    new MemberInformationPage().setVisible(true);
                    dispose(); // Close login page
                }
            }
        });
        add(loginButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
}

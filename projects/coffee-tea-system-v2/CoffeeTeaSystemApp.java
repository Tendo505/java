import javax.swing.*;

public class CoffeeTeaApp extends JFrame {
    private LoginCredentials loginCredentials;
    private MenuData menuData;
    private LoginPanel loginPanel;
    private MenuPanel menuPanel;

    public CoffeeTeaApp() {
        setTitle("Coffee & Tea Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        // Initialize data
        loginCredentials = new LoginCredentials();
        menuData = new MenuData();

        // Show login panel first
        showLoginPanel();

        setVisible(true);
    }

    public void showLoginPanel() {
        getContentPane().removeAll();
        loginPanel = new LoginPanel(this, loginCredentials);
        add(loginPanel);
        revalidate();
        repaint();
    }

    public void showMenuPanel(boolean isStudent) {
        getContentPane().removeAll();
        menuPanel = new MenuPanel(this, menuData, isStudent);
        add(menuPanel);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CoffeeTeaApp();
            }
        });
    }
}

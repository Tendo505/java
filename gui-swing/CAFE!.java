import javax.swing.*;
import java.awt.*;

public class CoffeeTeaSystem {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Login Interface
            JFrame loginFrame = new JFrame("Coffee & Tea System - Login");
            loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginFrame.setSize(350, 250);
            loginFrame.setLocationRelativeTo(null);
            
            // Main panel
            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
            
            // Title panel
            JPanel titlePanel = new JPanel(new FlowLayout());
            JLabel titleLabel = new JLabel("Login to Coffee & Tea System");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
            titlePanel.add(titleLabel);
            
            // Form panel
            JPanel formPanel = new JPanel(new GridLayout(2, 2, 10, 10));
            
            formPanel.add(new JLabel("Username:"));
            JTextField usernameField = new JTextField(15);
            formPanel.add(usernameField);
            
            formPanel.add(new JLabel("Password:"));
            JPasswordField passwordField = new JPasswordField(15);
            formPanel.add(passwordField);
            
            // Button panel
            JPanel buttonPanel = new JPanel(new FlowLayout());
            JButton loginButton = new JButton("Login");
            JButton exitButton = new JButton("Exit");
            
            loginButton.addActionListener(e -> {
                loginFrame.dispose();
                
                // Student Confirmation Interface
                JFrame studentFrame = new JFrame("Coffee & Tea System - Student Status");
                studentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                studentFrame.setSize(350, 200);
                studentFrame.setLocationRelativeTo(null);
                
                // Main panel
                JPanel studentMainPanel = new JPanel(new BorderLayout());
                studentMainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
                
                // Title panel
                JPanel studentTitlePanel = new JPanel(new FlowLayout());
                JLabel studentTitleLabel = new JLabel("Are you a student?");
                studentTitleLabel.setFont(new Font("Arial", Font.BOLD, 16));
                studentTitlePanel.add(studentTitleLabel);
                
                // Message panel
                JPanel messagePanel = new JPanel(new FlowLayout());
                JLabel messageLabel = new JLabel("(Students get 10% discount!)");
                messageLabel.setFont(new Font("Arial", Font.PLAIN, 12));
                messagePanel.add(messageLabel);
                
                // Button panel
                JPanel studentButtonPanel = new JPanel(new FlowLayout());
                JButton yesButton = new JButton("Yes");
                JButton noButton = new JButton("No");
                
                yesButton.addActionListener(ev -> {
                    studentFrame.dispose();
                    showMenuInterface(true);
                });
                
                noButton.addActionListener(ev -> {
                    studentFrame.dispose();
                    showMenuInterface(false);
                });
                
                studentButtonPanel.add(yesButton);
                studentButtonPanel.add(noButton);
                
                // Assemble
                studentMainPanel.add(studentTitlePanel, BorderLayout.NORTH);
                studentMainPanel.add(messagePanel, BorderLayout.CENTER);
                studentMainPanel.add(studentButtonPanel, BorderLayout.SOUTH);
                
                studentFrame.add(studentMainPanel);
                studentFrame.setVisible(true);
            });
            
            exitButton.addActionListener(e -> {
                System.exit(0);
            });
            
            buttonPanel.add(loginButton);
            buttonPanel.add(exitButton);
            
            // Assemble login frame
            mainPanel.add(titlePanel, BorderLayout.NORTH);
            mainPanel.add(formPanel, BorderLayout.CENTER);
            mainPanel.add(buttonPanel, BorderLayout.SOUTH);
            
            loginFrame.add(mainPanel);
            loginFrame.setVisible(true);
        });
    }
    
    // Menu Interface
    private static void showMenuInterface(boolean isStudent) {
        JFrame menuFrame = new JFrame("Coffee & Tea Management System");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(700, 500);
        menuFrame.setLocationRelativeTo(null);
        
        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Title panel
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        if (isStudent) {
            JLabel studentLabel = new JLabel("Student (10% Discount Applied)");
            studentLabel.setFont(new Font("Arial", Font.BOLD, 14));
            titlePanel.add(studentLabel);
        }
        
        // Center panel - Split into left (menu) and right (order)
        JPanel centerPanel = new JPanel(new GridLayout(1, 2, 10, 0));
        
        // LEFT PANEL - Coffee and Tea Menus
        JPanel leftPanel = new JPanel(new BorderLayout(5, 5));
        
        // Coffee Menu
        JPanel coffeePanel = new JPanel(new BorderLayout());
        coffeePanel.setBorder(BorderFactory.createTitledBorder("Coffee Menu"));
        
        String[] coffeeItems = {
            "Espresso ($3.50)",
            "Americano ($3.00)",
            "Cappuccino ($4.50)",
            "Latte ($4.50)",
            "Macchiato ($4.00)",
            "Mocha ($5.00)"
        };
        
        JList<String> coffeeList = new JList<>(coffeeItems);
        coffeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane coffeeScroll = new JScrollPane(coffeeList);
        coffeeScroll.setPreferredSize(new Dimension(200, 150));
        coffeePanel.add(coffeeScroll, BorderLayout.CENTER);
        
        // Tea Menu
        JPanel teaPanel = new JPanel(new BorderLayout());
        teaPanel.setBorder(BorderFactory.createTitledBorder("Tea Menu"));
        
        String[] teaItems = {
            "Green Tea ($2.50)",
            "Black Tea ($2.50)",
            "Oolong Tea ($3.00)",
            "Chamomile Tea ($3.00)",
            "Matcha Latte ($4.50)",
            "Chai Latte ($3.50)"
        };
        
        JList<String> teaList = new JList<>(teaItems);
        teaList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane teaScroll = new JScrollPane(teaList);
        teaScroll.setPreferredSize(new Dimension(200, 150));
        teaPanel.add(teaScroll, BorderLayout.CENTER);
        
        // Add buttons for menus
        JPanel menuButtonPanel = new JPanel(new FlowLayout());
        JButton addCoffeeBtn = new JButton("Add to Order");
        JButton addTeaBtn = new JButton("Add to Order");
        
        menuButtonPanel.add(addCoffeeBtn);
        menuButtonPanel.add(addTeaBtn);
        
        // Assemble left panel
        JPanel menusPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        menusPanel.add(coffeePanel);
        menusPanel.add(teaPanel);
        leftPanel.add(menusPanel, BorderLayout.CENTER);
        leftPanel.add(menuButtonPanel, BorderLayout.SOUTH);
        
        // RIGHT PANEL - Current Order
        JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
        rightPanel.setBorder(BorderFactory.createTitledBorder("Current Order"));
        
        // Order list
        DefaultListModel<String> orderModel = new DefaultListModel<>();
        JList<String> orderList = new JList<>(orderModel);
        JScrollPane orderScroll = new JScrollPane(orderList);
        orderScroll.setPreferredSize(new Dimension(200, 200));
        rightPanel.add(orderScroll, BorderLayout.CENTER);
        
        // Total panel
        JPanel totalPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        totalPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel totalLabel = new JLabel("Total: $0.00");
        JLabel discountLabel = new JLabel("Discount: $0.00");
        if (!isStudent) {
            discountLabel.setVisible(false);
        }
        
        totalPanel.add(totalLabel);
        totalPanel.add(discountLabel);
        
        // Order buttons
        JPanel orderButtonPanel = new JPanel(new FlowLayout());
        JButton clearBtn = new JButton("Clear Order");
        JButton checkoutBtn = new JButton("Checkout");
        
        orderButtonPanel.add(clearBtn);
        orderButtonPanel.add(checkoutBtn);
        
        totalPanel.add(orderButtonPanel);
        
        // Exit button at bottom
        JPanel exitPanel = new JPanel(new FlowLayout());
        JButton exitBtn = new JButton("Exit");
        exitPanel.add(exitBtn);
        
        totalPanel.add(exitPanel);
        
        rightPanel.add(totalPanel, BorderLayout.SOUTH);
        
        // Add left and right to center panel
        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);
        
        // Add functionality to buttons
        addCoffeeBtn.addActionListener(e -> {
            String selected = coffeeList.getSelectedValue();
            if (selected != null) {
                orderModel.addElement(selected);
                updateTotal(orderModel, totalLabel, discountLabel, isStudent);
            }
        });
        
        addTeaBtn.addActionListener(e -> {
            String selected = teaList.getSelectedValue();
            if (selected != null) {
                orderModel.addElement(selected);
                updateTotal(orderModel, totalLabel, discountLabel, isStudent);
            }
        });
        
        clearBtn.addActionListener(e -> {
            orderModel.clear();
            totalLabel.setText("Total: $0.00");
            if (isStudent) {
                discountLabel.setText("Discount: $0.00");
            }
        });
        
        checkoutBtn.addActionListener(e -> {
            if (orderModel.isEmpty()) {
                JOptionPane.showMessageDialog(menuFrame, "Your order is empty!");
            } else {
                JOptionPane.showMessageDialog(menuFrame, "Thank you for your order!\nYour drinks will be ready soon.");
                orderModel.clear();
                totalLabel.setText("Total: $0.00");
                if (isStudent) {
                    discountLabel.setText("Discount: $0.00");
                }
            }
        });
        
        exitBtn.addActionListener(e -> {
            menuFrame.dispose();
            // Go back to login
            SwingUtilities.invokeLater(() -> {
                JFrame loginFrame = new JFrame("Coffee & Tea System - Login");
                loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                loginFrame.setSize(350, 250);
                loginFrame.setLocationRelativeTo(null);
                
                JPanel mainPanel2 = new JPanel(new BorderLayout());
                mainPanel2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
                
                JPanel titlePanel2 = new JPanel(new FlowLayout());
                JLabel titleLabel2 = new JLabel("Login to Coffee & Tea System");
                titleLabel2.setFont(new Font("Arial", Font.BOLD, 16));
                titlePanel2.add(titleLabel2);
                
                JPanel formPanel2 = new JPanel(new GridLayout(2, 2, 10, 10));
                formPanel2.add(new JLabel("Username:"));
                JTextField usernameField2 = new JTextField(15);
                formPanel2.add(usernameField2);
                formPanel2.add(new JLabel("Password:"));
                JPasswordField passwordField2 = new JPasswordField(15);
                formPanel2.add(passwordField2);
                
                JPanel buttonPanel2 = new JPanel(new FlowLayout());
                JButton loginButton2 = new JButton("Login");
                JButton exitButton2 = new JButton("Exit");
                
                loginButton2.addActionListener(ev -> {
                    loginFrame.dispose();
                    // This would go to student confirmation again
                    JOptionPane.showMessageDialog(loginFrame, "Login successful!");
                });
                
                exitButton2.addActionListener(ev -> System.exit(0));
                
                buttonPanel2.add(loginButton2);
                buttonPanel2.add(exitButton2);
                
                mainPanel2.add(titlePanel2, BorderLayout.NORTH);
                mainPanel2.add(formPanel2, BorderLayout.CENTER);
                mainPanel2.add(buttonPanel2, BorderLayout.SOUTH);
                
                loginFrame.add(mainPanel2);
                loginFrame.setVisible(true);
            });
        });
        
        // Assemble main panel
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        
        menuFrame.add(mainPanel);
        menuFrame.setVisible(true);
    }
    
    private static void updateTotal(DefaultListModel<String> orderModel, JLabel totalLabel, JLabel discountLabel, boolean isStudent) {
        double total = 0.0;
        
        for (int i = 0; i < orderModel.size(); i++) {
            String item = orderModel.getElementAt(i);
            int start = item.indexOf("$") + 1;
            int end = item.indexOf(")", start);
            if (end == -1) end = item.length();
            try {
                double price = Double.parseDouble(item.substring(start, end));
                total += price;
            } catch (NumberFormatException e) {
                // Skip if price can't be parsed
            }
        }
        
        double discount = 0.0;
        if (isStudent) {
            discount = total * 0.10;
        }
        
        double finalTotal = total - discount;
        
        totalLabel.setText(String.format("Total: $%.2f", finalTotal));
        if (isStudent) {
            discountLabel.setText(String.format("Discount: $%.2f", discount));
        }
    }
}
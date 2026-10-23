/**
 * @(#)CoffeeTeaSystemGUI.java
 *
 *
 * @author
 * @version 1.00 2026/2/15
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CoffeeTeaSystemGUI extends JFrame {

    //instance variables @ global variables @ attributes @ data fields
    MenuItem[] coffeeItems;
    MenuItem[] teaItems;
    User admin;
    Order currentOrder;
    JPanel mainPanel;
    CardLayout cardLayout;
    JPanel loginPanel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    JButton exitButton;
    JPanel studentPanel;
    JButton yesButton;
    JButton noButton;
    JPanel menuPanel;
    JLabel studentLabel;
    JList coffeeList;
    JList teaList;
    DefaultListModel orderModel;
    JList orderList;
    JLabel totalLabel;
    JLabel discountLabel;
    JButton clearOrderBtn;
    JButton checkoutBtn;
    JButton exitMenuBtn;
    JButton addCoffeeBtn;
    JButton addTeaBtn;

    //default constructor
    public CoffeeTeaSystemGUI() {

        //initialize coffee items
        coffeeItems = new MenuItem[6];
        coffeeItems[0] = new MenuItem("Espresso", "Coffee", 3.50);
        coffeeItems[1] = new MenuItem("Americano", "Coffee", 3.00);
        coffeeItems[2] = new MenuItem("Cappuccino", "Coffee", 4.50);
        coffeeItems[3] = new MenuItem("Latte", "Coffee", 4.50);
        coffeeItems[4] = new MenuItem("Macchiato", "Coffee", 4.00);
        coffeeItems[5] = new MenuItem("Mocha", "Coffee", 5.00);

        //initialize tea items
        teaItems = new MenuItem[6];
        teaItems[0] = new MenuItem("Green Tea", "Tea", 2.50);
        teaItems[1] = new MenuItem("Black Tea", "Tea", 2.50);
        teaItems[2] = new MenuItem("Oolong Tea", "Tea", 3.00);
        teaItems[3] = new MenuItem("Chamomile Tea", "Tea", 3.00);
        teaItems[4] = new MenuItem("Matcha Latte", "Tea", 4.50);
        teaItems[5] = new MenuItem("Chai Latte", "Tea", 3.50);

        //initialize user and order
        admin = new User("admin", "admin123");
        currentOrder = new Order(false);

        //set up frame
        setTitle("Coffee & Tea Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //create main panel with card layout
        cardLayout = new CardLayout();
        mainPanel = new JPanel();
        mainPanel.setLayout(cardLayout);

        //create all screens
        createLoginScreen();
        createStudentScreen();
        createMenuScreen();

        //add screens to main panel
        mainPanel.add(loginPanel, "Login");
        mainPanel.add(studentPanel, "Student");
        mainPanel.add(menuPanel, "Menu");

        //add main panel to frame
        add(mainPanel);

        //show login screen first
        cardLayout.show(mainPanel, "Login");
    }

    //instance to create login screen
    public void createLoginScreen() {
        loginPanel = new JPanel();
        loginPanel.setLayout(new BorderLayout());
        loginPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        //title
        JLabel titleLabel = new JLabel("Login to Coffee & Tea System");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        //form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel userLabel = new JLabel("Username:");
        formPanel.add(userLabel, gbc);

        gbc.gridx = 1;
        usernameField = new JTextField(15);
        formPanel.add(usernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel passLabel = new JLabel("Password:");
        formPanel.add(passLabel, gbc);

        gbc.gridx = 1;
        passwordField = new JPasswordField(15);
        formPanel.add(passwordField, gbc);

        //button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        loginButton = new JButton("Login");
        exitButton = new JButton("Exit");
        buttonPanel.add(loginButton);
        buttonPanel.add(exitButton);

        //assemble
        loginPanel.add(titleLabel, BorderLayout.NORTH);
        loginPanel.add(formPanel, BorderLayout.CENTER);
        loginPanel.add(buttonPanel, BorderLayout.SOUTH);
    }

    //instance to create student screen
    public void createStudentScreen() {
        studentPanel = new JPanel();
        studentPanel.setLayout(new BorderLayout());
        studentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        //title
        JLabel titleLabel = new JLabel("Are you a student?");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        //message
        JLabel messageLabel = new JLabel("(Students get 10% discount!)");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        //center panel for message
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.add(messageLabel);

        //button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        yesButton = new JButton("Yes");
        noButton = new JButton("No");
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);

        //assemble
        studentPanel.add(titleLabel, BorderLayout.NORTH);
        studentPanel.add(centerPanel, BorderLayout.CENTER);
        studentPanel.add(buttonPanel, BorderLayout.SOUTH);
    }

    //instance to create menu screen
    public void createMenuScreen() {
        menuPanel = new JPanel();
        menuPanel.setLayout(new BorderLayout(10, 10));
        menuPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        //north panel - student label
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        studentLabel = new JLabel("Student (10% Discount Applied)");
        studentLabel.setFont(new Font("Arial", Font.BOLD, 14));
        studentLabel.setForeground(Color.BLUE);
        northPanel.add(studentLabel);

        //center panel - main content area
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 2, 10, 0));

        //left panel - coffee and tea menus
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout(5, 5));

        //coffee menu panel
        JPanel coffeePanel = new JPanel();
        coffeePanel.setLayout(new BorderLayout());
        coffeePanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.BLACK),
            "Coffee Menu",
            TitledBorder.LEFT,
            TitledBorder.TOP
        ));

        String[] coffeeStrings = new String[6];
        coffeeStrings[0] = "Espresso ($3.50)";
        coffeeStrings[1] = "Americano ($3.00)";
        coffeeStrings[2] = "Cappuccino ($4.50)";
        coffeeStrings[3] = "Latte ($4.50)";
        coffeeStrings[4] = "Macchiato ($4.00)";
        coffeeStrings[5] = "Mocha ($5.00)";

        coffeeList = new JList(coffeeStrings);
        coffeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        coffeeList.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane coffeeScroll = new JScrollPane(coffeeList);
        coffeeScroll.setPreferredSize(new Dimension(200, 150));
        coffeePanel.add(coffeeScroll, BorderLayout.CENTER);

        //tea menu panel
        JPanel teaPanel = new JPanel();
        teaPanel.setLayout(new BorderLayout());
        teaPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.BLACK),
            "Tea Menu",
            TitledBorder.LEFT,
            TitledBorder.TOP
        ));

        String[] teaStrings = new String[6];
        teaStrings[0] = "Green Tea ($2.50)";
        teaStrings[1] = "Black Tea ($2.50)";
        teaStrings[2] = "Oolong Tea ($3.00)";
        teaStrings[3] = "Chamomile Tea ($3.00)";
        teaStrings[4] = "Matcha Latte ($4.50)";
        teaStrings[5] = "Chai Latte ($3.50)";

        teaList = new JList(teaStrings);
        teaList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        teaList.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane teaScroll = new JScrollPane(teaList);
        teaScroll.setPreferredSize(new Dimension(200, 150));
        teaPanel.add(teaScroll, BorderLayout.CENTER);

        //add buttons below menus
        JPanel menuButtonPanel = new JPanel();
        menuButtonPanel.setLayout(new GridLayout(2, 1, 5, 5));

        JPanel coffeeButtonPanel = new JPanel();
        coffeeButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        addCoffeeBtn = new JButton("Add to Order");
        coffeeButtonPanel.add(addCoffeeBtn);

        JPanel teaButtonPanel = new JPanel();
        teaButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        addTeaBtn = new JButton("Add to Order");
        teaButtonPanel.add(addTeaBtn);

        menuButtonPanel.add(coffeeButtonPanel);
        menuButtonPanel.add(teaButtonPanel);

        //assemble left panel
        JPanel menusPanel = new JPanel();
        menusPanel.setLayout(new GridLayout(2, 1, 10, 10));
        menusPanel.add(coffeePanel);
        menusPanel.add(teaPanel);
        leftPanel.add(menusPanel, BorderLayout.CENTER);
        leftPanel.add(menuButtonPanel, BorderLayout.SOUTH);

        //right panel - current order
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout(5, 5));
        rightPanel.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.BLACK),
            "Current Order",
            TitledBorder.LEFT,
            TitledBorder.TOP
        ));

        //order list
        orderModel = new DefaultListModel();
        orderList = new JList(orderModel);
        orderList.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane orderScroll = new JScrollPane(orderList);
        orderScroll.setPreferredSize(new Dimension(200, 200));
        rightPanel.add(orderScroll, BorderLayout.CENTER);

        //bottom panel for totals and buttons
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout(5, 5));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        //totals panel
        JPanel totalsPanel = new JPanel();
        totalsPanel.setLayout(new GridLayout(2, 1, 5, 5));
        totalLabel = new JLabel("Total: $0.00");
        totalLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 14));
        discountLabel = new JLabel("Discount: $0.00");
        discountLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        discountLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        totalsPanel.add(totalLabel);
        totalsPanel.add(discountLabel);

        //buttons panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        clearOrderBtn = new JButton("Clear Order");
        checkoutBtn = new JButton("Checkout");
        exitMenuBtn = new JButton("Exit");

        buttonsPanel.add(clearOrderBtn);
        buttonsPanel.add(checkoutBtn);
        buttonsPanel.add(exitMenuBtn);

        bottomPanel.add(totalsPanel, BorderLayout.NORTH);
        bottomPanel.add(buttonsPanel, BorderLayout.CENTER);

        rightPanel.add(bottomPanel, BorderLayout.SOUTH);

        //add left and right to center panel
        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);

        //assemble menu panel
        menuPanel.add(northPanel, BorderLayout.NORTH);
        menuPanel.add(centerPanel, BorderLayout.CENTER);
    }

    //instance to show menu screen
    public void showMenuScreen(boolean s) {
        currentOrder = new Order(s);
        studentLabel.setVisible(s);
        discountLabel.setVisible(s);
        totalLabel.setText("Total: $0.00");
        discountLabel.setText("Discount: $0.00");
        cardLayout.show(mainPanel, "Menu");
    }

    //instance to show login screen
    public void showLoginScreen() {
        cardLayout.show(mainPanel, "Login");
    }

    //instance to show student screen
    public void showStudentScreen() {
        cardLayout.show(mainPanel, "Student");
    }

    //instance to update order display
    public void updateOrderDisplay() {
        if (orderModel != null) {
            orderModel.clear();
        }
        if (currentOrder != null) {
            for (int i = 0; i < currentOrder.getItemCount(); i++) {
                MenuItem item = currentOrder.getItems().get(i);
                orderModel.addElement(item.getDisplayString());
            }
            double total = currentOrder.calculateTotal();
            totalLabel.setText("Total: $" + total);

            if (currentOrder.getStudent() == true) {
                double discount = currentOrder.calculateDiscount();
                discountLabel.setText("Discount: $" + discount);
            }
        }
    }

    //main method
    public static void main(String[] args) {
        CoffeeTeaSystemGUI app = new CoffeeTeaSystemGUI();
        app.setVisible(true);
    }
}
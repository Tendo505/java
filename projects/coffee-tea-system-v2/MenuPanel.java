import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuPanel extends JPanel {
    private MenuData menuData;
    private MenuItem[] selectedItems;
    private double[] selectedQuantities;
    private int itemCount;
    private double discount;
    private JTextArea orderTextArea;
    private JLabel totalLabel;
    private JLabel discountLabel;

    public MenuPanel(CoffeeTeaApp app, MenuData menuData, boolean isStudent) {
        this.menuData = menuData;
        this.discount = isStudent ? 0.10 : 0.0;
        this.selectedItems = new MenuItem[20];
        this.selectedQuantities = new double[20];
        this.itemCount = 0;

        setLayout(new BorderLayout());

        // Top Panel - Title and Student Status
        JPanel topPanel = new JPanel();
        JLabel titleLabel = new JLabel("Coffee & Tea Menu");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        topPanel.add(titleLabel);

        if (isStudent) {
            JLabel discountStatusLabel = new JLabel("✓ Student (10% Discount Applied)");
            discountStatusLabel.setForeground(new Color(0, 100, 0));
            topPanel.add(discountStatusLabel);
        }

        add(topPanel, BorderLayout.NORTH);

        // Middle Panel - Menu Items
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(2, 1, 10, 10));
        menuPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        menuPanel.add(createMenuSection("Coffee Menu", menuData.getCoffeeMenu()));
        menuPanel.add(createMenuSection("Tea Menu", menuData.getTeaMenu()));

        add(menuPanel, BorderLayout.CENTER);

        // Right Panel - Order Summary
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createTitledBorder("Current Order"));
        rightPanel.setPreferredSize(new Dimension(250, 300));

        orderTextArea = new JTextArea(10, 20);
        orderTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(orderTextArea);
        rightPanel.add(scrollPane, BorderLayout.CENTER);

        // Bottom Panel - Total & Discount
        JPanel bottomRightPanel = new JPanel();
        bottomRightPanel.setLayout(new GridLayout(3, 1, 5, 5));
        bottomRightPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        totalLabel = new JLabel("Total: $0.00");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 12));
        bottomRightPanel.add(totalLabel);

        discountLabel = new JLabel("Discount: $0.00");
        discountLabel.setFont(new Font("Arial", Font.BOLD, 12));
        bottomRightPanel.add(discountLabel);

        JPanel buttonPanel = new JPanel();
        JButton checkoutButton = new JButton("Checkout");
        JButton clearButton = new JButton("Clear Order");
        JButton exitButton = new JButton("Exit");

        checkoutButton.addActionListener(e -> handleCheckout());
        clearButton.addActionListener(e -> handleClearOrder());
        exitButton.addActionListener(e -> {
            app.showLoginPanel();
        });

        buttonPanel.add(checkoutButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);

        bottomRightPanel.add(buttonPanel);
        rightPanel.add(bottomRightPanel, BorderLayout.SOUTH);

        add(rightPanel, BorderLayout.EAST);
    }

    private JPanel createMenuSection(String title, MenuItem[] items) {
        JPanel section = new JPanel();
        section.setLayout(new GridLayout(2, 3, 5, 5));
        section.setBorder(BorderFactory.createTitledBorder(title));

        for (MenuItem item : items) {
            JButton button = new JButton("<html>" + item.getName() + "<br>$" + String.format("%.2f", item.getPrice()) + "</html>");
            button.addActionListener(new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    addItemToOrder(item);
                }
            });
            section.add(button);
        }

        return section;
    }

    private void addItemToOrder(MenuItem item) {
        if (itemCount < selectedItems.length) {
            selectedItems[itemCount] = item;
            selectedQuantities[itemCount] = 1;
            itemCount++;
            updateOrderDisplay();
        }
    }

    private void updateOrderDisplay() {
        StringBuilder orderText = new StringBuilder();
        double subtotal = 0;

        for (int i = 0; i < itemCount; i++) {
            double price = selectedItems[i].getPrice() * selectedQuantities[i];
            subtotal += price;
            orderText.append(selectedItems[i].getName()).append(" x").append((int)selectedQuantities[i])
                    .append(": $").append(String.format("%.2f", price)).append("\n");
        }

        double discountAmount = subtotal * discount;
        double total = subtotal - discountAmount;

        orderTextArea.setText(orderText.toString());
        totalLabel.setText("Total: $" + String.format("%.2f", total));
        discountLabel.setText("Discount: $" + String.format("%.2f", discountAmount));
    }

    private void handleClearOrder() {
        itemCount = 0;
        selectedItems = new MenuItem[20];
        selectedQuantities = new double[20];
        updateOrderDisplay();
    }

    private void handleCheckout() {
        if (itemCount == 0) {
            JOptionPane.showMessageDialog(this, "Please add items to your order", "Empty Order", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double subtotal = 0;
        for (int i = 0; i < itemCount; i++) {
            subtotal += selectedItems[i].getPrice() * selectedQuantities[i];
        }

        double discountAmount = subtotal * discount;
        double total = subtotal - discountAmount;

        StringBuilder message = new StringBuilder("Order Summary:\n\n");
        for (int i = 0; i < itemCount; i++) {
            message.append(selectedItems[i].getName()).append(" x").append((int)selectedQuantities[i])
                    .append(": $").append(String.format("%.2f", selectedItems[i].getPrice() * selectedQuantities[i])).append("\n");
        }
        message.append("\n-------------------\n");
        message.append("Subtotal: $").append(String.format("%.2f", subtotal)).append("\n");
        message.append("Discount: $").append(String.format("%.2f", discountAmount)).append("\n");
        message.append("Total: $").append(String.format("%.2f", total)).append("\n");

        JOptionPane.showMessageDialog(this, message.toString(), "Checkout", JOptionPane.INFORMATION_MESSAGE);
        handleClearOrder();
    }
}

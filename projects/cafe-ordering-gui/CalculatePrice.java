//import package
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatePrice {

    public static void main(String[] args) {
        if (PrintOrder.printType.length() == 0) {
            PrintOrder.printType = "Color";
            PrintOrder.paperSize = "A4";
            PrintOrder.pages = 1;
            PrintOrder.quantity = 1;
        }
        showPrice();
    }

    public static void showPrice() {
        final JFrame frame = new JFrame("Calculate Price");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 420);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("CALCULATE PRICE", JLabel.CENTER);
        JLabel printLabel = new JLabel("Printing Type:");
        JLabel paperLabel = new JLabel("Paper Size:");
        JLabel pagesLabel = new JLabel("Pages:");
        JLabel quantityLabel = new JLabel("Quantity:");
        JLabel unitLabel = new JLabel("Unit Price:");
        JLabel totalLabel = new JLabel("Total Price:");
        JLabel printValue = new JLabel(PrintOrder.printType);
        JLabel paperValue = new JLabel(PrintOrder.paperSize);
        JLabel pagesValue = new JLabel(String.valueOf(PrintOrder.pages));
        JLabel quantityValue = new JLabel(String.valueOf(PrintOrder.quantity));
        JLabel unitValue = new JLabel();
        JLabel totalValue = new JLabel();
        JLabel messageLabel = new JLabel("Price calculated successfully.");

        JButton receiptBtn = new JButton("Generate Receipt");
        JButton backBtn = new JButton("Back");

        double unitPrice = 0.0;
        if (PrintOrder.printType.equals("Color") && PrintOrder.paperSize.equals("A4")) {
            unitPrice = 0.50;
        } else if (PrintOrder.printType.equals("Color") && PrintOrder.paperSize.equals("A3")) {
            unitPrice = 1.00;
        } else if (PrintOrder.printType.equals("Black & White") && PrintOrder.paperSize.equals("A4")) {
            unitPrice = 0.20;
        } else if (PrintOrder.printType.equals("Black & White") && PrintOrder.paperSize.equals("A3")) {
            unitPrice = 0.40;
        }

        final double totalPrice = unitPrice * PrintOrder.pages * PrintOrder.quantity;

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.BLUE);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Sans", Font.BOLD, 14));
        titlePanel.add(titleLabel);

        JPanel formPanel = new JPanel(new GridLayout(7, 2, 10, 10));
        formPanel.setBackground(Color.BLUE);
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        JLabel[] labels = {printLabel, paperLabel, pagesLabel, quantityLabel, unitLabel, totalLabel};
        for (int i = 0; i < labels.length; i++) {
            labels[i].setForeground(Color.WHITE);
        }

        JLabel[] values = {printValue, paperValue, pagesValue, quantityValue, unitValue, totalValue, messageLabel};
        for (int i = 0; i < values.length; i++) {
            values[i].setForeground(Color.WHITE);
        }

        unitValue.setText("RM " + String.format("%.2f", unitPrice));
        totalValue.setText("RM " + String.format("%.2f", totalPrice));
        totalValue.setForeground(new Color(100, 200, 0));
        totalValue.setFont(new Font("Sans", Font.BOLD, 14));
        messageLabel.setForeground(new Color(100, 200, 0));

        formPanel.add(printLabel);
        formPanel.add(printValue);
        formPanel.add(paperLabel);
        formPanel.add(paperValue);
        formPanel.add(pagesLabel);
        formPanel.add(pagesValue);
        formPanel.add(quantityLabel);
        formPanel.add(quantityValue);
        formPanel.add(unitLabel);
        formPanel.add(unitValue);
        formPanel.add(totalLabel);
        formPanel.add(totalValue);
        formPanel.add(new JLabel());
        formPanel.add(messageLabel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.BLACK);

        JButton[] buttons = {receiptBtn, backBtn};
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBackground(new Color(59, 130, 246));
            buttons[i].setForeground(Color.WHITE);
        }

        buttonPanel.add(receiptBtn);
        buttonPanel.add(backBtn);

        receiptBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String orderId = JOptionPane.showInputDialog(null, "Enter Order ID:");

                if (orderId == null) {
                    return;
                }

                orderId = orderId.trim();
                if (orderId.length() == 0) {
                    JOptionPane.showMessageDialog(null, "Order ID cannot be empty.", "Input Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                frame.dispose();
                GenerateReceipt.showReceipt(orderId, PrintOrder.printType, PrintOrder.paperSize,
                        PrintOrder.pages, PrintOrder.quantity, totalPrice);
            }
        });

        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                PrintOrder.showOrder();
            }
        });

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
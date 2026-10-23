//import package
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrintOrder {

    static String printType = "";
    static String paperSize = "";
    static int pages = 0;
    static int quantity = 0;

    public static void main(String[] args) {
        showOrder();
    }

    public static void showOrder() {
        final JFrame frame = new JFrame("Start Printing Order");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 420);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("START PRINTING ORDER", JLabel.CENTER);
        JLabel printLabel = new JLabel("PRINTING TYPE");
        JLabel paperLabel = new JLabel("PAPER SIZE");
        JLabel pagesLabel = new JLabel("NO. of Pages");
        JLabel quantityLabel = new JLabel("QUANTITY");
        final JLabel messageLabel = new JLabel(" ");

        final JRadioButton colorPrint = new JRadioButton("Color");
        final JRadioButton bwPrint = new JRadioButton("Black & White");
        final JRadioButton a4Size = new JRadioButton("A4");
        final JRadioButton a3Size = new JRadioButton("A3");

        final JTextField pagesField = new JTextField(30);
        final JTextField quantityField = new JTextField(30);

        JButton confirmBtn = new JButton("Confirm");
        JButton clearBtn = new JButton("Clear");
        JButton backBtn = new JButton("Back");

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.BLUE);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Sans", Font.BOLD, 14));
        titlePanel.add(titleLabel);

        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBackground(Color.BLUE);
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        ButtonGroup printGroup = new ButtonGroup();
        printGroup.add(colorPrint);
        printGroup.add(bwPrint);

        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(a4Size);
        sizeGroup.add(a3Size);

        JPanel printPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        printPanel.setBackground(Color.BLUE);
        printPanel.add(colorPrint);
        printPanel.add(bwPrint);

        JPanel paperPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        paperPanel.setBackground(Color.BLUE);
        paperPanel.add(a4Size);
        paperPanel.add(a3Size);

        JRadioButton[] radioButtons = {colorPrint, bwPrint, a4Size, a3Size};
        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i].setBackground(Color.BLACK);
            radioButtons[i].setForeground(Color.WHITE);
        }

        JLabel[] labels = {printLabel, paperLabel, pagesLabel, quantityLabel};
        for (int i = 0; i < labels.length; i++) {
            labels[i].setForeground(Color.WHITE);
        }

        JTextField[] textFields = {pagesField, quantityField};
        for (int i = 0; i < textFields.length; i++) {
            textFields[i].setBackground(new Color(15, 23, 42));
            textFields[i].setForeground(Color.WHITE);
        }

        JButton[] buttons = {confirmBtn, clearBtn, backBtn};
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBackground(new Color(59, 130, 246));
            buttons[i].setForeground(Color.WHITE);
        }

        formPanel.add(printLabel);
        formPanel.add(printPanel);
        formPanel.add(paperLabel);
        formPanel.add(paperPanel);
        formPanel.add(pagesLabel);
        formPanel.add(pagesField);
        formPanel.add(quantityLabel);
        formPanel.add(quantityField);
        formPanel.add(new JLabel());
        formPanel.add(messageLabel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.add(confirmBtn);
        buttonPanel.add(clearBtn);
        buttonPanel.add(backBtn);

        confirmBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!colorPrint.isSelected() && !bwPrint.isSelected()) {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Please select a print type!");
                    return;
                }

                if (!a4Size.isSelected() && !a3Size.isSelected()) {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Please select paper size!");
                    return;
                }

                String pagesStr = pagesField.getText().trim();
                String quantityStr = quantityField.getText().trim();

                if (pagesStr.length() == 0 || quantityStr.length() == 0) {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Please fill all fields!");
                    return;
                }

                try {
                    if (colorPrint.isSelected()) {
                        printType = "Color";
                    } else {
                        printType = "Black & White";
                    }

                    if (a4Size.isSelected()) {
                        paperSize = "A4";
                    } else {
                        paperSize = "A3";
                    }

                    pages = Integer.parseInt(pagesStr);
                    quantity = Integer.parseInt(quantityStr);

                    if (pages <= 0 || quantity <= 0) {
                        messageLabel.setForeground(Color.RED);
                        messageLabel.setText("Numbers must be more than 0!");
                        return;
                    }

                    frame.dispose();
                    CalculatePrice.showPrice();

                } catch (NumberFormatException ex) {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Please enter valid numbers!");
                }
            }
        });

        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPrint.setSelected(false);
                bwPrint.setSelected(false);
                a4Size.setSelected(false);
                a3Size.setSelected(false);
                pagesField.setText("");
                quantityField.setText("");
                messageLabel.setText("");
            }
        });

        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MainMenu.showMainMenu();
            }
        });

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
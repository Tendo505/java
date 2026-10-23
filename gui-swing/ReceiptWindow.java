/**
 * @(#)ReceiptWindow.java
 *
 * Displays a receipt after checkout
 * Demonstrates: BorderLayout, GridLayout, FlowLayout,
 *               JPanel sub-containers, Color & Font customization
 * @author
 * @version 2.00 2026/2/25
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWindow extends JFrame implements ActionListener {

    // ── Colours ──────────────────────────────────────────────────────────────
    private static final Color BG_DARK   = new Color(40,  40,  60);
    private static final Color BG_RECEIPT= new Color(255, 255, 240); // cream
    private static final Color ACCENT    = new Color(255, 183,  77);
    private static final Color GREEN_BTN = new Color(70,  180, 100);
    private static final Color FG_DARK   = new Color(40,  40,  60);
    private static final Color DISCOUNT_COLOR = new Color(50, 160, 80);

    // ── Fonts ─────────────────────────────────────────────────────────────────
    private static final Font FONT_STORE   = new Font("Arial", Font.BOLD,  16);
    private static final Font FONT_DATE    = new Font("Arial", Font.PLAIN, 12);
    private static final Font FONT_ROW     = new Font("Arial", Font.PLAIN, 14);
    private static final Font FONT_TOTAL   = new Font("Arial", Font.BOLD,  16);
    private static final Font FONT_THANKS  = new Font("Arial", Font.ITALIC, 13);
    private static final Font FONT_BUTTON  = new Font("Arial", Font.BOLD,  13);

    private JButton closeBtn = new JButton("Close");

    public ReceiptWindow(double finalTotal, double discount, boolean isStudent) {
        setTitle("Receipt");
        setSize(380, isStudent ? 320 : 280);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // ── Root: BorderLayout ────────────────────────────────────────────────
        JPanel rootPanel = new JPanel(new BorderLayout(0, 0));
        rootPanel.setBackground(BG_DARK);

        // ── NORTH: store header (JPanel sub-container + FlowLayout) ───────────
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 12));
        headerPanel.setBackground(BG_DARK);

        JLabel storeLabel = new JLabel("☕  Coffee & Tea Management System");
        storeLabel.setFont(FONT_STORE);
        storeLabel.setForeground(ACCENT);
        headerPanel.add(storeLabel);
        rootPanel.add(headerPanel, BorderLayout.NORTH);

        // ── CENTER: receipt card (JPanel sub-container, GridLayout for rows) ──
        JPanel receiptCard = new JPanel(new BorderLayout(0, 0));
        receiptCard.setBackground(BG_RECEIPT);
        receiptCard.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(ACCENT, 2),
                BorderFactory.createEmptyBorder(14, 22, 14, 22)));

        // Timestamp row (FlowLayout inside the card)
        JPanel datePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        datePanel.setBackground(BG_RECEIPT);
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd MMM yyyy   HH:mm:ss"));
        JLabel dateLabel = new JLabel(timestamp);
        dateLabel.setFont(FONT_DATE);
        dateLabel.setForeground(FG_DARK);
        datePanel.add(dateLabel);
        receiptCard.add(datePanel, BorderLayout.NORTH);

        // Amounts grid (GridLayout)
        int rows = isStudent ? 3 : 1;
        JPanel amountsGrid = new JPanel(new GridLayout(rows, 2, 8, 10));
        amountsGrid.setBackground(BG_RECEIPT);
        amountsGrid.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        if (isStudent) {
            double originalTotal = finalTotal + discount;
            addRow(amountsGrid, "Subtotal:", String.format("$%.2f", originalTotal),
                    FONT_ROW, FG_DARK, FG_DARK);
            addRow(amountsGrid, "Discount (10%):", String.format("-$%.2f", discount),
                    FONT_ROW, FG_DARK, DISCOUNT_COLOR);
        }
        addRow(amountsGrid, "Total Paid:", String.format("$%.2f", finalTotal),
                FONT_TOTAL, FG_DARK, FG_DARK);

        receiptCard.add(amountsGrid, BorderLayout.CENTER);

        // Thank-you message
        JPanel thanksPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        thanksPanel.setBackground(BG_RECEIPT);
        JLabel thanksLabel = new JLabel("Thank you for your purchase! 🙏");
        thanksLabel.setFont(FONT_THANKS);
        thanksLabel.setForeground(FG_DARK);
        thanksPanel.add(thanksLabel);
        receiptCard.add(thanksPanel, BorderLayout.SOUTH);

        // Wrap card in a padded panel
        JPanel cardWrapper = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 8));
        cardWrapper.setBackground(BG_DARK);
        cardWrapper.add(receiptCard);
        rootPanel.add(cardWrapper, BorderLayout.CENTER);

        // ── SOUTH: close button (JPanel sub-container + FlowLayout) ───────────
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 12));
        btnPanel.setBackground(BG_DARK);

        closeBtn.setFont(FONT_BUTTON);
        closeBtn.setBackground(GREEN_BTN);
        closeBtn.setForeground(Color.WHITE);
        closeBtn.setFocusPainted(false);
        closeBtn.setBorder(BorderFactory.createEmptyBorder(8, 36, 8, 36));
        closeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        closeBtn.addActionListener(this);

        btnPanel.add(closeBtn);
        rootPanel.add(btnPanel, BorderLayout.SOUTH);

        add(rootPanel);
    }

    /** Add a label-value row into a GridLayout panel. */
    private void addRow(JPanel grid, String label, String value,
                        Font font, Color labelColor, Color valueColor) {
        JLabel lbl = new JLabel(label);
        lbl.setFont(font);
        lbl.setForeground(labelColor);

        JLabel val = new JLabel(value, SwingConstants.RIGHT);
        val.setFont(font);
        val.setForeground(valueColor);

        grid.add(lbl);
        grid.add(val);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == closeBtn) dispose();
    }
}

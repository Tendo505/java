import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class OrderHistoryFrame5 extends JFrame implements ActionListener
{
	JPanel p1=new JPanel();
	JPanel p2=new JPanel(new FlowLayout());
	JTextArea ordersArea=new JTextArea(10, 25);
	JButton exit=new JButton ("EXIT");
    JButton menu=new JButton ("Main Menu");
	Border lineBorder=new LineBorder(Color.BLACK,3);
    Border lineBorder2=new LineBorder(Color.BLACK,5);
    public OrderHistoryFrame5 (String orderDetails)
    {
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        ordersArea.setText(orderDetails);
        ordersArea.setEditable(false);
        p1.add(ordersArea);
        p1.setBorder(lineBorder);
        p2.add(exit);
        p2.add(menu);
        p2.setBorder(lineBorder);
        con.add(p1, BorderLayout.CENTER);
        con.add(p2, BorderLayout.SOUTH);
        exit.addActionListener(this);
        menu.addActionListener(this);
        setTitle("Order History");
        setBounds(100, 100, 400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        }
        public void actionPerformed(ActionEvent event)
{
	    if(event.getSource() == exit) {
           System.exit(0);
}
else if (event.getSource() == menu) {
                setVisible(false);
                MainMenu mm = new MainMenu(false);
                mm.setTitle("Coffee and Tea System");
                mm.setBounds(100, 100, 820, 550);
                mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mm.setVisible(true); }
}
}
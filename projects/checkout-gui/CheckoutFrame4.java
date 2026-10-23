import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class CheckoutFrame4 extends JFrame implements ActionListener {

    //components
    JLabel title=new JLabel("Your Order");
    JTextArea orderArea=new JTextArea();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel(new BorderLayout());
	JPanel p3=new JPanel();
	JLabel total=new JLabel();
	JLabel afterDiscount=new JLabel();
    JButton exit=new JButton("Exit");
	JButton nxtbtn = new JButton("Next");

    //font and border
	Font largeFont=new Font("Forte", Font.BOLD+Font.ITALIC, 15);
	Border lineBorder=new LineBorder(Color.BLACK,3);

    //constructor with parameters
	public CheckoutFrame4 (String orderDetails, double totalPrice)
	{
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		orderArea.setEditable(false);
		orderArea.setText(orderDetails);
		total.setText("Total RM " +totalPrice);

		//calculate discount 10%
		double discountRate=0.10;
		double discountPrice=totalPrice*(1-discountRate);
		afterDiscount.setText("After Discount RM " +discountPrice);

        //p1 (top)
		p1.add(title);
		title.setFont(largeFont);
		p1.setBorder(lineBorder);

        //p2 (center)
		p2.add(orderArea, BorderLayout.CENTER);
		p2.setBorder(lineBorder);

        //p3 (bottom)
        p3.add(total);
        p3.add(afterDiscount);
		p3.add(exit);
		p3.add(nxtbtn);
		p3.setBorder(lineBorder);

        //add panels to frame
    	con.add(p1, BorderLayout.NORTH);
	    con.add(p2, BorderLayout.CENTER);
	    con.add(p3, BorderLayout.SOUTH);
	    exit.addActionListener(this);
        nxtbtn.addActionListener(this);
	    setTitle("Checkout");
	    setSize(500, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
    //button action
	public void actionPerformed(ActionEvent event) {
    	Object source=event.getSource();
    	if(source == exit) {
    		setVisible(false);
    	}
		else if (source == nxtbtn) {
			setVisible(false);
			OrderHistoryFrame5 ohf = new OrderHistoryFrame5(orderArea.getText());
			ohf.setTitle("Order History");
			ohf.setBounds(100, 100, 400, 300);
			ohf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ohf.setVisible(true);
		}
    }
}
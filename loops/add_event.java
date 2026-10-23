import java.awt.*;
import java.awt.event.*;  //to import event class
import javax.swing.*;
import javax.swing.border.*;

public class add_event extends JFrame implements ActionListener
{
	JLabel title=new JLabel("Simple Calculator");
	JLabel prompt=new JLabel("Please enter two integer numbers:");
	JPanel p1=new JPanel(new GridLayout(2,1));
	JPanel p2=new JPanel(new GridLayout(3,2));
	JPanel p3=new JPanel(new GridLayout(5,1));
	JLabel first_no=new JLabel("First number:");
	JLabel second_no=new JLabel("Second number:");
	JLabel ans=new JLabel("Answer:");
	JTextField num1=new JTextField("",5);
	JTextField num2=new JTextField("",5);
	JTextField result=new JTextField("",5);
	JButton sumB=new JButton("+");
	JButton mulB=new JButton("*");
	JButton subB=new JButton("-");
	JButton exit=new JButton("Exit");
	JButton result_win=new JButton("Sum(In Other Window):");
    Font largeFont=new Font("Forte",Font.BOLD+Font.ITALIC,30);
    Font smallFont=new Font("SansSerif",Font.BOLD,20);
    Border lineBorder=new LineBorder(Color.BLACK,3);
    Border lineBorder2=new LineBorder(Color.RED,5);

	add_event()
	{
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		//con.setBorder(lineBorder);

    	p1.add(title);
    	p1.add(prompt);
    	//p1.setBorder(lineBorder2);
    	title.setFont(largeFont);
        prompt.setFont(smallFont);

    	p2.add(first_no);
    	p2.add(num1);
    	p2.add(second_no);
    	p2.add(num2);
    	p2.add(ans);
    	p2.add(result);
    	p2.setBackground(Color.GREEN);
    	p2.setBorder(new TitledBorder("Calculator Form"));
        first_no.setBorder(lineBorder);
        second_no.setBorder(lineBorder2);
        p2.setBorder(lineBorder);

    	sumB.setBackground(Color.RED);
    	mulB.setBackground(Color.PINK);
    	result_win.setForeground(Color.BLUE);
    	result_win.setBackground(Color.CYAN);
    	exit.setForeground(Color.BLUE);

        p3.add(sumB);
        p3.add(mulB);
        p3.add(subB);
        p3.add(result_win);
        p3.add(exit);

        con.add(p1,BorderLayout.NORTH);
        con.add(p2,BorderLayout.CENTER);
        con.add(p3,BorderLayout.EAST);
        //con.setBorder(lineBorder2);

        sumB.addActionListener(this);
        mulB.addActionListener(this);
        subB.addActionListener(this);
        exit.addActionListener(this);
        result_win.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event)
    {
    	Object source=event.getSource();


        int number1 = Integer.parseInt(num1.getText().trim());
        int number2 = Integer.parseInt(num2.getText().trim());
    	//sum
    	if (source==sumB)
    	{
    		int result_sum = number1+number2;
        	result.setText(String.valueOf(result_sum));
        }

        //multiply
        else if (source==mulB)
        {
    		int result_sum = number1*number2;
            result.setText(String.valueOf(result_sum));
        }

        //substract
        else if (source==subB)
        {
    	   	int result_sum = number1-number2;
        	result.setText(String.valueOf(result_sum));
        }

        else if(source==result_win)
        {
            Calc_result frame2=new Calc_result(number1,number2);
            frame2.setTitle("Calculator: Answer");
            frame2.show();
			//frame2.setSize(100,100);
			frame2.setBounds(100,100,500,350);

        }

        //if (source==exit){
    	else
    	{
    	System.exit(0);
        }

  }

    public static void main(String[]args)
    {
    	add_event app=new add_event();
    	app.setTitle("Simple Calculator");
    	app.setBounds(100,100,400,300);
    	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	app.setVisible(true);
    }
}//close for class









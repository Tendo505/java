import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

public class frame {
    public static void main (String [] args) {
        
        JLabel label = new JLabel(); //creates a label
        label.setText("Bro,do you even code?"); //set text for label

        //JFrame a GUI window to add component

        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here"); //title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevent from being resized
        frame.setSize(420,420); //sets the x dimension, and y dimension frame
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("itachi.png"); //creates and image icon of the frame
        frame.setIconImage(image.getImage()); //change the icon of the frame
        frame.getContentPane().setBackground(Color.blue);



    }
}

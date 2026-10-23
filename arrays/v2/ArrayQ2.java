//package
import javax.swing.JOptionPane;
public class ArrayQ2 {
    public static void main(String[] args) {
        
        //declaration
        int[] numbers = new int[10];
        
        //Read inputs from user
        for (int i = 0; i < numbers.length; i++) {
            String numString = JOptionPane.showInputDialog(null, "Enter number " + (i + 1) + ":");
            //Convert string to integer
            numbers[i] = Integer.parseInt(numString);
        }
        
        //output the numbers in reverse order
        System.out.println("Numbers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + "  ");
        }
        
    } //close for main
} //close for class
/**
 * @(#)AP1CH3.java
 *
 *
 * @author
 * @version 1.00 2026/4/30
 */

//import package
import java.util.*;
public class AP1CH3 {
    public static void main(String[]args) {
        //call method
        processNumber();
    }

//formal parameter for processNumber method
public static int processNumber() {
    //create scanner obj
        Scanner input1 = new Scanner(System.in);
        //ask user for input
        try {
        System.out.println("Enter first number: ");
        int num = input1.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input1.nextInt();
       
        //condition if user input less than 0
        if (num < 0 || num2 < 0)
            //display error message
            catch (ArithmeticException e) {
                System.out.println("Kena lebih dari 0");
            }
            
        }
}
//method to calculate sum and average
public static int sumAv(int num, int num2) {
    System.out.println("Sum is: " + (num + num2));
    System.out.println("Average is: " + (num + num2) / 2);

}
}   

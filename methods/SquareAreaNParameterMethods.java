/**
 * @(#)SquareAreaNParameterMethods.java
 *
 *
 * @author 
 * @version 1.00 2026/1/8
 */

import javax.swing.JOptionPane;
public class SquareAreaNParameterMethods {

    public static void main (String[] args) {
    	
    	//declare variables
    	String lengthIn,widthIn;
    	double length,width;
    	
    	//ask user for input
    	lengthIn = JOptionPane.showInputDialog (null,"Enter length:");
    	length = Double.parseDouble(lengthIn);
    	
    	widthIn = JOptionPane.showInputDialog (null, "Enter width:");
    	width = Double.parseDouble(widthIn);
    	
    	//call methods square area and parameter + display
    	double area = squareArea(length,width);
    	JOptionPane.showMessageDialog (null,"Your Square Area is " + area);
    	
    	//for square parameter
    	double perimeter = squarePerimeter(length,width);
    	JOptionPane.showMessageDialog (null, "Your Square Perimeter is " + perimeter);
    	
    }
      //method to calculate area
    //formal parameters: length and width
    public static double squareArea(double length, double width) {
        return length * width;
    }
    
    //method to calculate perimeter
    //formal parameters: length and width
    public static double squarePerimeter(double length, double width) {
        return 2 * (length * width);
    }
}
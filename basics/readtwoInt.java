/**
 * @(#)readtwoInt.java
 *
 *
 * @author 
 * @version 1.00 2025/12/22
 */

import javax.swing.JOptionPane;
public class readtwoInt {

    public static void main (String [] args) {
    	//declare variable 
    	String Num1,Num2;
    	int num1,num2,sum,product;
    	double average;
    	
    	//ask user input
    	Num1 = JOptionPane.showInputDialog (null,"Enter first integer: ");
    	Num2 = JOptionPane.showInputDialog (null,"Enter second integer: ");
    	
    	//convert string to int
    	num1 = Integer.parseInt(Num1);
    	num2 = Integer.parseInt(Num2);
    	
    	//calculate 
    	sum = num1 + num2;
    	product = num1 *num2;
    	average = num1 + num2 / 2;
    	
    	
    	
    	//Display
    	JOptionPane.showMessageDialog (null, "Total sum is:" + sum + "Total product is:" + product + "Total average is:" + average);
    	
    }
    }
    
    

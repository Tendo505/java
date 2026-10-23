/**
 * @(#)APC1V5.java
 *
 *
 * @author
 * @version 1.00 2026/5/12
 */

import java.util.Scanner;
public class APC1V5 {
    public static void main (String[] args){
    	int [][] A = getArray(); // get array
        Display(A); //call display A method
    }

    //formal method for get array
    public static int [][] getArray() {
    	Scanner input = new Scanner (System.in);

    	//Enter Array Value
    	int [][] A = new int [3][2];
    	System.out.println ("Enter 6 num");
    	for (int i = 0; i<A.length; i++) {
    		for (int j = 0; j < A[i].length; j++)
    			A[i][j] = input.nextInt();
    	}

    		return A;
    }

    //process for average
    public static double average(int [][] A) {
    	int average = 0;
    	int sum = 0;
    	for (int i = 0; i < A.length; i++) {
    		for (int j = 0; j < A[i].length; j++){

    			sum +=A[i][j];
    			average++;
    		}
    }

    return (double)sum / average;
    }

    //process for sum
    public static int sum(int [][] A) {
    	int sum = 0;
    	for (int i = 0; i < A.length; i++) {
    		for (int j = 0; j < A[i].length; j++){

    			sum +=A[i][j];
    		}
    }

    return sum;
    }

    //formal method for display
    public static void Display (int [][] A){
    	System.out.println ("The Average value is: " + average(A));
    	System.out.println ("The Sum value is: " + sum(A));
    }

} //close class
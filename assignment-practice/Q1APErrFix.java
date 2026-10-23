/**
 * @(#)Q1APErrFix.java
 *
 *
 * @author
 * @version 1.00 2026/5/4
 */


/* This is Q1 UPDATED VERSION

 DIFFERENCE
 1.Using JOptionPane
 2.Seperated Input, Process and Output Method

 */

//import package
import javax.swing.JOptionPane;

public class Q1APErrFix {

    //Actual Parameter
    public static void main(String[] args) {

    	//Get Array for
        int[][] A = getArray();
        maxProcess(A);
        minProcess(A);
        averageProcess(A);
        positiveNeg(A);
        Above80(A);
        Below20(A);
        Display(A);

    }
    //Input User
    public static int[][] getArray() {
        int[][] A = new int[3][4];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                String input = JOptionPane.showInputDialog("Enter number:");
                A[i][j] = Integer.parseInt(input);
            }
        }
        return A;
    }

    //Local for maxProcess
    public static int maxProcess(int[][] A) {
        //declare and initialize max
        int max = A[0][0];
        for (int i = 0; i < A.length; i++) {
        	for(int j = 0; j < A[i].length; j++){
        		int num = A[i][j];
        		if (num > max)
        			max = num;
        }
        }
        return max;
    }

     //Local for minProcess
    public static int minProcess(int[][] A) {
        //declare and initialize min
        int min = A[0][0];
        for (int i = 0; i < A.length; i++) {
        	for(int j = 0; j < A[i].length; j++){
        		int num = A[i][j];
        		if (num < min)
        			min = num;
        }
        }
        return min;
    }

     //Local for totalProcess
    public static int totalProcess(int[][] A) {
        //declare and initialize total
        int total = A[0][0];
        for (int i = 0; i < A.length; i++) {
        	for(int j = 0; j < A[i].length; j++){
        		int num = A[i][j];
        	total+= num;
        }
        }
        return total;
    }
   //Local for averageProcess
    public static int averageProcess(int[][] A) {
        //declare and initialize average
        int average = A[0][0];
        int count = A[0][0];
        for (int i = 0; i < A.length; i++) {
        	for(int j = 0; j < A[i].length; j++){
        		int num = A[i][j];

        		count += num;

        }
        }
        return (count + average) / 2;
    }


//Local for positiveNegProcess
    public static int positiveNegProcess(int[][] A) {
        //declare and initialize positive and negative
        int positive = A[0][0];
        int negative = A[0][0];
        for (int i = 0; i < A.length; i++) {
        	for(int j = 0; j < A[i].length; j++){
        		int num = A[i][j];

        		if (int[0][0] A > 0) {
        			int[0][0] A = positive;
        		}

        			else{
        				int[0][0] A = negative;
        			}
        }
        }
        return positiveNeg;
    }


    //Local for above80
    public static int Above80(int[][] A) {
        //declare and initialize above 80
        int Above80 = A[0][0];
        for (int i = 0; i < A.length; i++) {
        	for(int j = 0; j < A[i].length; j++){
        		int num = A[i][j];

        		if (int[0][0] A > 80) {
        			int[0][0] A = Above80;
        		}
        }
        }
        return Above80++;
    }

    //Local for below20
    public static int Below20(int[][] A) {
        //declare and initialize below20
        int Below20 = A[0][0];
        for (int i = 0; i < A.length; i++) {
        	for(int j = 0; j < A[i].length; j++){
        		int num = A[i][j];

        		if (int[0][0] A < 20) {
        			int[0][0] A = Below20;
        		}
        }
        }
        return Below20++;
    }



    //Local for displayArr
    public static void displayArr(int[][]A) {
    //Display
        JOptionPane.showMessageDialog(null, "Max: " + max + "\n" + "Min: " + min +
        	"\n" + "Total: " + total + "\n" + "Positive: " + positive + "\n" + "Negative: " + negative +
        		 "\n" + "Above 80: " + above80 + "\n" + "Below 20: " + below20);
    }
}
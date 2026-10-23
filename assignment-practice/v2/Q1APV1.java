/*  Q1APV1.java 
          UPDATED VERSION
    - uses JOptionPane for input and output
    - added displayArr() method to display results
    - declared num outside loop
*/

import javax.swing.JOptionPane;

public class Q1APV1 {

    public static void main(String[] args) {
        //Get array
        int[][] A = getArray();   
        processArray(A);    //Call method to process data    
    }

    //Get Array method and input user
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

    //Method to process data
    public static void processArray(int[][] A) {

        int max = A[0][0];
        int min = A[0][0];
        int total = 0;
        int positive = 0, negative = 0;
        int above80 = 0, below20 = 0;
        int num;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                num = A[i][j];

                total += num;

                if (num > max) max = num;
                if (num < min) min = num;
                if (num > 0) positive++;
                if (num < 0) negative++;
                if (num > 80) above80++;
                if (num < 20) below20++;
            }
        }

        //Call displayArr method to show results
        displayArr(max, min, total, positive, negative, above80, below20);
    }

    //Method to display results
    public static void displayArr(int max, int min, int total,int positive, int negative, int above80, int below20) {

        JOptionPane.showMessageDialog(null,
            "Max: " + max + "\n" +
            "Min: " + min + "\n" +
            "Total: " + total + "\n" +
            "Positive: " + positive + "\n" +
            "Negative: " + negative + "\n" +
            "Above 80: " + above80 + "\n" +
            "Below 20: " + below20
        );
    }
}
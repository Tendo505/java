/* This is Q1 UPDATED VERSION

 DIFFERENCE
 1.Using JOptionPane
 2.Seperated Input, Process and Output Method

 */

//import package
import javax.swing.JOptionPane;

public class Q1APV1 {

    //Actual Parameter
    public static void main(String[] args) {

    	//Get Array for
        int[][] A = getArray();
        processArray(A);
        
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

    //Local for processArray
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

        //Call display method
        displayArr(max, min, total, positive, negative, above80, below20);

    //Local for displayArr
    public static void displayArr(int max, int min, int total,
                                  int positive, int negative,
                                  int above80, int below20) {
    //Display
        JOptionPane.showMessageDialog(null, "Max: " + max + "\n" + "Min: " + min +
        	"\n" + "Total: " + total + "\n" + "Positive: " + positive + "\n" + "Negative: " + negative +
        		 "\n" + "Above 80: " + above80 + "\n" + "Below 20: " + below20);
    }
}
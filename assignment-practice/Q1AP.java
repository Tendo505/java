//import package
import java.util.Scanner;
public class Q1AP {

	//Actual parameter
    public static void main (String[] args) {
      //get array
      int [][] A = getArray();
      processArray(A);
    }
    //Formal parameter
    public static int[][] getArray() {

    //Create new object scanner
        Scanner input = new Scanner(System.in);

        //Declare an array and enter array value row and collumn
        int [][] A = new int [3][4];

    //Input user
        System.out.println("Enter 12 numbers:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = input.nextInt();
            }
        }
        return A;
    }
    //Process and output
    public static void processArray(int[][] A) {
        int max = A[0][0];
        int min = A[0][0];
        int total = 0;
        int positive = 0, negative = 0;
        int above80 = 0, below20 = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++)
                 {
                int num = A[i][j];

                total += num;

                if (num > max) max = num;
                if (num < min) min = num;
                if (num > 0) positive++;
                if (num < 0) negative++;
                if (num > 80) above80++;
                if (num < 20) below20++;
            }
      //Display
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Total: " + total);
        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
        System.out.println("Above 80 count: " + above80);
        System.out.println("Below 20 count: " + below20);

}
}
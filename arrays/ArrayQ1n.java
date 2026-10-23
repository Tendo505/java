import javax.swing.JOptionPane;

public class ArrayQ1n {
    public static void main(String[] args) {
        
        //declaration
        int[] numbers = new int[10];
        
        //Read inputs from user
        for (int i = 0; i < numbers.length; i++) {
            String numString = JOptionPane.showInputDialog(null, "Enter number " + (i + 1) + ":");
            //Convert string to integer
            numbers[i] = Integer.parseInt(numString);
        }
        
        //Find the highest score
        int highest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
        
        //Find the lowest score
        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        
        //Calculate average score
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum / (double) numbers.length;
        
        //Count scores above average
        int aboveAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                aboveAverage++;
            }
        }
        
        //Count scores above 50
        int above50 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50) {
                above50++;
            }
        }
        
        //Count scores below 30
        int below30 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 30) {
                below30++;
            }
        }
        
        //Display results
        System.out.println("===== Score Analysis =====");
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + String.format("%.2f", average));
        System.out.println("Scores above average: " + aboveAverage);
        System.out.println("Scores above 50: " + above50);
        System.out.println("Scores below 30: " + below30);
        
    } //close for main
} //close for class
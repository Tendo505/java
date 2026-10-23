/**
 * @(#)ArrayQ1.java
 *
 * @author
 * @version 1.00 2026/1/13
 */

import javax.swing.JOptionPane;

public class ArrayQ1 {
    public static void main(String[] args) {

        // declare array for 10 scores
        int[] scores = new int[10];

        // read 10 scores from user
        for (int i = 0; i < scores.length; i++) {
            String scoreStr = JOptionPane.showInputDialog(null, "Enter score " + (i + 1) + ":");
            scores[i] = Integer.parseInt(scoreStr);
        }

        // find the highest score
        int highest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        // find the lowest score
        int lowest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        // calculate average score
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = sum / (double) scores.length;

        // count scores above average
        int aboveAverage = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                aboveAverage++;
            }
        }

        // count scores above 50
        int above50 = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 50) {
                above50++;
            }
        }

        // count scores below 30
        int below30 = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 30) {
                below30++;
            }
        }

        // display results
        System.out.println("\n=== Score Analysis ===");
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + String.format("%.2f", average));
        System.out.println("Scores Above Average: " + aboveAverage);
        System.out.println("Scores Above 50: " + above50);
        System.out.println("Scores Below 30: " + below30);
    }
}
/**
 * @(#)ArrayQ3.java
 *
 * @author
 * @version 1.00 2026/1/13
 */

import javax.swing.JOptionPane;
public class ArrayQ3 {
    public static void main(String[] args) {

        //get number of students
        String numStudentsIn= JOptionPane.showInputDialog(null, "Enter number of students:");
        int numStudents = Integer.parseInt(numStudentsIn);

        //arrays to store names and scores
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];

        //read student names and scores
        for (int i = 0; i < numStudents; i++) {
            names[i] = JOptionPane.showInputDialog(null, "Enter student " + (i + 1) + " name:");
            String scoreStr = JOptionPane.showInputDialog(null, "Enter score for " + names[i] + ":");
            scores[i] = Integer.parseInt(scoreStr);
        }

        //find the best score
        int bestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        //display results with grades (sout) = console output
        System.out.println("\t Student Grades ");
        System.out.println("\t Best Score: " + bestScore);
        System.out.println();

        for (int i = 0; i < numStudents; i++) {
            //assign grade based on score
            char grade;
            if (scores[i] >= 85 && scores[i] <= 100) {
                grade = 'A';
            } else if (scores[i] >= 75 && scores[i] <= 84) {
                grade = 'B';
            } else if (scores[i] >= 65 && scores[i] <= 74) {
                grade = 'C';
            } else if (scores[i] >= 55 && scores[i] <= 64) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            //display name, score, and grade
            System.out.println(names[i] + " - Score: " + scores[i] + " - Grade: " + grade);
            JOptionPane.showMessageDialog(null,"Student Grade\n" +"Best Score: " + bestScore + "\n"+ 
            names[i] + " - Score: " + scores[i] + " - Grade: " + grade);
        }

    }

}
import javax.swing.JOptionPane;

public class StudentGradeAssignment {
    public static void main(String[] args) {
        
        // Get number of students
        String numStudentsIn= JOptionPane.showInputDialog(null, "Enter number of students:");
        int numStudents = Integer.parseInt(numStudentsIn);
        
        // Arrays to store names and scores
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];
        
        // Read student names and scores
        for (int i = 0; i < numStudents; i++) {
            names[i] = JOptionPane.showInputDialog(null, "Enter student " + (i + 1) + " name:");
            String scoreStr = JOptionPane.showInputDialog(null, "Enter score for " + names[i] + ":");
            scores[i] = Integer.parseInt(scoreStr);
        }
        
        // Find the best score
        int bestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }
        
        // Display results with grades
        System.out.println("\n=== Student Grades ===");
        System.out.println("Best Score: " + bestScore);
        System.out.println();
        
        for (int i = 0; i < numStudents; i++) {
            // Assign grade based on score
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
            
            System.out.println(names[i] + " - Score: " + scores[i] + " - Grade: " + grade);
        }
        
    }
    
}
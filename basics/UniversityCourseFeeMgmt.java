/**
 * @(#)UniversityCourseFeeMgmt.java
 *
 *
 * @author
 * @version 1.00 2026/5/13
 */
//import package
import java.util.Scanner;
import java.io.*;

public class UniversityCourseFeeMgmt {
	public static void main(String[] args) throws Exception {
		//create a file
		File file = new File("C:/Users/dozle/OneDrive/Documents/java/StudentFeeData.txt");

		//create a scanner for the file
		Scanner input = new Scanner(file);

		//initialize variables (Engineering, Business, IT)
		int engTotal = 0, busTotal = 0, itTotal = 0; 
		String engTopStudent = "", busTopStudent = "", itTopStudent = ""; 
		int overallTotal = 0;
		int engMaxCredit = 0, busMaxCredit = 0, itMaxCredit = 0; 
		int engCount = 0, busCount = 0, itCount = 0;

		//read data from file
		while(input.hasNext()){
			String studentID = input.next();
			String firstName = input.next();
			String lastName = input.next();
			String faculty = input.next();
			int courseFee = input.nextInt();
			int creditHours = input.nextInt();
			int totalFee = input.nextInt();
			
			String studentName = firstName + " " + lastName; //combine first name and last name
			overallTotal += totalFee; //calculation for overall total fee

			if(faculty.equals("Engineering")){
				engCount++;
				engTotal += totalFee;
				if(creditHours > engMaxCredit){
					engMaxCredit = creditHours;
					engTopStudent = studentID + " " + studentName;
				}
			} else if(faculty.equals("Business")){
				busCount++;
				busTotal += totalFee;
				if(creditHours > busMaxCredit){
					busMaxCredit = creditHours;
					busTopStudent = studentID + " " + studentName;
				}
			} else if(faculty.equals("IT")){
				itCount++;
				itTotal += totalFee;
				if(creditHours > itMaxCredit){
					itMaxCredit = creditHours;
					itTopStudent = studentID + " " + studentName;
				}
			}
		}

		//close the file
		input.close();

		//calculate averages
		double engAvg = (double) engTotal / engCount;
		double busAvg = (double) busTotal / busCount;
		double itAvg = (double) itTotal / itCount;

		//total and average fee per faculty
		System.out.println("Total & Average Fee per Faculty");
		System.out.println("Engineering - Total: RM" + engTotal + "  Average: RM" + engAvg);
		System.out.println("Business    - Total: RM" + busTotal + "  Average: RM" + busAvg);
		System.out.println("IT          - Total: RM" + itTotal + "  Average: RM" + itAvg);

		//student with highest credit hours per faculty
		System.out.println("\nStudent with Highest Credit Hours");
		System.out.println("Engineering: " + engTopStudent + "  (" + engMaxCredit + " credit hours)");
		System.out.println("Business:    " + busTopStudent + "  (" + busMaxCredit + " credit hours)");
		System.out.println("IT:          " + itTopStudent + "  (" + itMaxCredit + " credit hours)");

		//overall total fees
		System.out.println("\nOverall Total Fees ");
		System.out.println("Overall Total: RM" + overallTotal);

		//display faculty with highest average fee
		System.out.println("\nFaculty with Highest Average Fee ");
		String highestFaculty = "Engineering";
		System.out.println(highestFaculty + " - RM" + engAvg);

		//count students per faculty
		System.out.println("\nNumber of Students per Faculty ");
		System.out.println("Engineering: " + engCount + " students");
		System.out.println("Business:    " + busCount + " students");
		System.out.println("IT:          " + itCount + " students");
	}
}
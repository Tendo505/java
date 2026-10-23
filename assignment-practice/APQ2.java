//import package
import java.util.Scanner;

public class APQ2 {
	
	//Actual parameter
	public static void main(String[] args) {
		//get array
		double[][] weeklyHours = getArray();
		processArray(weeklyHours);
	}
	
	//Formal parameter
	public static double[][] getArray() {
		//Create new object scanner
		Scanner input = new Scanner(System.in);
		
		//Ask user for number of employees
		System.out.print("How many employees' records do you want to enter? ");
		int numEmployees = input.nextInt();
		
		//Declare an array emp and days
		double[][] weeklyHours = new double[numEmployees][7];
		
		//Input user
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for (int i = 0; i < numEmployees; i++) {
			System.out.println("Enter working hours for Employee " + (i + 1) + ":");
			for (int j = 0; j < 7; j++) {
				System.out.print("  " + days[j] + ": ");
				weeklyHours[i][j] = input.nextDouble();
			}
		}
		return weeklyHours;
	}
	
	//Process and output
	public static void processArray(double[][] weeklyHours) {
		displayTotalHoursPerEmployee(weeklyHours);
		displayMaxHourPerDay(weeklyHours);
		displayMinHourPerDay(weeklyHours);
		displayAverageHoursPerEmployee(weeklyHours);
		displayMaxWeeklyHours(weeklyHours);
	}
	
	//Display total working hours
	public static void displayTotalHoursPerEmployee(double[][] weeklyHours) {
		int numEmployees = weeklyHours.length;
		System.out.println("\n Enter Your Working Hours:");
		for (int i = 0; i < numEmployees; i++) {
			double total = 0;
			for (int j = 0; j < 7; j++) {
				total += weeklyHours[i][j];
			}
			System.out.println("Employee " + (i + 1) + ": " + total + " hours");
		}
	}
	
	//Display maximum working hour per day
	public static void displayMaxHourPerDay(double[][] weeklyHours) {
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int numEmployees = weeklyHours.length;
		System.out.println("\nMaximum working hour per day:");
		for (int j = 0; j < 7; j++) {
			double maxHour = weeklyHours[0][j];
			int employeeId = 1;
			for (int i = 1; i < numEmployees; i++) {
				if (weeklyHours[i][j] > maxHour) {
					maxHour = weeklyHours[i][j];
					employeeId = i + 1;
				}
			}
			System.out.println(days[j] + ": " + maxHour + " hours (Employee " + employeeId + ")");
		}
	}
	
	//Display minimum working hour per day
	public static void displayMinHourPerDay(double[][] weeklyHours) {
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int numEmployees = weeklyHours.length;
		System.out.println("\nMinimum working hour per day:");
		for (int j = 0; j < 7; j++) {
			double minHour = weeklyHours[0][j];
			int employeeId = 1;
			for (int i = 1; i < numEmployees; i++) {
				if (weeklyHours[i][j] < minHour) {
					minHour = weeklyHours[i][j];
					employeeId = i + 1;
				}
			}
			System.out.println(days[j] + ": " + minHour + " hours (Employee " + employeeId + ")");
		}
	}
	
	//Display average working hours for each employee
	public static void displayAverageHoursPerEmployee(double[][] weeklyHours) {
		int numEmployees = weeklyHours.length;
		System.out.println("\nAverage working hours for each employee:");
		for (int i = 0; i < numEmployees; i++) {
			double total = 0;
			for (int j = 0; j < 7; j++) {
				total += weeklyHours[i][j];
			}
			double average = total / 7;
			System.out.println("Employee " + (i + 1) + ": " + average + " hours");
		}
	}
	
	//Display maximum working hours per week among employees
	public static void displayMaxWeeklyHours(double[][] weeklyHours) {
		int numEmployees = weeklyHours.length;
		System.out.println("\nMaximum working hours per week among employees:");
		double maxWeekly = 0;
		int employeeWithMax = 1;
		for (int i = 0; i < numEmployees; i++) {
			double total = 0;
			for (int j = 0; j < 7; j++) {
				total += weeklyHours[i][j];
			}
			if (total > maxWeekly) {
				maxWeekly = total;
				employeeWithMax = i + 1;
			}
		}
		System.out.println("Employee " + employeeWithMax + ": " + maxWeekly + " hours");
	}
}

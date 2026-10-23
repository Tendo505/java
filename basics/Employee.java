public class Employee {
	private String EmpName;
	private String StaffID;
	private double BasicSalary;
	private String Position;
	private double Allowance;
	private double GrossPay;

	public Employee() {
	}

	public String getFirstName() {
		return EmpName;
	}

	public double getAllowanceAmount() {
		return Allowance;
	}

	public double getGrossPay() {
		return GrossPay;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public void setStaffID(String staffID) {
		StaffID = staffID;
	}

	public void setBasicSalary(double basicSalary) {
		BasicSalary = basicSalary;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public void setAllowance(double allowance) {
		Allowance = allowance;
	}

	public void setGrossPay(double grossPay) {
		GrossPay = grossPay;
	}

}
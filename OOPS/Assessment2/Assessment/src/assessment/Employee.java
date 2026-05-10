package assessment;

public class Employee {
	int employeeId;
	String name;
	String designation;
	double salary;

	public Employee(int employeeId, String name, String designation, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public void displayinfo() {
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + name);
		System.out.println("Designation : " + designation);
		System.out.println("Salary : " + salary);
	}

	public void increaseSalary(double percentage) {
		salary += salary * (percentage / 100);
		System.out.println("The increased Salary : " + salary);
	}

	public void increaseSalary(double percentage, double bonus) {
		salary += salary * (percentage / 100) + bonus;
		System.out.println("The salary with bonus : " + salary);
	}

}

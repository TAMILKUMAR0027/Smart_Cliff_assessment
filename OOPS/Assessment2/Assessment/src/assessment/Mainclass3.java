package assessment;

import java.util.Scanner;

public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the employee details");
		System.out.println("Enter the employee id ");
		int id = s.nextInt();
		System.out.println("Enter the name of the employee");
		String name = s.next();
		System.out.println("Enter the designation of the employee");
		String designation = s.next();
		System.out.println("Enter the salary");
		double amt = s.nextDouble();
		Employee e1 = new Employee(id, name, designation, amt);
		e1.displayinfo();
		System.out.println("Enter the percentage");
		double percent=s.nextDouble();
		e1.increaseSalary(percent);
		System.out.println("Enter the bonus");
		double bonus=s.nextDouble();
		e1.increaseSalary(percent, bonus);
	}

}

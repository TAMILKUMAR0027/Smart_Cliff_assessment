package assessment;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the customer details");
		System.out.println("Enter the customer id");
		int id = s.nextInt();
		System.out.println("Enter the customer name");
		String name = s.next();
		System.out.println("Enter the gender of a customer");
		char gender = s.next().charAt(0);
		System.out.println("Enter the account details");
		System.out.println("Enter the account number");
		int acc_id = s.nextInt();
		Customer c1 = new Customer(id, name, gender);
		Account a1 = new Account(acc_id, c1, 0);
		a1.displayAccount();
		while (true) {
			System.out.println("Please select anyone option");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Balance");
			System.out.println("4. Exit");
			int n = s.nextInt();
			if (n == 1) {
				System.out.println("Enter the amount to withdraw");
				double amt = s.nextDouble();
				a1.withdraw(amt);
			} else if (n == 2) {
				System.out.println("Enter the amount to deposit");
				double amt = s.nextDouble();
				a1.deposit(amt);
			} else if (n == 3) {
				a1.checkbalance();
			} else if (n == 4) {
				break;
			} else {
				System.out.println("Provide valid option");
			}
		}
	}

}

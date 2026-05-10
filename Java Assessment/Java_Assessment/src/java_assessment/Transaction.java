package java_assessment;

import java.util.Scanner;

public class Transaction {
	String id;
	double balance;
	double amount;
	double limit;

	public Transaction(String id, double balance, double amount, double limit) {
		super();
		this.id = id;
		this.balance = balance;
		this.amount = amount;
		this.limit = limit;
	}

	public void validate() {
		if (id == null || id.length() == 0) {
			System.out.println("InvalidAccountException: Account ID cannot be empty [Code: 1001]");
			return;
		}
		if (amount > balance) {
			double ss = amount - balance;
			System.out.println("InsufficientFundsException:Shortfall:" + ss + "[Code: 1002] Validation complete.");
			return;
		}
		if (amount > limit) {
			System.out.println("TransactionLimitException:Limit:" + limit + "[Code: 1003] Validation complete.");
			return;
		}
		System.out.println("Transaction successful");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the product id");
		String id=s.next();
		System.out.println("Enter the balance");
		double balance=s.nextDouble();
		System.out.println("Enter the amount");
		double amt=s.nextDouble();
		System.out.println("Enter the limit");
		double limit=s.nextDouble();
		Transaction t=new Transaction(id, balance, amt, limit);
		t.validate();

	}

}

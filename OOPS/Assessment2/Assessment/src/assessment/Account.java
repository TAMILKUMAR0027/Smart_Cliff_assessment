package assessment;

public class Account {
	int acc_id;
	Customer customer;
	double amount;

	public Account(int acc_id, Customer customer, double amount) {
		this.acc_id = acc_id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void deposit(double amt) {
		amount += amt;
		System.out.println("Amount deposited successfully");
	}

	public void withdraw(double amt) {
		if (amt <= amount) {
			amount -= amount;
			System.out.println("Amount withdraw successfully");
		} else {
			System.out.println("You will not have sufficient balance");
		}

	}

	public void checkbalance() {
		System.out.println("The current balance of your account : " + amount);
	}

	void displayAccount() {
		System.out.println("ACCOUNT DETAILS");
		System.out.println("ACCOUNT_ID: " + acc_id);
		System.out.println("CUSTOMER_ID: " + customer.getId());
		System.out.println("CUSTOMER_NAME: " + customer.getName());
		System.out.println("CUSTOMER_GENDER: " + customer.getGender());
		System.out.println("ACCOUNT_BALANCE: " + amount);
	}

}

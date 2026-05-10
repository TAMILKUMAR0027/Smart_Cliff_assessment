package assessment;

abstract class Product {
	int product_id;
	String product_name;
	double price;

	public Product(int product_id, String product_name, double price) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
	}

	public int getProduct_id() {
		return product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public double getPrice() {
		return price;
	}

	abstract void displayinfo();
}

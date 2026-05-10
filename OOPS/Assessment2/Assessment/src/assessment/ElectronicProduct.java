package assessment;

public class ElectronicProduct extends Product {
	int warrantyperiod;

	public ElectronicProduct(int productId, String productName, double price, int warrantyperiod) {
		super(productId, productName, price);
		this.warrantyperiod = warrantyperiod;
	}

	public int getWarrantyperiod() {
		return warrantyperiod;
	}

	public void displayinfo() {
		System.out.println("ELECTRONIC PRODUCT INFORMATION:");
		System.out.println("Product id : " + getProduct_id());
		System.out.println("Product name : " + getProduct_name());
		System.out.println("Product price : $" + price);
		System.out.println("Warranty period : " + warrantyperiod + " Months");
	}
}
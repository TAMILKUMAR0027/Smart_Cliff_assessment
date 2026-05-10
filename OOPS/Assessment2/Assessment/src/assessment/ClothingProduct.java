package assessment;

public class ClothingProduct extends Product {
	String size;
	String material;

	public ClothingProduct(int productId, String productName, double price, String size, String material) {
		super(productId, productName, price);
		this.size = size;
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

	public void displayinfo() {
		// TODO Auto-generated method stub
		System.out.println("CLOTHING PRODUCT INFORMATION: ");
		System.out.println("Product id : " + getProduct_id());
		System.out.println("Product name : " + getProduct_name());
		System.out.println("Product price : $" + price);
		System.out.println("Size : " + size);
		System.out.println("Material : " + material);
	}

	

}

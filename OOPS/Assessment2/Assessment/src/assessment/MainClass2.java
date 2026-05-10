package assessment;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Electronic product information");
		System.out.println("Enter the product id");
		int product_id = s.nextInt();
		System.out.println("Enter the product name");
		String name = s.next();
		System.out.println("Enter the amount");
		double amt = s.nextDouble();
		System.out.println("Enter the warranty period of the product");
		int n = s.nextInt();
		ElectronicProduct e1 = new ElectronicProduct(product_id, name, amt, n);
		System.out.println("Enter the Clothing product information");
		System.out.println("Enter the product id");
		int id = s.nextInt();
		System.out.println("Enter the product name");
		String product_name = s.next();
		System.out.println("Enter the amount");
		double amount = s.nextDouble();
		System.out.println("Enter the size of the product");
		String size = s.next();
		System.out.println("Enter the matrial that used");
		String material = s.next();
		ClothingProduct c1 = new ClothingProduct(id, product_name, amount, size, material);
		e1.displayinfo();
		c1.displayInfo();
	}

}

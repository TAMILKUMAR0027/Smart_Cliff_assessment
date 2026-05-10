package java_assessment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Product implements Comparable<Product> {
	int productid;
	String productName;
	String productCategory;
	double productPrize;
	double discount;
	int productQuantity;

	public Product(int productid, String productName, String productCategory, double productPrize, double discount,
			int productQuantity) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrize = productPrize;
		this.discount = discount;
		this.productQuantity = productQuantity;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.productid;
	}

	public void display() {
		System.out.println(productid + "|" + productName + "|" + productCategory + "|" + productPrize + "|" + discount
				+ "|" + productQuantity);
	}

	public static void main(String[] args) {
		ArrayList<Product> a = new ArrayList<Product>();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("Add the product");
			System.out.println("Exit");
			int c = s.nextInt();
			if (c == 1) {
				System.out.println("Product Id");
				int id = s.nextInt();
				System.out.println("Product name");
				String productName = s.next();
				System.out.println("Product CAtegory");
				String category = s.next();
				System.out.println("Prize");
				double price = s.nextDouble();
				System.out.println("Discount");
				double dis = s.nextDouble();
				System.out.println("Product quantity");
				int quantity = s.nextInt();
				a.add(new Product(id, productName, category, price, dis, quantity));

			} else
				break;
		}

		while (true) {
			System.out.println("1. Sort by Id ");
			System.out.println("2. List Mobiles with price more than 40000 ");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				Collections.sort(a);
				for (Product p : a)
					p.display();
				break;
			case 2:
				for (Product p : a) {
					if (p.productCategory.equalsIgnoreCase("Mobile") && p.productPrize < 40000)
						p.display();
				}
				break;
			case 3:
				System.out.println("Thank You");
				return;
			}
		}

	}
}

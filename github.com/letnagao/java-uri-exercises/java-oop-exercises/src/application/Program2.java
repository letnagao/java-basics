package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product2 product = new Product2();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
//		System.out.printf(product.name + ", " + product.price + ", " + product.quantity);
		System.out.println(product);
		
		sc.close();
	}
}
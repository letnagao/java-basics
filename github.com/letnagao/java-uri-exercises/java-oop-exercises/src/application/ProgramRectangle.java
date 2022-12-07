package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();

		rectangle.Area();
		System.out.printf("AREA = " + rectangle.Area());
		
		rectangle.Perimeter();
		System.out.println("PERIMETER = " + rectangle.Perimeter());
		
		rectangle.Diagonal();
		System.out.println("DIAGONAL = " + rectangle.Diagonal());
		sc.close();
		
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		System.out.println("What is the dollar price? ");
		currencyConverter.dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		
		System.out.println("Amount to be paid in reais = ");
		
		
		sc.close();
	}

}

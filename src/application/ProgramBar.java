package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class ProgramBar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		
		System.out.println("Sexo: ");
		bill.gender = sc.next().charAt(0);
		
		System.out.println("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		
		System.out.println("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		
		System.out.println("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo= %.2f%n", bill.feeding());
		
		if (bill.cover() > 0.00) {
			System.out.printf("Counvert= %.2f%n", bill.cover());
		}else {
			System.out.println("Isento de Couvert");
		}
		
		System.out.printf("Ingresso= %.2f%n", bill.ticket());
		
		System.out.println();
		
		System.out.printf("Valor a pagar= %.2f%n", bill.total());
		
		sc.close();
			
	}

}

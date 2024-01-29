package application;

import java.util.Locale;
import java.util.Scanner;

import entities.bill;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Qual o gênero (M/F)? ");
		char gender = sc.next().charAt(0);
		
		System.out.print("Quantas cervejas? ");
		int beer = sc.nextInt();
		
		System.out.print("Quantos refrigerantes? ");
		int softDrink = sc.nextInt();
		
		System.out.print("Quantos espetinhos? ");
		int barbecue = sc.nextInt();
		
		bill bill = new bill(gender, beer, softDrink, barbecue);
		
		System.out.print("Adicionar mais uma cerveja? (s/n) ");
		char response = sc.next().charAt(0);
		
		if (response == 's') {
	        bill.setBeer(bill.getBeer() + 1);
		}
		
		
		System.out.print(bill);
		sc.close();

	}

}

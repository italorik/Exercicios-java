package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {
	/*Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por uma pessoa em reais.
	Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar.
	Criar uma classe CurrencyConverter para ser respons�vel pelos c�lculos.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("What is the dollar price?");
		CurrencyConverter.pricedollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		CurrencyConverter.quantitydollar =sc.nextDouble();
		System.out.println("Amount to be paid in reais =");
		CurrencyConverter.addIof(quantity.dollar);
		
		
		
		sc.close();
	}

}

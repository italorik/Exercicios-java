package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;




public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		
		System.out.print("Enter rectangle width and height:");
		retangle.width = sc.nextDouble();
		retangle.height = sc.nextDouble();
		
		System.out.println("AREA = " + retangle.area());
		System.out.println("PERIMETER = " + retangle.perimeter());
		System.out.println("DIAGONAL = " + retangle.diagonal());
		
		sc.close();
	}

}

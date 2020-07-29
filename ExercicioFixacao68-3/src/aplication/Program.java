package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
			Student student = new Student();
					
			System.out.println("name: ");
			student.name = sc.nextLine();
			System.out.println("nota1:");
			student.nota1 = sc.nextDouble();
			System.out.println("nota2:");
			student.nota2 = sc.nextDouble();
			System.out.println("nota3:");
			student.nota3 = sc.nextDouble();
			
			System.out.println(student.name);
			System.out.println(student.nota1);
			System.out.println(student.nota2);
			System.out.println(student.nota3);
			System.out.println();
			System.out.println();
			System.out.println("FINAL GRADE = " + student.result());
			
			student.condition();

		sc.close();
	}

}

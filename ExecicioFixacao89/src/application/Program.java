package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Busy;
import entities.Pensionato;
import entities.Students;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Students students = new Students();
		
		Pensionato pensionato = new Pensionato(); 
		
		Busy busy = new Busy();
		
		System.out.println("how many rooms will be rented?");
		int i = sc.nextInt();
		int[] vect = new int [9];
		
		
		char response = 'y';
		for(i=0; response=='y';i++) {
		pensionato.rent=vect[i];
		pensionato.setRoom(pensionato.rent);
		
		System.out.println("Entre com o nome do estudante");
		System.out.print("Name:");
		students.name = sc.nextLine();
		students.setName(students.name);
		
		System.out.println("Entre com o email do estudante");
		System.out.print("Email:");
		students.email =sc.nextLine();
		students.setEmail(students.email);
		
		System.out.println("Entre com o quarto escolhido");
		System.out.println("Quarto:");
		
		//for(i=0;i<vect.lenght;i++){
		//string verificacao = students.getName();
		//if(verificacao == null){
		pensionato.room = sc.nextInt();
		pensionato.setRoom(pensionato.room);
		//}else{
		//System.out.println("Este quarto j� foi alugado");
		//}
		
		System.out.println("Deseja cadastar mais um quarto?(y/n)");
		response = sc.next().charAt(0);
		}
		//for(e=0;e<vect.lenght;e++){
		System.out.println("Rent #"+ pensionato.getRent());
		System.out.println("Name: "+students.getName());
		System.out.println("Email: "+students.getEmail());
		System.out.println("Room: "+pensionato.getRoom());
		System.out.println("");
		//}
		
		busy.toString();
		
		sc.close();
	}

}

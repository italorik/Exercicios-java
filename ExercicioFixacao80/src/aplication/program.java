package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		Account account;
		
		System.out.println("Enter account number:");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter account holder:");
		sc.nextLine();
		String accountTitular = sc.nextLine();
		
		
		System.out.println("Is there nainitial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if(response == 'y'){
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, accountTitular, initialDeposit);
		}
		
		else {
			account = new Account(accountNumber, accountTitular);
		}
		
			
		System.out.println();
		System.out.println("Account Data :");
		System.out.println(account);

		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		

		sc.close();
	}

}

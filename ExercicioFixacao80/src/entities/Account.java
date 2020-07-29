package entities;

public class Account {

	private int accountNumber;         //Final
	private String accountTitular;
	private double balance;

	
	//Construtor com 2 parametros
	public Account(int accountNumber, String accountTitular) {
		this.accountNumber = accountNumber;
		this.accountTitular = accountTitular;
	}
	//construtuor com 3 parametros
	public Account(int accountNumber, String accountTitular, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountTitular = accountTitular;
		deposit(initialDeposit);
	}
	
	
	
	
	//metodo para adicionar nome a conta
	public void addAccount(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	
	public String getAccountTitular() {
		return accountTitular;
	}
	public void setAccountTitular(String accountTitular) {
		this.accountTitular = accountTitular;
	}
	
	
	public double getValorInitial() {
		return balance;
	}
	
	
	//metodo para adicionar a conta
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Titular: "
				+ accountTitular
				+ ", Balance: $"
				+ String.format("%.2f",balance);
	}
	
	

}




package mainPackage;

import java.util.Date;


public class Account {

	Date date = new Date();
	
	private int id = 0;
	
	private double balance = 0; 
	private double annualInterestRate = 0;
	
	private Date dateCreated = date;
	
	// no arg constructor
	public Account() {
		
	}
	
	// Constructor that creates an account with an id and a balance
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		
	}

	// Converts annual interest rate into a monthly interest rate
	public double getMonthlyInterestRate() {
		return getAnnualInterestRate() / 12;
	}
	
	// Withdraws money from the account which this method is called on.
	public void withdraw(double amount)throws InsufficientFundsException {
		
		if(amount < getBalance()) {
			setBalance(getBalance() - amount);
		} else {
			double amountNeeded = amount - getBalance();
			setBalance(getBalance() - amount);
			throw new InsufficientFundsException(amountNeeded);
		}
		
	}
	
	// Deposits money into the account which this method is called on.
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
	
	// --------------------------------GETTERS AND SETTERS--------------------------------------
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	//--------------------------------------------------------------------------------------------
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	//--------------------------------------------------------------------------------------------
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	//--------------------------------------------------------------------------------------------
	public Date getDateCreated() {
		return dateCreated;
	}
	//--------------------------------------------------------------------------------------------
	
	
	
	
	
}

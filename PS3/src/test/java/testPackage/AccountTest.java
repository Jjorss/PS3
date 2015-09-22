package testPackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mainPackage.Account;
import mainPackage.InsufficientFundsException;



public class AccountTest {

	Account ac;

	@Before
	public void setUp() {
		ac = new Account(1222, 20000);
		ac.setAnnualInterestRate(4.5);
	}

	@Test
	public void test1() {
		System.out.println("Annual interest rate is " + ac.getAnnualInterestRate() + "%");
		try {
			ac.withdraw(2500);
			System.out.println("Withdrawing $2500");
		} catch (InsufficientFundsException e) {
			System.out.println("Cannot withdraw entered amount: $" + e.getAmount());
		}
		ac.deposit(3000);
		System.out.println("Depositing $3000");
		System.out.println("Balance:$" + ac.getBalance() + " Monthly Intersest Rate: " + ac.getMonthlyInterestRate()
				+ "%" + " Date created: " + ac.getDateCreated());
	}

	@Test
	public void test2() {
		System.out.println("--------------");
		System.out.println("Annual interest rate is " + ac.getAnnualInterestRate() + "%");
		try {
			ac.withdraw(10000000);
			System.out.println("Withdrawing $10000000");
			ac.deposit(3000);
			System.out.println("Depositing $3000");
			System.out.println("Balance:$" + ac.getBalance() + " Monthly Intersest Rate: " + ac.getMonthlyInterestRate()
					+ "%" + " Date created: " + ac.getDateCreated());
			
		} catch (InsufficientFundsException e) {
			System.out.println("Cannot withdraw entered amount, needs: $" + e.getAmount());
		}
		
	}
}

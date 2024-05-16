package tema12;

import java.util.Scanner;

public class TestBankSystem {

	public static void main(String[] args) {
		Customer customer = new Customer("Robert","Bucuresti","robert@adresa.com");
		 SavingsAccount savingsAccount = new SavingsAccount(123456, 150.0,customer);
		 
		 System.out.println("Hi " + customer.getName());

		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Please enter the amount to withdraw:");
		 double amount = scanner.nextDouble();
		 
		 try {
			 savingsAccount.withdraw(amount);
	     } catch (InsuficientFundsException e) {
	    	 e.printStackTrace();
	     }

	}

}

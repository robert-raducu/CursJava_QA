package tema12;

public abstract class Account {
	
	private int accountNumber;
	
	public double balance;
	
	public Customer accountOwner;

	
	public Account(int accountNumber, double balance, Customer accountOwner) {
		super();
		setAccountNumber(accountNumber);
		setBalance(balance);
		this.accountOwner = accountOwner;
	}

	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	public abstract void withdraw(double amount) throws InsuficientFundsException;
}

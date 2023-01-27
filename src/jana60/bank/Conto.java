package jana60.bank;

public class Conto {
	
	int accountNumber;
	String name;
	double balance = 0;
	
	public Conto(String name, int accountNumber) {
		setName(name);
		setAccountNumber(accountNumber);
	}
	
	int getAccountNumber() {
		return accountNumber;
	}
	
	int setAccountNumber(int numberAccount) {
		return this.accountNumber = numberAccount;
	}
	
	String getName () {
		return name;
	}
	
	String setName(String name) {
		return this.name = name;
	}
	
	double getBalance() {
		return balance;
	}
	
	double addMoney(int money) {
		return balance += money;
	}
	
	boolean isWithdrawal (int money) {

		if(money <= balance) {
			balance -= money;
			return true;
		}
		return false;
	}
	
}

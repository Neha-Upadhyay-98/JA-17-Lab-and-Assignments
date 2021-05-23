package corejava8lab4exercises;

public class Account {
	
	long accNum;
	double balance;
	Person accHolder;
	
	public Account(float age, double balance, Person accHolder) {
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double depositAmt){
		
		balance=depositAmt+balance;
	}
	
	public void withdraw(double withdrawAmt){
		
		balance=balance-withdrawAmt;
			
	}
}

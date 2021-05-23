package corejava8lab4exercises;

public class SavingsAccount extends Account{
	
	final double minBalance;

	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super( accNum, balance, accHolder);
		this.minBalance = 500;
	}
	
	public void withdraw(double withdrawAmt){
		if(balance>=minBalance)
			balance-=withdrawAmt;
		else
			System.out.println("Insufficient funds, cannot withdraw");
	}
	
	

}

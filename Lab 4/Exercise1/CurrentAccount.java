package corejava8lab4exercises;

public class CurrentAccount extends Account{

	double overdraftLimit;

	public CurrentAccount(long accNum,double balance,Person accHolder) {
		super(accNum,balance,accHolder);
		this.overdraftLimit = 90;
	}
	
	public void deposit(double depositAmt){
		if((balance+depositAmt)>overdraftLimit){
			System.out.println("Limit reached can't deposit");
		}
		else
			balance+=depositAmt;
	}
}

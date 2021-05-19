package casestudy1;

public class Withdrawal extends Transaction {
	
	double amount;
	
	public Withdrawal() {
		super();
	}

	public Withdrawal(int accountNumber, double amount) {
		super(accountNumber);
		this.amount = amount;
	}

	double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void execute(double balance){
		super.execute();
		balance=balance-amount;
		System.out.println("Balance = Rs. "+balance);
		
}
	
}

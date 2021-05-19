package casestudy1;

public class Deposit extends Transaction {
	double depAmount;

	
	public Deposit() {
		super();
	}

	public Deposit(int accountNumber, double depAmount) {
		super(accountNumber);
		this.depAmount = depAmount;
	}

	public double getAmount() {
		return depAmount;
	}

	public void setAmount(double depAmount) {
		this.depAmount = depAmount;
	}
	
	public void execute(double balance){
		super.execute();
		balance=balance+depAmount;
		
		System.out.println("Balance = Rs. "+balance);
		
}
	
}

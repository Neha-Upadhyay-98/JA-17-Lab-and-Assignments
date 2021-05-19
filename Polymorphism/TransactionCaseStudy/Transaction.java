package casestudy1;

public class Transaction {
	
	private int accountNumber;
	
	public Transaction() {
		super();
	}
	
	public Transaction(int accountNumber) {
		super();
		this.accountNumber=accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void execute(){
		System.out.println("Account number = "+accountNumber);
	}
	
	
}

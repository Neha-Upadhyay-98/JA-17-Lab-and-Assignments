package casestudy2;

public class Admin extends PayRoll {
	
	private String name;
	private int salary;
	public Admin() { }
	public Admin(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void doAdminStuff(){
		System.out.println("Doing admin stuff");
	}
	

}

package casestudy2;

public class Academic extends PayRoll{

	private String name;
	private int salary;
	Academic(){}
	public Academic(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void giveLecture(){
		System.out.println("Giving Lecture");
	}
}

import java.util.Scanner;
public class Person {
	Scanner sc=new Scanner(System.in);
	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString(){
		return "Person [ name = "+getName()+", address = "+getAddress()+" ] ";
	}
	
}

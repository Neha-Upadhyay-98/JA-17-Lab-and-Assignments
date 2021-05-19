package casestudy2;
import java.util.Scanner;
public class MainPayRoll {

	public static void adminPanel(){
		Scanner sc=new Scanner(System.in);
		Admin a = new Admin();
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter salary:");
		int sal=sc.nextInt();
		
		a.adjustSalary(sal);
		a.doAdminStuff();
	}
	public static void academicPanel(){
		Scanner sc=new Scanner(System.in);
		Academic a = new Academic();
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter salary:");
		int sal=sc.nextInt();
		
		a.adjustSalary(sal);
		a.giveLecture();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Enter the choice:\n1. Admin\n2. Academic\n3. Exit");
			int ch=sc.nextInt();
			if(ch==1)
				adminPanel();
			else if(ch==2)
				academicPanel();
			else if(ch==3){
				System.out.println("Thank you");
				return;
			}
			else
				System.out.println("Wrong input");
		}
	}

}

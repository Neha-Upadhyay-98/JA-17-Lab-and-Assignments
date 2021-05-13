package corejava8labbookexercises;
import java.util.Scanner;
public class Lab1Exercise7 {
	public static boolean checkNumber(int m)
	{
		boolean flag=true;
		int cur_digit=m%10;
		m=m/10;
		while(m>0){
			if(cur_digit<= (m%10)){
				flag=false;
				break;
			}
			cur_digit=m%10;
			m=m/10;
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:\n");
		int n=sc.nextInt();
		if(checkNumber(n))
			System.out.println(n+" is an Increasing Number");
		else
			System.out.println(n+" is not an increasing number");
		
		sc.close();
	}	

}

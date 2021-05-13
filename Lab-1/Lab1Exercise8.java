package corejava8labbookexercises;
import java.util.Scanner;
public class Lab1Exercise8 {
	public static boolean checkNumber(int m)
	{
		if(m==0)
			return false;
		else
			return (int)(Math.ceil((Math.log(m)/Math.log(2))))==(int)(Math.floor(((Math.log(m)/Math.log(2)))));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer:\n");
		int n=sc.nextInt();
		if(checkNumber(n))
			System.out.println(n+" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");
		
		sc.close();
		
	}

}

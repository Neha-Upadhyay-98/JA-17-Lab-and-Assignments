package corejava8labbookexercises;
import java.util.Scanner;
public class Lab1Exercise5 {
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if((i%3==0) || (i%5==0))
				sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:\n");
		int n=sc.nextInt();
		System.out.println("Sum of first "+n+" natural numbers  which are divisible by 3 or 5 = "+calculateSum(n));
		
		sc.close();
	}

}

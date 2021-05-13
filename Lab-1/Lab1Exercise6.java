package corejava8labbookexercises;
import java.util.*;
public class Lab1Exercise6 {
	public static int calculateDifference(int n)
	{
		int sum=0,square=0,diff=0;
		for(int i=1;i<=n;i++)
		{
			square+=i*i;
			sum+=i;
		}
		diff=square-(sum*sum);
		return diff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:\n");
		int num=sc.nextInt();
		System.out.println("Result = "+calculateDifference(num));
		
		sc.close();
	}

}

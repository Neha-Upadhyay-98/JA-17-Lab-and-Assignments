import java.util.Scanner;
public class HarshadNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :\n ");
		int n = sc.nextInt();
		int copy = n, d, sum = 0;

		while(copy>0)
		{
			d = copy%10;
			sum = sum + d;
			copy= copy/10;
		}

		if(n%sum == 0)
			System.out.println(n+" is a Harshad Number.");
		else
			System.out.println(n+" is not a Harshad Number.");      
	}
}
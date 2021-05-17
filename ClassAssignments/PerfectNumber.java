import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:\n");
		int n=sc.nextInt();
		int sum=0,temp=n;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==temp)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
	}

}

package corejava8labbookexercises;
import java.util.Scanner;
public class Lab1Exercise4 {
	public static int isPrime(int m){
		int count=0;
		for(int i=1;i<=m;i++)
		{
			if(m%i==0)
				count++;
		}
		if(count==2)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer:\n");
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			if(isPrime(j)==1)
				System.out.println(j+" ");
		}
		
		sc.close();
	}

}

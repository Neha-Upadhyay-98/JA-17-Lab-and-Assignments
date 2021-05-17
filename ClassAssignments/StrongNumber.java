import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:\n");
		int n=sc.nextInt();
		int sum=0,d=0,f,num=0;
		num=n;
		while(num>0){
			d=num%10;
			f=1;
			for(int i=1;i<=d;i++)
			{
				f=f*i;
			}
			sum=sum+f;
			num=num/10;
		}
		if(sum==n)
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong Number");

	}

}

import java.util.*;
public class LucasNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms to be included in the sequence:\n");
		int n=sc.nextInt();
		int a=2,b=1,c=0;
		System.out.println(a+"\n");
		System.out.println(b+"\n");
		for(int i=1;i<n-1;i++)
		{
			c=a+b;
			System.out.println(c+"\n");
			a=b;
			b=c;
		}
	}

}

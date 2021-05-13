package corejava8labbookexercises;
import java.util.Scanner;
public class Lab1Exercise3 {
	public static void FiboSeries(int m)
	{
		int a=1,b=1,c=0;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<m-1;i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}
	public static int fib(int n) {
		   if ((n == 0) || (n == 1))
		      return n;
		   else
		      return fib(n - 1) + fib(n - 2);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms:\n");
		int n=sc.nextInt();
		System.out.println("Fibonacci Series is :\n");
		FiboSeries(n);
		System.out.println("\n================\n");
		System.out.println("Fibonacci Series using recursion :\n");
		for(int i=1;i<=n;i++){
			System.out.println(" "+fib(i)+" ");
		}
		sc.close();
	}

}

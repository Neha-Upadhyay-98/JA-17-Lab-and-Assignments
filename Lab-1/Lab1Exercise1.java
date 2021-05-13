package corejava8labbookexercises;
import java.util.Scanner;
public class Lab1Exercise1 {
	
	public static int sumOfCubesOfDigits(int m){
		int digit=0,sum=0;
		while(m!=0){
			digit=m%10;
			sum+=(digit*digit*digit);
			m=m/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:\n");
		int n=sc.nextInt();
		int result=sumOfCubesOfDigits(n);
		System.out.println("Sum of the cubes of digits of "+n+" is "+result);
		
		sc.close();
	}

}

import java.util.Scanner;

//How to reverse a String without using string functions?
import java.util.Scanner;
public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String reverse="";
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		int len=str.length();
		for(int i=len-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reversed string = "+reverse);
		
		sc.close();
	}

}

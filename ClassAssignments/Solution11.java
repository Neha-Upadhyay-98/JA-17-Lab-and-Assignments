//Write a java program to extract a substring and check whether extracted substring is palindrome or not?

import java.util.Scanner;

public class Solution11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.next();
		System.out.println("Enter the index from which you want to extract the substring : ");
		int i=sc.nextInt();
		String substr=str.substring(i-1);
		String rev="";
		for(int j=substr.length()-1;j>=0;j--){
			rev+=substr.charAt(j);
		}
		if(substr.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		
		sc.close();
	}

}

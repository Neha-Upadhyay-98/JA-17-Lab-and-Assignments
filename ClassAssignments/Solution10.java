//Write a java program to check whether a given index is alphabet or symbol or digit?

import java.util.Scanner;
public class Solution10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=sc.next();
		str=str.toLowerCase();
		try {
		System.out.print("Enter the index : ");
		int i=sc.nextInt();
		if(str.charAt(i-1)>=97 && str.charAt(i-1)<=122)
			System.out.printf("\nIndex %d contains an alphabet.",i);
		else if(str.charAt(i-1)>=48 && str.charAt(i-1)<=57)
			System.out.printf("\nIndex %d contains a digit.",i);
		else
			System.out.printf("\nIndex %d contains a symbol.",i);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Index out of Bounds");
		}
		sc.close();
	}
}

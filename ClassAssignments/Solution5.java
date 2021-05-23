//Write a java program to check if two strings are anagram are not?

import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter first string : ");
		String s1=sc.nextLine();
		char str1[]=s1.toUpperCase().toCharArray();
		int len1=str1.length;
		System.out.println("Enter second string : ");
		String s2=sc.nextLine();
		char str2[]=s2.toUpperCase().toCharArray();
		int len2=str2.length;
		
		if(len1!=len2)
			flag=false;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<len1;i++)
		{
			if(str1[i]!=str2[i])
				flag=false;
			else
				flag=true;
		}
		
		
		if(flag==true)
			System.out.println("Anagram");
		else
			System.out.println("Not an anagram");
		
		sc.close();
	}

}

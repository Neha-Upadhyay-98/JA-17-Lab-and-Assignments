//Write a java program to find repeated words in a given string?

import java.util.Scanner;
public class Solution15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=sc.nextLine();
		String word[]=str.split(" ");
		System.out.println("Repeated words are : ");
		for(int i=0;i<word.length;i++)
		{
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equalsIgnoreCase(word[j]))
				{
					System.out.print(word[j]+" ");
					break;
				}
			}
		
		}
		sc.close();
	}

}

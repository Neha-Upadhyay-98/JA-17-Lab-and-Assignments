//Write a java program to delete a given word from the string?

import java.util.Scanner;
public class Solution12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		System.out.println("Enter the word to be deleted : ");
		String word=sc.nextLine();
		if(str.contains(word)){
			str=str.replace(word, "");
		}
		System.out.printf("New string : "+str);
		
		sc.close();
	}

}

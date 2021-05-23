// how to remove a given character from a string?

import java.util.Scanner;
public class Solution8 {

	public static String remove(String s,char character)
	{
		s=s.replace(character, ' ');
		String result="";
		char ch[]=s.toCharArray();
		for(char c : ch) {
			if(c!=' ')
			{
				result+=c;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // creation of Scanner class
		System.out.print("Enter string : ");
		String string=sc.next();
		System.out.print("Enter the character to be removed : ");
		char ch=sc.next().charAt(0);
		System.out.printf("New String after removing '%c' is %s.",ch,remove(string,ch));
		
		sc.close();

	}
}

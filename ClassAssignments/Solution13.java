//Write a java program to read a string and move all uppercase characters to the front?

import java.util.Scanner;
public class Solution13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=sc.next();
		String newstr="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				newstr+=str.charAt(i);
			}
		}
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)>=65 && str.charAt(i)<=90)) {
				newstr+=str.charAt(i);
			}
		}
		System.out.println("Output String : "+newstr);
		
		sc.close();
	}

}

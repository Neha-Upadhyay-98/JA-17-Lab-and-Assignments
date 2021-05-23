//Write a to print duplicate characters from the given string?

import java.util.Scanner;
public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to find the duplicate characters from the string : ");
		String str=sc.next();
		int count;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			count=1;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j] && ch[i]!=' '){
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i]!='0')
				System.out.println(ch[i]+" occurs "+count+" times.");
		}
		
		sc.close();
	}
}

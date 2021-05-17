package corejava8lab3exercises;
import java.util.*;
public class Lab3Exercise8 {
	static boolean isPositive(String str) {
		int len = str.length();
		char ch[] = new char[len];
		for (int i = 0; i < len; i++) 
			ch[i] = str.charAt(i);
		Arrays.sort(ch);
		for (int i = 0; i < len; i++) 
			if (ch[i] != str.charAt(i))
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		if (isPositive(s))
			System.out.println("Is positive string");
		else
			System.out.println("Is not positive string");;
		sc.close();
	}
}

package corejava8lab3exercises;
import java.util.*;
public class Lab3Exercise4 {
	static int modifyNumber(int number1) {
		String s = Integer.toString(number1);
		String diff = "";
		for (int i = 0; i < s.length()-1; i++) 
			diff += Integer.toString(Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i+1))));
		diff += s.substring(s.length()-1);
		return Integer.parseInt(diff);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		System.out.println(modifyNumber(number));
		sc.close();
	}
}

package corejava8labbookexercises;
import java.util.Scanner;
public class Lab1Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Traffic Signal Simulator");
		System.out.println("===================");
		System.out.println("R - Red light signal");
		System.out.println("Y - Yellow light signal");
		System.out.println("G - Green light signal");
		System.out.println("===================");
		System.out.println("Enter your choice : \n");
		char ch=sc.next().trim().charAt(0);
		switch(ch){
		case 'R':
			System.out.println("Stop");
			break;
		case 'Y':
			System.out.println("Ready");
			break;
		case 'G':
			System.out.println("Go");
			break;
		default:
			System.out.println("No match found");
		}
		
		sc.close();
	
	}

}

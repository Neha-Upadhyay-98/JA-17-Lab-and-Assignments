package com.capgemini.lab9exercise5;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial fact=() ->{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any number to calculate its factorial : ");
			int num=sc.nextInt();
			int f=1;
			for(int i=1;i<=num;i++){
				f=f*i;
			}
			System.out.println("Factorial = "+f);
		};
		
		fact.factorial();
	}

}

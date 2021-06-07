package com.capgemini.lab9exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Space s=() -> {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string : ");
			String str=sc.nextLine();
			System.out.println("String with space is = "+(str.replace("", " ").trim()));
		};
		s.addSpaceInString();
	}
}

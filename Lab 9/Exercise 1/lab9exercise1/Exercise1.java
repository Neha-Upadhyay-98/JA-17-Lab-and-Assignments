package com.capgemini.lab9exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Power obj=() -> {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter values of x and y : ");
			System.out.println("x power y is = "+(Math.pow(sc.nextInt(), sc.nextInt())));
		};
		obj.powerOfX();
	}

}

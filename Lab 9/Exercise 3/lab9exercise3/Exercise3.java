package com.capgemini.lab9exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Credentials c=() -> {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter username : ");
			String username=sc.nextLine();
			System.out.println("Enter password : ");
			String password=sc.nextLine();
			if(username.equals("Neha Upadhyay") && password.equals("password"))
				return true;
			return false;
		};
		if(c.credentialValidation()){
			System.out.println("VALID");
		}
		else{
			System.out.println("INVALID");
		}
	}

}

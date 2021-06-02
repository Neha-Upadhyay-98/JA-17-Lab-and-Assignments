package com.capgemini.authorapp;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.authorapp.model.Author;
import com.capgemini.authorapp.service.AuthorManager;

public class AuthorMain {

	static Scanner ip=new Scanner(System.in);
	static String name;
	static String email;
	static char gender;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthorManager auth=new AuthorManager();
		char choice='y';
		while(choice=='y'){
			System.out.println("Enter the choice");
			System.out.println("a:add author");
			System.out.println("g:get author list");
			char ch=ip.next().charAt(0);
		switch(ch){
		case 'a':
			readDetails();
			auth.addAuthor(name, email, gender);
			break;
		case 'g':
			Collection<Author> data=auth.getAllAuthors();
			System.out.println(data);
			break;
		default:
			break;
		}//switch close
		System.out.println("Do you want to continue");
		choice=ip.next().charAt(0);
		}//while close
	}
	
	public static void readDetails(){
		System.out.println("Enter the contact details:");
		System.out.println("Enter the name :");
		name=ip.next();
		System.out.println("Enter the email :");
		email=ip.next();
		System.out.println("Enter the gender :");
		gender=ip.next().charAt(0);
	}

}

package com.capgemini.bookapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.bookapp.exceptions.ArrayListIsNullException;
import com.capgemini.bookapp.exceptions.BookAlreadyFoundException;
import com.capgemini.bookapp.exceptions.BookIDCannotBeNegative;
import com.capgemini.bookapp.exceptions.BookNameCannotBeNull;
import com.capgemini.bookapp.exceptions.PriceIsNotValidException;
import com.capgemini.bookapp.model.Book;
import com.capgemini.bookapp.service.BookManager;

public class BookMain {

	static Scanner sc=new Scanner(System.in);
	private static int bookId;
	private static String bookName;
	private static double bookPrice;
	public static void main(String[] args) throws BookAlreadyFoundException, BookIDCannotBeNegative, BookNameCannotBeNull, PriceIsNotValidException, ArrayListIsNullException {
		// TODO Auto-generated method stub
		
		BookManager bm=new BookManager();
		ArrayList<Book> bookList=new ArrayList<Book>();
		char choice='y';
		while(choice=='y'){
			System.out.println("Enter the choice");
			System.out.println("c : create a new book in book list");
			System.out.println("r : read the book list");
			System.out.println("u : update the book list");
			System.out.println("d : delete a book");
			char ch=sc.next().charAt(0);
		switch(ch){
		case 'c':
			readDetails();
			bookList=bm.addBook(bookId, bookName, bookPrice);
			break;
		case 'r':
			bm.displayBookList(bookList);
			break;
		case 'u':
			bm.updateBook(bookList);
			break;
		case 'd':
			bm.deleteBook(bookList);
			break;
		default:
			break;
		}//switch close
		System.out.println("Do you want to continue");
		choice=sc.next().charAt(0);
		}//while close
	}
	
	public static void readDetails(){
		System.out.println("Enter the book details:");
		System.out.println("Enter the book id:");
		bookId=sc.nextInt();
		System.out.println("Enter the book name :");
		bookName=sc.next();
		System.out.println("Enter the price of the book :");
		bookPrice=sc.nextDouble();
	}

}

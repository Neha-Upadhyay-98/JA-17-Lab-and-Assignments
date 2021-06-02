package com.capgemini.bookapp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.capgemini.bookapp.exceptions.ArrayListIsNullException;
import com.capgemini.bookapp.exceptions.BookAlreadyFoundException;
import com.capgemini.bookapp.exceptions.BookIDCannotBeNegative;
import com.capgemini.bookapp.exceptions.BookNameCannotBeNull;
import com.capgemini.bookapp.exceptions.PriceIsNotValidException;
import com.capgemini.bookapp.model.Book;

public class BookManager {

	ArrayList<Book> bookList=new ArrayList<Book>();
	Scanner sc=new Scanner(System.in);
	public ArrayList<Book> addBook(int bid,String bname,double bprice) throws BookAlreadyFoundException, BookIDCannotBeNegative, BookNameCannotBeNull, PriceIsNotValidException{
		Book book=new Book(bid,bname,bprice);
		validateBook(book);
		checkIfBookAlreadyExist(book);
		bookList.add(book);
		return bookList;
	}
	public void displayBookList(ArrayList<Book> bookList) throws ArrayListIsNullException {
		// TODO Auto-generated method stub
		if(bookList.size()==0)
			throw new ArrayListIsNullException("list is empty");
		else{
			for(Book b:bookList)
				System.out.println(b);
		}
	}
	private void checkIfBookAlreadyExist(Book book) throws BookAlreadyFoundException {
		// TODO Auto-generated method stub
		for(Book b: bookList){
			if(b.getBid()==book.getBid()){
				throw new BookAlreadyFoundException("Book is already present in the list");
			}
		}
	}
	public void updateBook(ArrayList<Book> bookList){
		System.out.println("enter book id to be updated");
		int id=sc.nextInt();
		for(Book b:bookList) {
			if(b.getBid()==id) {
				System.out.println("enter new book name");
				String newbname= sc.next();
				System.out.println("enter newprice");
				double price=sc.nextDouble();
				b.setBname(newbname);
				b.setPrice(price);
			}
		}
	}
	public void deleteBook(ArrayList<Book> bookList){
		System.out.println("enter id to delete");
		int id=sc.nextInt();
		Iterator<Book> bookItr2 = bookList.iterator();
		while(bookItr2.hasNext()) {
			Book st = bookItr2.next();
			if(st.getBid()==id) {
				bookItr2.remove();
			}
		}
	}
	private void validateBook(Book book) throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceIsNotValidException{
		// TODO Auto-generated method stub
		book.validateBookName();
		book.validateBookId();
		book.validateBookPrice();
	}
	public ArrayList<Book> getlist() {
		return bookList;
	}
}

package com.capgemini.bookapp.exceptions;

public class BookAlreadyFoundException extends Exception {
	
	public BookAlreadyFoundException(String msg){
		super(msg);
	}
}

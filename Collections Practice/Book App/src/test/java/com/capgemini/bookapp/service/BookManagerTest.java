package com.capgemini.bookapp.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.bookapp.exceptions.BookAlreadyFoundException;
import com.capgemini.bookapp.exceptions.BookIDCannotBeNegative;
import com.capgemini.bookapp.exceptions.BookNameCannotBeNull;
import com.capgemini.bookapp.exceptions.PriceIsNotValidException;

public class BookManagerTest {

	private BookManager books;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("printed before all");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("printed after all");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("should printbefore each test");
		System.out.println("instantiating Contact Manager");
		books=new BookManager();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("printed after each");
	}

	@Test
	public void testAddBooks() throws BookAlreadyFoundException, BookIDCannotBeNegative, BookNameCannotBeNull, PriceIsNotValidException {
		books.addBook(1, "Java", 2000.0);
		assertFalse(books.getlist().isEmpty());
		assertEquals(1, books.getlist().size());
	}

}

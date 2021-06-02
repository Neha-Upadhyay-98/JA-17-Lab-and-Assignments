package com.capgemini.bookapp.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BookTest {

	static Book bobj;
	Book bobj1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bobj =new Book(1234,"abc",450);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		bobj=null; //it is available for garbage collector
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		bobj1=new Book();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		bobj1=null;
	}

	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#Contact()}.
	 */
	@Test
	public void testContact() {
		assertEquals(new Book(),bobj1);
	}

	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getfName()}.
	 */
	@Test
	public void testGetBid() {
		assertEquals(1234,bobj.getBid());
	}
	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getlName()}.
	 */
	@Test
	public void testGetBname() {
		assertEquals("abc",bobj.getBname());
	}

	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getPhNo()}.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testGetPrice() {
		assertEquals(450,bobj.getPrice(),.2F);
	}

}

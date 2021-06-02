package com.capgemini.authorapp.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AuthorTest {
	
	static Author a;
	Author a1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		a =new Author("abc","abc@gmail.com",'m');
	}
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		a=null; //it is available for garbage collector
	}
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a1=new Author();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a1=null;
	}
	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#Contact()}.
	 */
	@Test
	public void testAuthor() {
		assertEquals(new Author(),a1);
	}

	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getfName()}.
	 */
	@Test
	public void testGetName() {
		assertEquals("abc",a.getName());
	}
	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getlName()}.
	 */
	@Test
	public void testGetEmail() {
		assertEquals("abc@gmail.com",a.getEmail());
	}

	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getPhNo()}.
	 */
	@Test
	public void testGetGender() {
		assertEquals('m',a.getGender());
	}

}

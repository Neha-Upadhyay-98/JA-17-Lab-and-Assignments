package com.capgemini.authorapp.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class AuthorManagerTest {
	
	private AuthorManager authManager;
	
	@BeforeClass
	public static void setupAll(){
		System.out.println("should print before all tests");
	}
	
	@Before
	public void setup(){
		System.out.println("should print before each tests");
		System.out.println("Instantiating the Contact Manager");
		authManager=new AuthorManager();
	}
	
	
	@Test
	@DisplayName("should create author")
	public void shouldCreateContact(){
		authManager.addAuthor("abc", "abc@gmail.com", 'm');
		assertFalse(authManager.getAllAuthors().isEmpty());
		assertEquals(1,authManager.getAllAuthors().size());
	}
	
	//Testing Exceptions
	@Test
	@DisplayName("should not create author when name is null")
	public void shouldThrowRunTimeExceptionWhenNameIsNull(){
		Assertions.assertThrows(RuntimeException.class, () -> { authManager.addAuthor(null, "abc@gmail.com", 'm');});
	}

	@Test
	@DisplayName("should not create author when email is does not contain @")
	public void shouldThrowRunTimeExceptionWhenEmailIsNull(){
		Assertions.assertThrows(RuntimeException.class, () -> { authManager.addAuthor("abc", "abcgmail.com", 'm');});
	}
	
	@Test
	@DisplayName("should not create author when email is null")
	public void shouldThrowRunTimeExceptionWhenEmailDoesNotContainSymbol(){
		Assertions.assertThrows(RuntimeException.class, () -> { authManager.addAuthor("abc", null, 'm');});
	}
	
	
	@Test
	@DisplayName("should not create author when gender is null")
	public void shouldThrowRunTimeExceptionWhenGenderIsNull(){
		Assertions.assertThrows(RuntimeException.class, () -> { authManager.addAuthor("abc", "abc@gmail.com", ' ');});
	}

	
	@Test
	@DisplayName("disable test")
	@Ignore
	public void disableTest(){
		throw new RuntimeException("this test is a disabled test");
	}
	
	@After
	public void tearDown(){
		System.out.println("should execute after each test");
	}
	
	@AfterClass
	public static void tearAll(){
		System.out.println("should execute after all tests");
	}
}

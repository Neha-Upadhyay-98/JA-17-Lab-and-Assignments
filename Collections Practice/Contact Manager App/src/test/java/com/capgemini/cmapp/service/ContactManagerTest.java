package com.capgemini.cmapp.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;

public class ContactManagerTest {

	/**
	 * object of ContactManagaer class
	 */
	private ContactManager contManager;
	
	@BeforeClass
	public static void setupAll(){
		System.out.println("should print before all tests");
	}
	
	@Before
	public void setup(){
		System.out.println("should print before each tests");
		System.out.println("Instantiating the Contact Manager");
		contManager=new ContactManager();
	}
	
	@Test
	@DisplayName("should create contact")
	public void shouldCreateContact(){
		contManager.addContact("Rama", "Krishna", "09875490675");
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1,contManager.getAllContacts().size());
	}
	
	//Testing Exceptions
	@Test
	@DisplayName("should not create contact when first name is null")
	public void shouldThrowRunTimeExceptionWhenFirstNameIsNull(){
		Assertions.assertThrows(RuntimeException.class, () -> { contManager.addContact(null, "Krishna", "09875490675");});
	}

	@Test
	@DisplayName("should not create contact when last name is null")
	public void shouldThrowRunTimeExceptionWhenLastNameIsNull(){
		Assertions.assertThrows(RuntimeException.class, () -> { contManager.addContact("Rama", null, "09875490675");});
	}
	
	@Test
	@DisplayName("should not create contact when phone number is null")
	public void shouldThrowRunTimeExceptionWhenPhoneNoIsNull(){
		Assertions.assertThrows(RuntimeException.class, () -> { contManager.addContact("Rama", "Krishna", null);});
	}
	
	@Test
	@DisplayName("should test phone number start with 0")
	public void shouldTestPhoneNumberFormat(){
		Assertions.assertThrows(RuntimeException.class, () -> { contManager.addContact("Rama", "Krishna", "98754906755");});
	}
	
	@Nested
	class RepeatedTests{
		
		@DisplayName("should create contact")
		@RepeatedTest(value=5,name="Repeating contact creation test {currentRepetition} of {totalRepetition}")
		public void shouldCreateContactRepeatedly(){
			contManager.addContact("Rama", "Krishna", "09875490675");
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1,contManager.getAllContacts().size());
		}
	}
	// will work for JUnit 5.7.0 only
	/*@Nested
	class ParameterizedTests{
		@DisplayName("Phone number should match with required format")
		@ParameterizedTest
		@ValueSource(strings = {"09875490675","08697623824","09831096042"})
		public void shouldTestPhoneNumberFormatUsingValueSource(String phoneNumber){
			contManager.addContact("Rama","Krishna", phoneNumber);
			assertFalse(contManager.getAllContacts().isEmpty());
			assertEquals(1,contManager.getAllContacts().size());
		}
	}*/
	
	/**
	 * 
	 */
	
	/*private static List<String> phoneNumberList(){
		return Arrays.asList("09875490675","08697623824","09831096042");
	}
	
	@DisplayName("Testing phone numbers in required format using Method Source")
	@ParameterizedTest
	@MethodSource("phoneNumberList")
	public void testPhoneNumbersUsingMethodSource(String phoneNumber){
		contManager.addContact("Rama","Krishna", phoneNumber);
		assertFalse(contManager.getAllContacts().isEmpty());
		assertEquals(1,contManager.getAllContacts().size());
	}*/
	
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

/**
 * 
 */
package com.capgemini.cmapp.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author HP
 *
 */
public class ContactTest {

	/**
	 * @throws java.lang.Exception
	 */
	static Contact cont;
	Contact cont1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cont =new Contact("Rama","Krishna","09875490675");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		cont=null; //it is available for garbage collector
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cont1=new Contact();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		cont1=null;
	}

	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#Contact()}.
	 */
	@Test
	public void testContact() {
		assertEquals(new Contact(),cont1);
	}

	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getfName()}.
	 */
	@Test
	public void testGetfName() {
		assertEquals("Rama",cont.getfName());
	}
	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getlName()}.
	 */
	@Test
	public void testGetlName() {
		assertEquals("Krishna",cont.getlName());
	}

	/**
	 * Test method for {@link com.capgemini.cmapp.model.Contact#getPhNo()}.
	 */
	@Test
	public void testGetPhNo() {
		assertEquals("09875490675",cont.getPhNo());
	}

}

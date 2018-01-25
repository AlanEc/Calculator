/**
 * 
 */
package com.baludik.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Anne-SOphie
 *
 */
public class AditionTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.baludik.calculator.Adition#Adition(int)}.
	 */
	@Test
	public void testAdition() {
		Adition add = new Adition(1);
		Assert.assertEquals(1,  add.value);
		
		Assert.assertNotNull(add);
		
	}

	/**
	 * Test method for {@link com.baludik.calculator.Adition#make(int)}.
	 */
	@Test
	public void testMake() {
		Adition add = new Adition(1);
		add.make(2);
		
		Assert.assertNotNull(add);
		Assert.assertEquals(3, add.value);
	}

	/**
	 * Test method for {@link com.baludik.calculator.Adition#getValue()}.
	 */
	@Test
	public void testGetValue() {
		Adition add = new Adition(1);		
		Assert.assertNotNull(add);
		Assert.assertEquals(1, add.value);
	}

}

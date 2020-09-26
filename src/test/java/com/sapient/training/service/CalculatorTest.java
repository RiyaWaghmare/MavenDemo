package com.sapient.training.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class method");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After test method");
	}

	@Test
	public void isValidTestAddition() {
		Calculator calculator= new Calculator();
		assertEquals("Addition passed",5.0,calculator.addition(2.0, 3.0),0.01);
	}
	
	@Test
	public void isInvalidTestAddition() {
		Calculator calculator= new Calculator();
		assertNotEquals("Addition failed",4.0,calculator.addition(2.0, 3.0),0.01);
	}
	
	

	@Test
	public void isValidTestSubstraction() {
		assertEquals("Substraction passed",1,new Calculator().substraction(2, 1));
	}
	
	@Test
	public void isInvalidTestSubstraction() {
		assertNotEquals("Substraction failed",-1,new Calculator().substraction(2, 1));
	}

}

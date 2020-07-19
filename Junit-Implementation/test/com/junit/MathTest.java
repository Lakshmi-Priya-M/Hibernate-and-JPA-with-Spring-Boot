package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class MathTest {
	Math math = new Math();
	
	// a) Whenever we learn a new concept junit can be used.  b) automation
	// Source Code and Unit Test Code should be in different folder
	// Source Code is deployed to client
	// Unit Test Code is kept for developer purpose
    @BeforeEach
    public void before()
    {
    	System.out.println("Before");	
    }
    
    @AfterEach
    public void after()
    {
    	System.out.println("After");
    }
    
    // You're using JUnit4, and I used JUnit5. In JUnit5 the annotations @Before, @After, @BeforeClass, 
    // @AfterClass become @BeforeEach, @AfterEach, @BeforeAll, @AfterAll
    // Note that the methods used for @BeforeAll and the @AfterAll must be static, 
    // otherwise the junit tests will not run.
    
    @BeforeAll											// This is a Class level method. So the methods under this annotation has to be Static.
	public static void beforeClass()				// The code inside this method will execute before all @Test methods are executed.
	{
		System.out.println("BeforeClass");
	}
	
	@AfterAll												// This is a Class level method. So the methods under this annotation has to be Static.
	public static void afterClass()					// The code inside this method will execute after all @Test methods are executed.
	{
		System.out.println("AfterClass");
	}
	
	// There's no order of executing @Test methods.
	// If there're 3 methods for example, it can execute in any order. (Like 2nd, 1st, 3rd).
	
	
	@Test     // This annotation is used to signify that it is a unit test method
	public void sumWithThreeNum() {
		// Absence of failure is success
		// Check that the result is 6
		assertEquals(6,math.sum(new int[] {1,2,3}));
		System.out.println("Test1");
	}
	
	@Test     // This annotation is used to signify that it is a unit test method
	public void sumWithOneNum() {
		// Absence of failure is success
		// Check that the result is 3
		assertEquals(3,math.sum(new int[] {3}));
		System.out.println("Test2");
	}
}

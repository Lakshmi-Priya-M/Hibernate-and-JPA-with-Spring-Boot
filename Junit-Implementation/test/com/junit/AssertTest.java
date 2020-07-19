package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {


		
//		void test() {												// This is a default method when we create a Junit Test Case
//			fail("Not yet implemented");					// When fail() is called, Red bar (Failure) is shown. If we comment this line and run this
//																		// method, then Green bar (Success) is shown.
//																		// This is Success because, according to Junit Framework, Absence of failure is success.
//		}
		
		@Test
		public void test()
		{
//         Any kind of types can be checked.
			assertEquals(1, 1);
			assertTrue(true);
			assertFalse(false);
//			Other methods :
//					assertNotNull()
//					assertNull()
//					assertArrayEquals(expected, Actual)
		}
}


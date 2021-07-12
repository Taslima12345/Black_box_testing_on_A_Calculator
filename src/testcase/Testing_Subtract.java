package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_Subtract {
	
	Calculator test = new Calculator();
	
	double delta = 1e-8;

	@Test
	void test_subtract() {
		
		double expectedResult = 7;
		double result = test.subtract(9,2);
		assertEquals(expectedResult, result);

		
	}
	
	@Test
	void test_subtract1() {
		
		double expectedResult = -99;
		double result = test.subtract(9,108);
		assertEquals(expectedResult, result);

		
	}
	
	@Test
	void test_subtract2() {
		
		double expectedResult = 9;
		double result = test.subtract(9,0);
		assertEquals(expectedResult, result);

		
	}
	
	@Test
	void test_subtract3() {
		
		double expectedResult = 5.21;
		double result = test.subtract(9,3.79);
		assertEquals(expectedResult, result);

		
	}
	
	@Test
	void test_subtrac4() {
		
		double expectedResult = -80.09;
		double result = test.subtract(9,89.09);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_subtract5() {
		
		double expectedResult = 126.2;
		double result = test.subtract(9,-117.2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_subtract6() {
		
		double expectedResult = -2;
		double result = test.subtract(0,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_subtract7() {
		
		double expectedResult = -1;
		double result = test.subtract(1,2);
		assertEquals(expectedResult, result);
		
	}
	
	
	@Test
	void test_subtract8() {
		
		double expectedResult = -110;
		double result = test.subtract(-108,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_subtract9() {
		
		double expectedResult = 87.09;
		double result = test.subtract(89.09,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_subtract10() {
		
		double expectedResult = - 0.21;
		double result = test.subtract(1.79,2);
		assertEquals(expectedResult, result, delta);

		
	}
	
	@Test
	void test_subtract11() {
		
		double expectedResult = -119.2;
		double result = test.subtract(-117.2,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_subtract12() {
		
		double expectedResult = 44;
		double result = test.subtract(-45,-89);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_subtract13() {
		
		double expectedResult = 44;
		double result = test.subtract(-2.22507E-308,89);
		assertEquals(expectedResult, result);
		
	}
	
	 
	
}

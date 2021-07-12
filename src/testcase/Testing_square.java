package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_square {
	
	double delta = 1e-8;
	
	Calculator test = new Calculator();

	@Test
	void test_Square() {
		
		double expectedResult = 100;
		double result = test.square(10);
		assertEquals(expectedResult, result);
		
		
	}
	
	@Test
	void test_Square1() {
		
		double expectedResult = 490000;
		double result = test.square(-700);
		assertEquals(expectedResult, result);
		
		
	}
	
	@Test
	void test_Square2() {
		
		double expectedResult = 0.8041784976;
		double result = test.square(-0.89676);
		assertEquals(expectedResult, result);
		
		
	}
	
	@Test
	void test_Square3() {
		
		double expectedResult = 6098.0481;
		double result = test.square(-78.09);
		assertEquals(expectedResult, result,delta);
		
		
	}
	
	
	@Test
	void test_Square4() {
		
		double expectedResult = 0;
		double result = test.square(0);
		assertEquals(expectedResult, result);
		
		
	}
	
	
}

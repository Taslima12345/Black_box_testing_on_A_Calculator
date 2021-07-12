package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_factorial {

	double delta = 1e-8;

	Calculator test = new Calculator();

	@Test
	void factorial() {
		double expectedResult = 3628800;
		double result = test.factorial(10);
		assertEquals(expectedResult, result);
	}
	
	
	@Test
	void factorial1() {
		double unexpectedResult = 344.701924035;
		double result = test.factorial(5.6);
		assertNotEquals(unexpectedResult, result);
	}

	@Test
	void factorial2() {
		double expectedResult = 1;
		double result = test.factorial(1);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void factorial3() {
		double expectedResult = 1;
		double result = test.factorial(0);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void factorial4() {
		double unexpectedResult = -5040;
		double result = test.factorial(-7);
		assertNotEquals(unexpectedResult, result);
	}
	

}

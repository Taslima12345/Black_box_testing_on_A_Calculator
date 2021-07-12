package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_squareRoot {
	
	double delta = 1e-8;
	
	Calculator test = new Calculator();

	@Test
	void squareRoot() {
		double expectedResult = 123;
		double result = test.squareRoot(15129);
		assertEquals(expectedResult, result);
	}

	@Test
	void squareRoot1() {
		double expectedResult = 26.9258240357;
		double result = test.squareRoot(725);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void squareRoot2() {
		double unexpectedResult = 100.0;
		double result = test.squareRoot(-1000);
		assertNotEquals(unexpectedResult, result);
	}
	
	@Test
	void squareRoot3() {
		double expectedResult = 11.3925414197;
		double result = test.squareRoot(129.79);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void squareRoot4() {
		double expectedResult = 0;
		double result = test.squareRoot(0);
		assertEquals(expectedResult, result);
	}
}

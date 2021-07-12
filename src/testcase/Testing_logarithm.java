package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_logarithm {
	
	double delta = 1e-8;

	Calculator test = new Calculator();

	@Test
	void logarithm() {
		double expectedResult = 0;
		double result = test.logarithm(0);
		assertNotEquals(expectedResult, result);
	}
	
	@Test
	void logarithm1() {
		double expectedResult = 1.47712125472;
		double result = test.logarithm(30);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void logarithm2() {
		double expectedResult = 0;
		double result = test.logarithm(-87);
		assertNotEquals(expectedResult, result);
	}
	
	@Test
	void logarithm3() {
		double expectedResult = -0.1079053973;
		double result = test.logarithm(0.78);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void logarithm4() {
		double unexpectedResult = 0;
		double result = test.logarithm(-7.25);
		assertNotEquals(unexpectedResult, result);
	}
}

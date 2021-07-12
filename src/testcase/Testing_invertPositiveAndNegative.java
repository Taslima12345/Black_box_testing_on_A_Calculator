package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_invertPositiveAndNegative {

	double delta = 1e-8;
	
	Calculator test = new Calculator();

	@Test
	void invertPositiveAndNegative() {
		double expectedResult = 23;
		double result = test.invertPositiveAndNegative(-23);
		assertEquals(expectedResult, result);
	}
	

	@Test
	void invertPositiveAndNegative1() {
		double expectedResult = -70E4;
		double result = test.invertPositiveAndNegative(70E4);
		assertEquals(expectedResult, result);
	}
	
	
	@Test
	void invertPositiveAndNegative2() {
		double expectedResult = -0.0;
		double result = test.invertPositiveAndNegative(0);
		assertEquals(expectedResult, result);
	}
}

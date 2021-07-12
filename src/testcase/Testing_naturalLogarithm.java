package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_naturalLogarithm {

	double delta = 1e-8;

	Calculator test = new Calculator();

	@Test
	void naturalLogarithm() {
		double expectedResult = 1;
		double result = test.naturalLogarithm(0);
		assertNotEquals(expectedResult, result);
	}
	
	@Test
	void naturalLogarithm1() {
		double expectedResult = 1.6094379124341003;
		double result = test.naturalLogarithm(5);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void naturalLogarithm2() {
		double unexpectedResult = 0.0001;
		double result = test.naturalLogarithm(-4);
		assertNotEquals(unexpectedResult, result);
	}
	
	@Test
	void naturalLogarithm3() {
		double expectedResult = -0.2484613592984996;
		double result = test.naturalLogarithm(0.78);
		assertEquals(expectedResult, result);
	}
	
	
	@Test
	void naturalLogarithm4() {
		double expectedResult = 0;
		double result = test.naturalLogarithm(1);
		assertEquals(expectedResult, result);
	}

}

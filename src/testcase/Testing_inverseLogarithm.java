package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_inverseLogarithm {

	double delta = 1e-8;

	Calculator test = new Calculator();

	@Test
	void inverseLogarithm() {
		double expectedResult = 1.0;
		double result = test.inverseLogarithm(0);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void inverseLogarithm1() {
		double expectedResult = 1.0E30;
		double result = test.inverseLogarithm(30);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void inverseLogarithm2() {
		double expectedResult = 1.0E-87;
		double result = test.inverseLogarithm(-87);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void inverseLogarithm3() {
		double expectedResult = 6.025595860743578;
		double result = test.inverseLogarithm(0.78);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void inverseLogarithm4() {
		double expectedResult = 0.0017782794100389228;
		double result = test.inverseLogarithm(-2.75);
		assertEquals(expectedResult, result);
	}
}

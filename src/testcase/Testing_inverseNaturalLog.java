package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_inverseNaturalLog {

	double delta = 1e-8;

	Calculator test = new Calculator();

	@Test
	void inverseNaturalLog() {
		double expectedResult = 1.0;
		double result = test.inverseNaturalLog(0);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void inverseNaturalLog1() {
		double expectedResult = 148.41315910257657;
		double result = test.inverseNaturalLog(5);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void inverseNaturalLog2() {
		double expectedResult = 0.018315638888734186;
		double result = test.inverseNaturalLog(-4);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void inverseNaturalLog3() {
		double expectedResult = 2.181472265498201;
		double result = test.inverseNaturalLog(0.78);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void inverseNaturalLog4() {
		double expectedResult = 0.10539922456186435;
		double result = test.inverseNaturalLog(-2.25);
		assertEquals(expectedResult, result);
	}
}

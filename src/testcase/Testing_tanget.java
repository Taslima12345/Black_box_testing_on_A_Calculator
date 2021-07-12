package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_tanget {

	double delta = 1e-8;
	
	Calculator test = new Calculator();

	@Test
	void tangent() {
		double expectedResult = 0;
		double result = test.tangent(0);
		assertEquals(expectedResult, result);
	}

	
	@Test
	void tangent1() {
		double expectedResult = 1.61977519054;
		double result = test.tangent(45);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void tangent2() {
		double expectedResult = -1.99520041221;
		double result = test.tangent(90);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void tangent3() {
		double expectedResult = -0.08871575677;
		double result = test.tangent(135);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void tangent4() {
		double expectedResult = 1.33869021035;
		double result = test.tangent(180);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void tangent5() {
		double expectedResult = 4.95614153291;
		double result = test.tangent(215);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void tangent6() {
		double expectedResult = -0.17883906379;
		double result = test.tangent(270);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void tangent7() {
		double expectedResult = 6.40659835627;
		double result = test.tangent(325);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void tangent8() {
		double expectedResult = -3.38014041396;
		double result = test.tangent(360);
		assertEquals(expectedResult, result,delta);
	}
}

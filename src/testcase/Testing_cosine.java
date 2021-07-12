package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_cosine {

	double delta = 1e-8;
	
	Calculator test = new Calculator();

	@Test
	void cosine() {
		double expectedResult = 1;
		double result = test.cosine(0);
		assertEquals(expectedResult, result);
	}

	
	@Test
	void cosine1() {
		double expectedResult = 0.15425144988;
		double result = test.cosine(30);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void cosine2() {
		double expectedResult = -0.44807361612;
		double result = test.cosine(90);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void cosine3() {
		double expectedResult = -0.99608783514;
		double result = test.cosine(135);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void cosine4() {
		double expectedResult = -0.59846006905;
		double result = test.cosine(180);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void cosine5() {
		double expectedResult = 0.19778402522;
		double result = test.cosine(215);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void cosine6() {
		double expectedResult = 0.98438195063;
		double result = test.cosine(270);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void cosine7() {
		double expectedResult = -0.15422166624;
		double result = test.cosine(325);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void cosine8() {
		double expectedResult = -0.28369109148;
		double result = test.cosine(360);
		assertEquals(expectedResult, result,delta);
	}

}

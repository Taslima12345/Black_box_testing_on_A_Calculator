package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_Sine {

	double delta = 1e-8;
	
	Calculator test = new Calculator();

	@Test
	void sine() {
		double expectedResult = 0;
		double result = test.sine(0);
		assertEquals(expectedResult, result);
	}

	
	@Test
	void sine1() {
		double expectedResult = 0.85090352453;
		double result = test.sine(45);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void sine2() {
		double expectedResult = 0.8939966636;
		double result = test.sine(90);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void sine3() {
		double expectedResult = 0.0883686861;
		double result = test.sine(135);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void sine4() {
		double expectedResult = -0.80115263573;
		double result = test.sine(180);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void sine5() {
		double expectedResult = 0.98024562195;
		double result = test.sine(215);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void sine6() {
		double expectedResult = -0.17604594647;
		double result = test.sine(270);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void sine7() {
		double expectedResult = -0.98803627345;
		double result = test.sine(325);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void sine8() {
		double expectedResult = 0.95891572341;
		double result = test.sine(360);
		assertEquals(expectedResult, result,delta);
	}
}

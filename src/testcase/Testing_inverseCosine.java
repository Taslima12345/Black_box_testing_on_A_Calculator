package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_inverseCosine {

	double delta = 1e-8;
	
	Calculator test = new Calculator();

	@Test
	void inverseCosine () {
		double expectedResult = 1.57079632679;
		double result = test.inverseCosine(0);
		assertEquals(expectedResult, result,delta);
	}

	
	@Test
	void inverseCosine1() {
		double unexpectedResult = 0.0;
		double result = test.inverseCosine(45);
		assertNotEquals(unexpectedResult, result);
	}
	
	@Test
	void inverseCosine2() {
		double unexpectedResult = 0.0;
		double result = test.inverseCosine(90);
		assertNotEquals(unexpectedResult, result);
	}
	
	@Test
	void inverseCosine3() {
		double unexpectedResult = 0.0;
		double result = test.inverseCosine(180);
		assertNotEquals(unexpectedResult, result);
	}
	
	@Test
	void inverseCosine4() {
		double unexpectedResult = -0.17604594647;
		double result = test.inverseCosine(270);
		assertNotEquals(unexpectedResult, result);
	}

	
	@Test
	void inverseCosine5() {
		double unexpectedResult = 0.95891572341;
		double result = test.inverseCosine(360);
		assertNotEquals(unexpectedResult, result);
	}

}

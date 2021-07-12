package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_inverseSine {

	
	Calculator test = new Calculator();

	@Test
	void inverseSine () {
		double expectedResult = 0;
		double result = test.inverseSine(0);
		assertEquals(expectedResult, result);
	}

	
	@Test
	void inverseSine1() {
		double expectedResult = 0.0;
		double result = test.inverseSine(45);
		assertNotEquals(expectedResult, result);
	}
	
	@Test
	void inverseSine2() {
		double unexpectedResult = 0.0;
		double result = test.inverseSine(90);
		assertNotEquals(unexpectedResult, result);
	}
	
	@Test
	void inverseSine3() {
		double unexpectedResult = 0.0;
		double result = test.inverseSine(180);
		assertNotEquals(unexpectedResult, result);
	}
	
	@Test
	void inverseSine4() {
		double unexpectedResult = -0.17604594647;
		double result = test.inverseSine(270);
		assertNotEquals(unexpectedResult, result);
	}

	
	@Test
	void inverseSine5() {
		double unexpectedResult = 0.95891572341;
		double result = test.inverseSine(360);
		assertNotEquals(unexpectedResult, result);
	}

}

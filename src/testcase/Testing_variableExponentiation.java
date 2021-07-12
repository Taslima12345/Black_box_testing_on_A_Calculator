package testcase;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_variableExponentiation {

	double delta = 1e-8;
	
	Calculator test = new Calculator();

	@Test
	void variableExponentiation() {
		double expectedResult = 100.0;
		double result = test.variableExponentiation(10,2);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void variableExponentiation1() {
		double expectedResult = 0.01;
		double result = test.variableExponentiation(10,-2);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void variableExponentiation2() {
		double unexpectedResult = 1.69824365E100;
		double result = test.variableExponentiation(10,100.23);
		assertNotEquals(unexpectedResult, result);
	
		
	}
	
	@Test
	void variableExponentiation3() {
		double expectedResult = 1.698244E-151;
		double result = test.variableExponentiation(10,-150.77);
		assertEquals(expectedResult, result ,delta);
	}
	
	@Test
	void variableExponentiation4() {
		double expectedResult = 1.0;
		double result = test.variableExponentiation(10,0);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void variableExponentiation5() {
		double expectedResult = 0.0;
		double result = test.variableExponentiation(0,2);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void variableExponentiation6() {
		double expectedResult = 50028.2689;
		double result = test.variableExponentiation(-223.67,2);
		assertEquals(expectedResult, result, delta);
	}
	
	@Test
	void variableExponentiation7() {
		double expectedResult = -343000000.0;
		double result = test.variableExponentiation(-700,3);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void variableExponentiation8() {
		double expectedResult = 6250000.0;
		double result = test.variableExponentiation(50,4);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void variableExponentiation9() {
		double expectedResult = 0.01570341894;
		double result = test.variableExponentiation(-7.98,-2);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void variableExponentiation10() {
		double expectedResult = 1.0;
		double result = test.variableExponentiation(0,0);
		assertEquals(expectedResult, result);
	}

	
	@Test
	void variableExponentiation11() {
		double expectedResult = 1.0115530218E10;
		double result = test.variableExponentiation(100.23,5);
		assertNotEquals(expectedResult, result);
	}
}

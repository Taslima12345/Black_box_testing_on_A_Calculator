package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_inverseTangent {

	double delta = 1e-8;
	
	Calculator test = new Calculator();

	@Test
	void inverseTangent() {
		double expectedResult = 0;
		double result = test.inverseTangent(0);
		assertEquals(expectedResult, result);
	}

	
	@Test
	void inverseTangent2() {
		double expectedResult = 1.5485777614681775;
		double result = test.inverseTangent(45);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void inverseTangent3() {
		double expectedResult = 1.5596856728972892;
		double result = test.inverseTangent(90);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void inverseTangent4() {
		double expectedResult = 1.5633890548637315;
		double result = test.inverseTangent(135);
		assertEquals(expectedResult, result,delta);
	}
	
	@Test
	void inverseTangent5() {
		double expectedResult = 1.565240828394204;
		double result = test.inverseTangent(180);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void inverseTangent6() {
		double expectedResult = 1.5661451975437872;
		double result = test.inverseTangent(215);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void inverseTangent7() {
		double expectedResult = 1.5670926400261413;
		double result = test.inverseTangent(270);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void inverseTangent8() {
		double expectedResult = 1.5677194134281294;
		double result = test.inverseTangent(325);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void inverseTangent9() {
		double expectedResult = 1.568018556161576;
		double result = test.inverseTangent(360);
		assertEquals(expectedResult, result);
	}
}

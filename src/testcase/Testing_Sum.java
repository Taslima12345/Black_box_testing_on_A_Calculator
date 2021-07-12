package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_Sum {
	
	Calculator test = new Calculator();
	
	 double delta = 1e-8;

	@Test
	void test_sum() {
		
		double expectedResult = 35;
		double result = test.sum(5,30);
		assertEquals(expectedResult, result);		
	}
	
	@Test
	void test_sum1() {
		
		double expectedResult = -70;
		double result = test.sum(5,-75);
		assertEquals(expectedResult, result);		
	}
	
	@Test
	void test_sum2() {
		
		double expectedResult = 3;
		double result = test.sum(5,-2);
		assertEquals(expectedResult, result);		
	}
	
	@Test
	void test_sum3() {
		
		double expectedResult = 42.3;
		double result = test.sum(5,37.3);
		assertEquals(expectedResult, result);		
	}
	
	@Test
	void test_sum4() {
		
		double expectedResult = -38.7;
		double result = test.sum(5,-43.7);
		assertEquals(expectedResult, result);		
	}
	
	@Test
	void test_sum5() {
		
		double expectedResult = 2.4;
		double result = test.sum(5,-2.6);
		assertEquals(expectedResult, result);		
	}
	
	@Test
	void test_sum6() {
		
		double expectedResult = 5;
		double result = test.sum(5,0);
		assertEquals(expectedResult, result);		
	}
	
	
	@Test
	void test_sum7() {
		
		double expectedResult = 30;
		double result = test.sum(0,30);
		assertEquals(expectedResult, result);		
	}
	
	@Test
	void test_sum8() {
		
		double expectedResult = 23;
		double result = test.sum(-7,30);
		assertEquals(expectedResult, result);		
	}
	
	@Test
	void test_sum9() {
		
		double expectedResult = -27;
		double result = test.sum(-57,30);
		assertEquals(expectedResult, result);		
	
		
	}
	
	@Test
	void test_sum10() {
		
		double expectedResult = 53.67;
		double result = test.sum(23.67,30);
		assertEquals(expectedResult, result);		
	}

	@Test
	void test_sum11() {
		
		double expectedResult = 2.11;
		double result = test.sum(-27.89,30.00);
		assertEquals(expectedResult, result, delta);
		
	
	}
	
	@Test
	void test_sum12() {
		
		double expectedResult = -17.8;
		double result = test.sum(-47.8,30);	
		assertEquals(expectedResult, result, delta);
	
	}
	
	
	@Test
	void test_sum13() {
		
		double expectedResult = -143.67;
		double result = test.sum(-88,-55.67);
		assertEquals(expectedResult, result, delta);
		
	
	}
	@Test
	void test_sum14() {
		
		double expectedResult = 1.797684433E7;
		double result = test.sum(1.79769E7,-55.67);
		assertEquals(expectedResult, result, delta);
	}
	

	
}

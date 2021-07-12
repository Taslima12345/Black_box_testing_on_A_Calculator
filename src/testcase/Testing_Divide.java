package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_Divide {
	
	double delta = 1e-8;
	
	Calculator test = new Calculator();

	
	@Test
	void test_divide() {
		
		double expectedResult = 5;
		double result = test.divide(10,2);
		assertEquals(expectedResult, result);
		
		
	}
	
	
	@Test
	void test_divide1() {
		
		double expectedResult = 0.5;
		double result = test.divide(10,20);
		assertEquals(expectedResult, result);;
		
	}
	
	
	@Test
	void test_divide2() {
		
		double expectedResult = -5;
		double result = test.divide(10,-2);
		assertEquals(expectedResult, result);;
		
	}
	
	
	@Test
	void test_divide3() {
		
		double expectedResult = -0.4;
		double result = test.divide(10,-25);
		assertEquals(expectedResult, result);;
		
	}
	
	
	@Test
	void test_divide5() {
		
		double expectedResult = 4;
		double result = test.divide(10,2.5);
		assertEquals(expectedResult, result);;
		
	}
	
	
	@Test
	void test_divide6() {
		
		double expectedResult = 0.2183406114;
		double result = test.divide(10,45.8);
		assertEquals(expectedResult, result, delta);
		
				
	}
	
	@Test
	void test_divide7() {
		
		double expectedResult = -1.449275362;
		double result = test.divide(10,-6.9);
		assertEquals(expectedResult, result, delta);
		
	}
	
	@Test
	void test_divide8() {
		
		double expectedResult = -0.4608294931;
		double result = test.divide(10,-21.7);
		assertEquals(expectedResult, result, delta);
		
	}
	
	@Test
	void test_divide9() {
		
		double expectedResult = -1;
		double result = test.divide(10,0);		
		assertEquals(expectedResult, result, delta);
		
	}

	@Test
	void test_divide10() {
		
		double expectedResult = -5;
		double result = test.divide(-10,2);
		assertEquals(expectedResult, result);
		
		
	}
	
	
	@Test
	void test_divide11() {
		
		double expectedResult = -0.5;
		double result = test.divide(-10,20);
		assertEquals(expectedResult, result);;
		
	}
	
	@Test
	void test_divide12() {
		
		double expectedResult = 5;
		double result = test.divide(-10,-2);
		assertEquals(expectedResult, result);;
		
	}
	
	@Test
	void test_divide13() {
		
		double expectedResult = -4;
		double result = test.divide(-10,2.5);
		assertEquals(expectedResult, result);;
		
	}
	
	
	@Test
	void test_divide14() {
		
		double expectedResult = -0.2183406114;
		double result = test.divide(-10,45.8);
		assertEquals(expectedResult, result, delta);
		
				
	}
	
	
	@Test
	void test_divide15() {
		
		double expectedResult = 1.449275362;
		double result = test.divide(-10,-6.9);
		assertEquals(expectedResult, result, delta);
		
	}
	
	

	@Test
	void test_divide16() {
		
		double expectedResult = 0.4608294931;
		double result = test.divide(-10,-21.7);
		assertEquals(expectedResult, result, delta);
		
	}
	
	
	
	@Test
	void test_divide18() {
		
		double expectedResult = -1;
		double result = test.divide(0,0);		
		assertEquals(expectedResult, result, delta);
		
	}


	
	@Test
	void test_divide19() {
		
		double expectedResult = -4.8;
		double result = test.divide(-9.6,2);
		assertEquals(expectedResult, result);;
		
	}
	
	
	@Test
	void test_divide20() {
		
		double expectedResult = 44.835;
		double result = test.divide(89.67,2);
		assertEquals(expectedResult, result);
		
	}
	
	
	@Test
	void Ttest_divide21() {
		
		double expectedResult = 0.39;
		double result = test.divide(0.78,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_divide22() {
		
		double expectedResult = -0.645;
		double result = test.divide(-1.29,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_divide23() {
		
		double expectedResult = 0;
		double result = test.divide(0,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_divide24() {
		
		double expectedResult = 33.545;
		double result = test.divide(-67.09,-2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_divide25() {
		
		double expectedResult = -44.835;
		double result = test.divide(89.67,-2);
		assertEquals(expectedResult, result);
		
	}
	
	

	@Test
	void test_divide26() {
		
		double expectedResult = -0.049;
		double result = test.divide(0.098,-2);
		assertEquals(expectedResult, result);
		
	}
	
	

	@Test
	void test_divide27() {
		
		double expectedResult = 0.338;
		double result = test.divide(-0.6760,-2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_divide28() {
		
		double expectedResult = -0.4;
		double result = test.divide(10,-25);
		assertEquals(expectedResult, result);;
		
	}
	
	
}

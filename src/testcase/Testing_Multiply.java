package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;

class Testing_Multiply {
	
	 double delta = 1e-8;
	
	Calculator test = new Calculator();

	@Test
	void test_multiply() {	
		
		double expectedResult = 18;
		double result = test.multiply(9,2);
		assertEquals(expectedResult, result);
		
	}
	
	
	@Test
	void test_multiply1() {	
		
		double expectedResult = -675;
		double result = test.multiply(9,-75);
		assertEquals(expectedResult, result);
		
	}
	
	
	@Test
	void test_multiply2() {	
		
		double expectedResult = 804.06;
		double result = test.multiply(9,89.34);
		assertEquals(expectedResult, result, delta);
		
	}
	
	
	@Test
	void test_multiply3() {	
		
		double expectedResult = -313.02;
		double result = test.multiply(9,-34.78);
		assertEquals(expectedResult, result);
		
	}
	
	
	@Test
	void test_multiply4() {	
		
		double expectedResult = 0;
		double result = test.multiply(9,0);
		assertEquals(expectedResult, result);
		
	}
	
	
	@Test
	void test_multiply5() {	
		
		double expectedResult = -18.0;
		double result = test.multiply(-9,2);
		assertEquals(expectedResult, result);
		
	}
	
	
	@Test
	void test_multiply6() {	
		
		double expectedResult = 675;
		double result = test.multiply(-9,-75);
		assertEquals(expectedResult, result);
		
	}
	
	
	@Test
	void test_multiply7() {	
		
		double expectedResult = -804.06;
		double result = test.multiply(-9,89.34);	
		assertEquals(expectedResult, result, delta);
		
	}

	
	@Test
	void test_multiply8() {	
		
		double expectedResult = 6110.1;
		double result = test.multiply(-9,-678.90);
		assertEquals(expectedResult, result, delta);
		
	}
	
	
	@Test
	void test_multiply9() {	
		
		double expectedResult = -0.0;
		double result = test.multiply(-9,0);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_multiply10() {	
		
		double expectedResult = -18;
		double result = test.multiply(-9,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_multiply11() {	
		
		double expectedResult = 109.578;
		double result = test.multiply(54.789,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_multiply12() {	
		
		double expectedResult = -1.56;
		double result = test.multiply(-0.78,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_multiply13() {	
		
		double expectedResult = 0;
		double result = test.multiply(0,2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_multiply14() {	
		
		double expectedResult = -18;
		double result = test.multiply(9,-2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_multiply15() {	
		
		double expectedResult = -17;
		double result = test.multiply(8.5,-2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_multiply16() {	
		
		double expectedResult = -196.18;
		double result = test.multiply(98.09,-2);
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test_multiply17() {	
		
		double expectedResult = 0;
		double result = test.multiply(0,-2);
		assertEquals(expectedResult, result, delta);
		
	}
	
	
	@Test
	void test_multiply18() {	
		
		double expectedResult = 0;
		double result = test.multiply(0,0);
		assertEquals(expectedResult, result);
		
	}

	
}

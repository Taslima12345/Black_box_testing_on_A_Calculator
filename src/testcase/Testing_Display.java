package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.Calculator;
import io.michaelcane.Display;
import io.michaelcane.User;

class Testing_Display {
	
	Display test = new Display();
	
	
	@Test
	void display() {	
		
		double expectedResult = 0;
		double result = test.getState();
		assertEquals(expectedResult, result);
		
	}

	@Test
	void display2() {	
		
		double expectedResult = 0;
		double result = test.showDisplay();
		assertEquals(expectedResult, result);
		
	}
	
	
	@Test
	void display3() {	
		
		double expectedResult = 0;
		double result = test.clearError();
		assertEquals(expectedResult, result);
		
	}
	
	
	

}

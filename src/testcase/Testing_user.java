package testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.michaelcane.User;

class Testing_user {
	
	User test2 = new User();

	@Test
	void user() {	
		
		double expectedResult = 0.0;
		double result = test2.getMemory();
		assertEquals(expectedResult, result);
		
	}

	

	@Test
	void user1() {	
		
		String expectedResult = "";
		String result = test2.getInput();
		assertEquals(expectedResult, result);
			
	}

}

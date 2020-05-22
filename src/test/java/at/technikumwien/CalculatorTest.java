package at.technikumwien;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator;
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() {
	}

	@Test
	void testSum() {
		var result = calculator.sum(1,2);
		
		assertEquals(3, result);
	}
	
	@Test
	void testSumWithNoParamter() {		
		var result = calculator.sum();
		
		assertEquals(0, result);
	}
	
	@Test
	void testSumWithNull() {		
		var result = calculator.sum(null);
		
		assertEquals(0, result);
	}

}

package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticTest {

	@Test
	void testSum() {
		int expResult = 10, result;
		Arithmetic ar = new Arithmetic();
		result = ar.sum(2, 8);
		assertEquals(expResult, result);
	}

	@Test
	void testMultiply() {
		int expResult = 16, result;
		Arithmetic ar = new Arithmetic();
		result = ar.multiply(2, 8);
		assertEquals(expResult, result);
	}

}

package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add two numbers");

	}

	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils = new MathUtils();
		int expected = 75;
		int actual = mathUtils.computeCircleArea(5);
		assertEquals(expected, actual);

//		assertEquals(75, mathUtils.computeCircleArea(5), "Area of Circe should be calculated"); This can also be used
	}

	@Test
	void testDivide() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw Exception");

	}

}

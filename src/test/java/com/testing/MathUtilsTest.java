package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "The add method should add two numbers");

	}

}

package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@TestInstance(Lifecycle.PER_METHOD) // default
@TestInstance(Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeAll
	static void beforeAll() {
		System.out.println("This needs to run before All");
	}

	@BeforeEach // Run this everytime before every instance
	void init() {
		mathUtils = new MathUtils();
	}

	@AfterEach
	void cleanup() {
		System.out.println("Cleanig up .....");
	}

	@Test
	@DisplayName("Testing add method")
	void testAdd() {
//		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		System.out.println("method 1");
		assertEquals(expected, actual, "The add method should add two numbers");

	}

	@Test
	void testComputeCircleArea() {
//		MathUtils mathUtils = new MathUtils();
		int expected = 75;
		int actual = mathUtils.computeCircleArea(5);
		System.out.println("method 2");
		assertEquals(expected, actual);

//		assertEquals(75, mathUtils.computeCircleArea(5), "Area of Circe should be calculated"); This can also be used
	}

	@Test
//	@EnabledOnOs(OS.LINUX) // this works only on Linux os
	void testDivide() {
//		MathUtils mathUtils = new MathUtils();
		System.out.println("method 3");
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw Exception");

	}

	@Test
	@DisplayName("This method should fail")
	@Disabled
	void testDisabled() {
		fail("Should not get implemented");
	}

}

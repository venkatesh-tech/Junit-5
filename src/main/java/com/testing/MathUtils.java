package com.testing;

public class MathUtils {

	public int add(int a, int b) {
		return a + b;
	}

	public int computeCircleArea(int radius) {
		int a = (int) Math.PI * radius * radius;
		return a;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return (int) a / b;
	}
}

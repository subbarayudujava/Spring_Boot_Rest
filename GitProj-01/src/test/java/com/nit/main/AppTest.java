package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals; // Correct import for JUnit 5
import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void testSumWithPositive() {
		App app = new App();
		int expected = 300;
		int actual = app.sum(100, 200);
		assertEquals(expected, actual); // Use assertEquals with expected and actual values
	}

	@Test
	public void testSumWithNegitive() {
		App app = new App();
		int expected = -300;
		int actual = app.sum(-100, -200);
		assertEquals(expected, actual); // Use assertEquals with expected and actual values
	}

	@Test
	public void testSumWithMixed() {
		App app = new App();
		int expected = 100;
		int actual = app.sum(-100, 200);
		assertEquals(expected, actual); // Use assertEquals with expected and actual values
	}
	@Test
	public void testSumWithZeros() {
		App app = new App();
		int expected = 0;
		int actual = app.sum(0,0);
		assertEquals(expected, actual); // Use assertEquals with expected and actual values
	}
}

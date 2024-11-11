package org.example.BasicPathTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AverageCalculatorTest {

//	min: 0, max: 100

	private AverageCalculator calculator = new AverageCalculator();

	@Test
	public void testImmediateTermination() {
		int[] values = { -999 };
		assertEquals(-999, calculator.average(values, 0, 100));
	}

	@Test
	public void testValidValues() {
		int[] values = { 10, 20, 30, -999 };
		assertEquals(20, calculator.average(values, 0, 100));
	}

	@Test
	public void testInvalidValues() {
		int[] values = { 150, 200, -999 };
		assertEquals(-999, calculator.average(values, 0, 100));
	}

	@Test
	public void testMixedValidAndInvalidValues() {
		int[] values = { 40, 150, 60, -999 };
		assertEquals(50, calculator.average(values, 0, 100));
	}
}

package com.sapient.testing.numbers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumberTesting {

	@Test
	public void testPrime() {
		assertTrue("Prime test failed", Number.checkPrime(41));
	}

	@Test
	public void testArmstrong() {
		assertTrue("Prime test failed", Number.checkArmstrong(153));
	}

	@Test
	public void testPalindrome() {
		assertTrue("Prime test failed", Number.checkPalindrome(121));
	}
}

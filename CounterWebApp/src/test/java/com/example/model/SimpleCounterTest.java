package com.example.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleCounterTest {

	@Test
	public void test_basic_usage() {
		SimpleCounter sc = new SimpleCounter();
		assertEquals(0, sc.getValue());
		
		sc.increase();
		assertEquals(1, sc.getValue());

		sc.increase();
		assertEquals(2, sc.getValue());

		sc.increase();
		assertEquals(3, sc.getValue());
	}

	@Test
	public void test_extended_usage() {
		SimpleCounter sc = new SimpleCounter(5);
		assertEquals(5, sc.getValue());
		
		sc.increase();
		assertEquals(6, sc.getValue());

		sc.increase();
		assertEquals(7, sc.getValue());

		sc.increase();
		assertEquals(8, sc.getValue());
	}
}

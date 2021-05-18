package com.example.model;

public class SimpleCounter {
	private long counter = 0;
	
	
	public SimpleCounter() {
		this.counter = 0;
	}
	
	public SimpleCounter(long initValue) {
		this.counter = initValue;
	}
	
	public void increase() {
		this.counter = this.counter + 1;
	}

	public long getValue() {
		return this.counter;
	}
}

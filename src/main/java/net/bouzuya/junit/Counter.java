package net.bouzuya.junit;

public class Counter {
	private int count;

	public Counter() {
		count = 0;
	}

	public int increment() {
		count += 1;
		return count;
	}

}

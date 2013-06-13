package net.bouzuya.junit;

public final class NumberUtils {
	private NumberUtils() {
		throw new AssertionError();
	}

	public static boolean isEven(int n) {
		return (n % 2) == 0;
	}
}

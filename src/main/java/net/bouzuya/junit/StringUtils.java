package net.bouzuya.junit;


public final class StringUtils {
	private StringUtils() {
		throw new AssertionError();
	}

	public static String toSnakeCase(String s) {
		return s.replaceAll("([A-Z])", "_$1").toLowerCase().replaceAll("^_", "");
	}

}

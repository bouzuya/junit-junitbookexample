package net.bouzuya.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringUtilsTest {
	
	@Rule
	public ExpectedException ex = ExpectedException.none();

	@Test
	public void toSnakeCaseはスネークケースを返す_aaaの場合() {
		String actual = StringUtils.toSnakeCase("aaa");
		String expected = "aaa";
		assertThat(actual, is(expected));
	}

	@Test
	public void toSnakeCaseはスネークケースを返す_HelloWorldの場合() {
		String actual = StringUtils.toSnakeCase("HelloWorld");
		String expected = "hello_world";
		assertThat(actual, is(expected));
	}

	@Test
	public void toSnakeCaseはスネークケースを返す_practiceJunitの場合() {
		String actual = StringUtils.toSnakeCase("practiceJunit");
		String expected = "practice_junit";
		assertThat(actual, is(expected));
	}

	@Test
	public void toSnakeCaseはNullPointerExceptionを投げる_nullの場合() {
		ex.expect(NullPointerException.class);
		StringUtils.toSnakeCase(null);
	}

}

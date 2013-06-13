package net.bouzuya.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilsTest {

	@Test
	public void isEvenは0を渡すとtrueを返す() throws Exception {
		boolean actual = NumberUtils.isEven(0);
		boolean expected = true;
		assertThat(actual, is(expected));
	}

	@Test
	public void isEvenは偶数を渡すとtrueを返す() throws Exception {
		boolean actual = NumberUtils.isEven(2);
		boolean expected = true;
		assertThat(actual, is(expected));
	}

	@Test
	public void isEvenは奇数を渡すとfalseを返す() throws Exception {
		boolean actual = NumberUtils.isEven(1);
		boolean expected = false;
		assertThat(actual, is(expected));
	}

}

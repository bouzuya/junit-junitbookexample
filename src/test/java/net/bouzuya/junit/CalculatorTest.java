package net.bouzuya.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

	@Rule
	public ExpectedException ex = ExpectedException.none();

	private Calculator sut;

	@Before
	public void setUp() {
		sut = new Calculator();
	}

	@Test
	public void divideは4_2を指定すると2を返す() throws Exception {
		int actual = sut.divide(4, 2);
		int expected = 2;
		assertThat(actual, is(expected));
	}

	@Test
	public void divideは2_1を指定すると2を返す() throws Exception {
		int actual = sut.divide(2, 1);
		int expected = 2;
		assertThat(actual, is(expected));
	}

	@Test
	public void divideは1_2を指定すると0を返す() throws Exception {
		int actual = sut.divide(1, 2);
		int expected = 0;
		assertThat(actual, is(expected));
	}

	@Test
	public void divideは第2引数に0を指定すると例外が発生する() throws Exception {
		ex.expect(IllegalArgumentException.class);
		sut.divide(1, 0);
	}

}

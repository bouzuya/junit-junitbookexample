package net.bouzuya.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class CounterTest {

	public static class 初期状態の場合 {
		private Counter sut;

		@Before
		public void setUp() {
			sut = new Counter();
		}

		@Test
		public void incrementで1を返す() throws Exception {
			int actual = sut.increment();
			int expected = 1;
			assertThat(actual, is(expected));
		}
	}

	public static class incrementが1回実行された場合 {
		private Counter sut;

		@Before
		public void setUp() {
			sut = new Counter();
			sut.increment();
		}

		@Test
		public void incrementで2を返す() throws Exception {
			int actual = sut.increment();
			int expected = 2;
			assertThat(actual, is(expected));
		}
	}

	public static class incrementが50回実行された場合 {
		private Counter sut;

		@Before
		public void setUp() {
			sut = new Counter();
			for (int i = 0; i < 50; i++) {
				sut.increment();
			}
		}

		@Test
		public void incrementで51を返す() throws Exception {
			int actual = sut.increment();
			int expected = 51;
			assertThat(actual, is(expected));
		}
	}

}

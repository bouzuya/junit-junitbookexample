package net.bouzuya.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ItemStockTest {
	public static class 初期状態の場合 {
		private ItemStock sut;
		private Item book;

		@Before
		public void setUp() {
			book = new Item("book", 3800);
			sut = new ItemStock();
		}

		@Test
		public void getNumはbookで0を返す() throws Exception {
			int actual = sut.getNum(book);
			int expected = 0;
			assertThat(actual, is(expected));
		}
	}

	public static class bookをaddした場合 {
		private ItemStock sut;
		private Item book;

		@Before
		public void setUp() {
			book = new Item("book", 3800);
			sut = new ItemStock();
			sut.add(book);
		}

		@Test
		public void getNumはbookで1を返す() throws Exception {
			int actual = sut.getNum(book);
			int expected = 1;
			assertThat(actual, is(expected));
		}
	}

	public static class bookを2回addした場合 {
		private ItemStock sut;
		private Item book;

		@Before
		public void setUp() {
			book = new Item("book", 3800);
			sut = new ItemStock();
			sut.add(book);
			sut.add(book);
		}

		@Test
		public void getNumはbookで2を返す() throws Exception {
			int actual = sut.getNum(book);
			int expected = 2;
			assertThat(actual, is(expected));
		}
	}
}

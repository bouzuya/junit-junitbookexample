package net.bouzuya.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BackgroundTaskTest {
	@Rule
	public Timeout timeout = new Timeout(1000);

	@Test
	public void invokeで別スレッドにて実行される() throws Exception {
		BackgroundTask sut;
		final AtomicReference<String> backgroundThreadNameRef = new AtomicReference<String>();
		final CountDownLatch latch = new CountDownLatch(1);

		Runnable task = new Runnable() {
			@Override
			public void run() {
				String backgroundThreadName = Thread.currentThread().getName();
				backgroundThreadNameRef.set(backgroundThreadName);
				latch.countDown();
			}
		};
		sut = new BackgroundTask(task);

		sut.invoke();
		latch.await();
		String currentThreadName = Thread.currentThread().getName();
		assertThat(backgroundThreadNameRef.get(), is(not(currentThreadName)));
	}

}

package com.gyx.thread;
/**
 * join:合并线程
 * @author 郭蝈
 *
 */
public class TestJoin extends Thread {
	public static void main(String[] args) throws InterruptedException {
		TestJoin demo = new TestJoin();
		Thread t = new Thread(demo);
		t.start();

		for (int i = 0; i < 1000; i++) {
			if (50 == i) {
				t.join();
			}
			System.out.println("main...." + i);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("join...." + i);
		}
	}
	
}

package com.gyx.thread;

import java.lang.Thread.State;

/**
 * 测试所有状态
 * @author 郭蝈
 *
 */
public class AllStatus {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("....");
		});
		// 观察状态
		State state = t.getState();
		System.out.println(state);// NEW

		t.start();
		state = t.getState();
		System.out.println(state);// RUNNABLE

		while (true) {
			int num = Thread.activeCount();//活动线程数
			System.out.println(num);
			if (num == 1) {
				break;
			}
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		state = t.getState();
		System.out.println(state);// TIME_WAITED
		state = t.getState();
		System.out.println(state);// TERMINATED
	}
}

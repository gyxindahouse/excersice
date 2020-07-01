package com.gyx.syn;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 测试定时器抽象类
 * 
 * @author 郭蝈
 *
 */
public class TestTimer {
	public static void main(String[] args) {
		Timer t1 = new Timer();
		MyTask task1 = new MyTask();
		t1.schedule(task1, 3000);// 3s后执行
	}
}

class MyTask extends TimerTask {// 自定义线程类继承timertask类
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("任务1：" + i);
		}
	}

}

package com.gyx.syn;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 高级并发容器，内含synchronized同步模块
 * @author 郭蝈
 *
 */
public class SynContainer {
	public static void main(String[] args) throws InterruptedException {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		for(int i= 0; i<10000;i++){
			new Thread(()->{
				list.add(Thread.currentThread().getName());
			}).start();
		}
		Thread.sleep(10000);
		System.out.println(list.size());
	}
}

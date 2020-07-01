package com.gyx.thread;
/**
 * 优先级低只是意味着获取调度的概率低 并不是绝对先调用优先级高的线程后调用低的线程
 * @author Administrator
 *
 */
public class TestPriority {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread1(), "t1");
		Thread t2 = new Thread(new MyThread1(), "t2");
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}
class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
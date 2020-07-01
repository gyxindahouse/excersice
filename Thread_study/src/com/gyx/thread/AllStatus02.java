package com.gyx.thread;
/**
 * 获取线程状态信息
 * @author 郭蝈
 *
 */
public class AllStatus02 {
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new MyThread();
		Thread t = new Thread(r, "Name test");//定义线程对象，并传入参数；
		t.start();
		System.out.println("name is:"+t.getName());//输出线程名称；
		Thread.currentThread().sleep(5000);//线程暂停5分钟
		System.out.println(t.isAlive());//判断线程还在运行吗？
		System.out.println("over!");
	}

	
}
class MyThread implements Runnable{
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(i);
		}		
	}
}
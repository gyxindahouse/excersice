package com.gyx.thread;
/**
 * 使用runnable共享资源 并发
 * @author 郭蝈
 *
 */
public class TestWeb12306 implements Runnable{
	//票数
	private int ticketNums = 99;
	
	@Override
	public void run() {
		while(true){
			if(ticketNums < 0){
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---->"+ticketNums--);
		}		
	}
	public static void main(String[] args) {
		//一份资源
		TestWeb12306 web = new TestWeb12306();
		System.out.println(Thread.currentThread().getName());
		//多个代理
		new Thread(web,"dl1").start();
		new Thread(web,"dl2").start();
		new Thread(web,"dl3").start();
	}
}

package com.gyx.thread;
/**
 * 守护线程：是为用户线程服务的：jvm停止不用等待守护线程执行完毕
 * 默认：用户线程jvm等待用户线程执行完毕才会停止
 * @author 郭蝈
 *
 */
public class TestDaemon {
	public static void main(String[] args) {
		God god = new God();
		YOU1 you = new YOU1();
		Thread t = new Thread(god);
		t.setDaemon(true);//将用户线程调整为守护
		t.start();
		new Thread(you).start();
	
	}
}
class YOU1 implements Runnable{
	public void run() {
		for(int i=1; i<365*100;i++){
			System.out.println("happy life...");
		}
		System.out.println("oooo....");
	}
}
class God implements Runnable{
	public void run() {
		for(;true;){
			System.out.println("bless you...");
		}
	}
}

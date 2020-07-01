package com.gyx.thread;
/**
 * 继承Thread类实现多线程的步骤：
 * 1、在java中负责实现线程功能的类是Java.lang.Thread
 * 2、可以通过创建Thread的实例来创建新的线程
 * 3、每个线程都是通过某个特定的Thread对象对应的方法run来完成其操作，
 * 方法run为线程体
 * 4、通过调用Thread类的start方法来启动一个线程
 * @author 郭蝈
 *
 */
public class Test01 extends Thread {//自定义类继承Thread类
	//run（）方法是线程体
	public void run(){
		for(int i = 0;i<10;i++){
			System.out.println(this.getName()+":"+i);
		}
	}
	public static void main(String[] args) {
		Test01 thread1 = new Test01();//创建线程对象
		thread1.start();//启动线程
		Test01 thread2 = new Test01();
		thread2.start();
	}

}

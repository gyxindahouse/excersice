package com.gyx.thread;
/**
 * 测试yield
 * @author 郭蝈
 *
 */
public class TestYield01 extends Thread{
	public static void main(String[] args) {
		TestYield01 test = new TestYield01();
		Thread t = new Thread(test);
		t.start();
		
		for(int i=0;i<1000;i++){
			if(i%20==0){
				Thread.yield();
			}
			System.out.println("main..."+i);
		}
	}

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("yield...."+i);
		}
	}
	
}

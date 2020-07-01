package com.gyx.thread;
/**
 * 终止线程
 * 1、线程正常执行完毕--》次数
 * 2、外部干涉--》加入标志
 * 不要使用stop destroy
 * @author 郭蝈
 *
 */
public class TestTerminateThread implements Runnable {
	private String name;
	private boolean flag = true;//加入标识 标记线程体是否可以运行

	public TestTerminateThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		int i = 0;
		//2、关联标识，true---》运行 false----》停止
		while (flag) {
			System.out.println(name + "--->" + i++);
		}
	}
	//3、对外提供方法改变标识
	public void terminate() {
		this.flag = flag;
		flag = false;
	}

	public static void main(String[] args) {
		TestTerminateThread tt = new TestTerminateThread("cluo");
		new Thread(tt).start();

		for (int i = 0; i < 99; i++) {
			if (i == 88) {
				tt.terminate();//线程的终止
				System.out.println("tt game over");
			}
			System.out.println("main-->" + i);
		}
	}
}

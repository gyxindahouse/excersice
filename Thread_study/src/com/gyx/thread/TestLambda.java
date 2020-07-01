package com.gyx.thread;
/**
 * lambda推到+参数+返回值
 * @author 郭蝈
 * 避免匿名内部类定义过多
 * 其实质属于函数式编程的概念
 */
public class TestLambda {
	public static void main(String[] args) {
		new Thread(()->{
			for(int i = 0; i<100;i++){
				System.out.println("xxxxx");
			}
		}).start();
		
		new Thread(()->System.out.println("哈哈哈哈")).start();
	}
}

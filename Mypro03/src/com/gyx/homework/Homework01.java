/**
 * 第四章作业
 */
package com.gyx.homework;

public class Homework01 {
	int count = 9;
	public void count1(){
		count = 10;
		System.out.println("count1=" + count);
	}
	public void count2(){
		System.out.println("count2=" + count);
	}
	public static void main(String[] args) {
		Homework01 t = new Homework01();
		t.count1();
		t.count2();
	}
}

/**
 * 第四章作业
 */
package com.gyx.homework;

public class Homework00 {
	int x, y;
	Homework00(int x, int y){
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		Homework00 pt1, pt2;
		pt1 = new Homework00(3, 3);
		pt2 = new Homework00(4, 4);
		System.out.print(pt1.x + pt2.x);
	}
}

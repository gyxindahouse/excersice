/**
 *  定义一个圆类——Circle，在类的内部提供一个属性：半径(r)，
 *  同时提供两个方法 ： 计算 面积 ( getArea() ) 和 计算 周长(getPerimeter()) 。 
 *  通过两个方法计算圆的周长和面积并且对计算结果进行输出。
 *  最后定义一个测试类对 Circle 类进行使用。
 */
package com.gyx.homework;

//import java.util.Scanner;

/* 自己写的
 * public class Circle {
	double r;// 半径

	Circle(double r) {
		this.r = r;
	}

	public static void getArea(double r) {
		double area = Math.PI * r * r;
		System.out.println("面积：" + area);
	}

	public static void getPerimeter(double r) {
		double perimeter = 2 * Math.PI * r;
		System.out.println("周长: " + perimeter);
	}

	public static void main(String[] args) {
		
		 //Circle r = new Circle(3.42); r.getArea(); r.getPerimeter();
		 
		Scanner input = new Scanner(System.in);
		System.out.print("请输入半径： ");
		double r = input.nextDouble();
		getArea(r);
		getPerimeter(r);
	}
}*/

public class Circle{
	double r;
	
	public Circle(double r){
		this.r = r;
	}
	
	public void getArea(){
		float area = (float)(r * r * Math.PI);
		System.out.println("面积为：" + area);
	}
	
	public void getPerimeter(){
		float perimeter = (float)(2 * Math.PI * r);
		System.out.println("周长为： " + perimeter);
	}
	
	public static void main(String[] args) {
		Circle test = new Circle(8.909);
		test.getArea();
		test.getPerimeter();
	}
}




/**
 *  ����һ��Բ�ࡪ��Circle��������ڲ��ṩһ�����ԣ��뾶(r)��
 *  ͬʱ�ṩ�������� �� ���� ��� ( getArea() ) �� ���� �ܳ�(getPerimeter()) �� 
 *  ͨ��������������Բ���ܳ���������ҶԼ��������������
 *  �����һ��������� Circle �����ʹ�á�
 */
package com.gyx.homework;

//import java.util.Scanner;

/* �Լ�д��
 * public class Circle {
	double r;// �뾶

	Circle(double r) {
		this.r = r;
	}

	public static void getArea(double r) {
		double area = Math.PI * r * r;
		System.out.println("�����" + area);
	}

	public static void getPerimeter(double r) {
		double perimeter = 2 * Math.PI * r;
		System.out.println("�ܳ�: " + perimeter);
	}

	public static void main(String[] args) {
		
		 //Circle r = new Circle(3.42); r.getArea(); r.getPerimeter();
		 
		Scanner input = new Scanner(System.in);
		System.out.print("������뾶�� ");
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
		System.out.println("���Ϊ��" + area);
	}
	
	public void getPerimeter(){
		float perimeter = (float)(2 * Math.PI * r);
		System.out.println("�ܳ�Ϊ�� " + perimeter);
	}
	
	public static void main(String[] args) {
		Circle test = new Circle(8.909);
		test.getArea();
		test.getPerimeter();
	}
}




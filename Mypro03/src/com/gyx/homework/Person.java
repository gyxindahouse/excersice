/**
 *  ��д Java����������ʾ�˵����������䡣����һ������Person��
 *  ������Ӧ��������˽�����ԣ� ���� (name) ������ (age) ��
 *  ���幹�췽��������ʼ�����ݳ�Ա���ٶ�����ʾ(display()) �����������������ӡ������
 *  �� main �����д��������ʵ��Ȼ����Ϣ��ʾ��
 */
package com.gyx.homework;
import java.util.Scanner;

public class Person {
	 String name;
	 int age;
	 Person(String name, int age){ //���췽��,��ʼ��
		 this.name = name;
		 this.age = age;
	 }
	 public static void Display(String name, int age){
		 System.out.println("������" + name);
		 System.out.println("���䣺" + age);
	 }
	 public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("����������:");
		String name = input.next(); // �ַ�
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		System.out.println("����������:");
		int age = input1.nextInt();// ����
		Display(name, age);
	}
}

//��
/* public class Person {
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("����:"+name);
        System.out.println("����:"+age);
    }
}
class  ch4_1{
    public static void main(String[] args) {
        Person tom = new Person("tom",18);
        tom.display();
    }
}*/


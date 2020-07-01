/**
 *  编写 Java程序用于显示人的姓名和年龄。定义一个人类Person。
 *  该类中应该有两个私有属性： 姓名 (name) 和年龄 (age) 。
 *  定义构造方法用来初始化数据成员。再定义显示(display()) 方法将姓名和年龄打印出来。
 *  在 main 方法中创建人类的实例然后将信息显示。
 */
package com.gyx.homework;
import java.util.Scanner;

public class Person {
	 String name;
	 int age;
	 Person(String name, int age){ //构造方法,初始化
		 this.name = name;
		 this.age = age;
	 }
	 public static void Display(String name, int age){
		 System.out.println("姓名：" + name);
		 System.out.println("年龄：" + age);
	 }
	 public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名:");
		String name = input.next(); // 字符
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		System.out.println("请输入年龄:");
		int age = input1.nextInt();// 数字
		Display(name, age);
	}
}

//答案
/* public class Person {
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
    }
}
class  ch4_1{
    public static void main(String[] args) {
        Person tom = new Person("tom",18);
        tom.display();
    }
}*/


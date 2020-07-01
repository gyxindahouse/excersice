/**
 * 构造方法与重载：定义一个网络用户类，信息有用户 ID、用户密码、 email 地址。
 * 在建立类的实例时把以上三个信息都作为构造函数的参数输入， 
 * 其中用户 ID 和用户密码时必须缺省时 email地址是用户 ID 加上字符串"@gameschool.com"。
 */
package com.gyx.homework;
//import java.util.Scanner;

public class Client {
	String id;
	String pwd;
	String email;
	public Client(String id, String pwd, String email){
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	}
	
	public Client(String id, String pwd){
		this.id = id;
		this.pwd = pwd;
		this.email = id + "@gameschool.com";
	}
	
	public void Print(){
		System.out.println("id: " + id);
		System.out.println("password: " + pwd);
		System.out.println("email: " + email);
	}
	
	public static void main(String[] args) {
		Client client1 = new Client("guoguo", "12345", "616590250@qqcom");
		Client client2 = new Client("guoguo", "1235");
		client1.Print();
		client2.Print();
	}
}


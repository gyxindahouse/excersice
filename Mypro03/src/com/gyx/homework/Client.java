/**
 * ���췽�������أ�����һ�������û��࣬��Ϣ���û� ID���û����롢 email ��ַ��
 * �ڽ������ʵ��ʱ������������Ϣ����Ϊ���캯���Ĳ������룬 
 * �����û� ID ���û�����ʱ����ȱʡʱ email��ַ���û� ID �����ַ���"@gameschool.com"��
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


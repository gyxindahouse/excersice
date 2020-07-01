package com.gyx.udp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 对象的传递之客户端
 *    1. 创建客户端的DatagramSocket，创建时，定义客户端的监听端口。
      2. 创建服务器端的DatagramSocket，创建时，定义服务器端的监听端口。
      3. 在服务器端定义DatagramPacket对象，封装待发送的数据包。
      4. 客户端将数据报包发送出去。
      5. 服务器端接收数据报包
 * 
 * @author 郭蝈
 *
 */
public class UDPClient_Object {
	public static void main(String[] args) throws IOException {
		// 创建要发送的对象
		Person person = new Person(18, "高淇");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(person);
		// 获取字节数组流中的字节数组--我们要发送的数据
		byte[] b = bos.toByteArray();
		// 必选告诉数据报包要发送到那台计算机的端口，发送的数据以及数据的长度
		DatagramPacket dp = new DatagramPacket(b, b.length, new InetSocketAddress("localhost", 8999));
		// 创建数据报套接字：指定发送信息的端口
		DatagramSocket ds = new DatagramSocket(9000);
		// 发送数据报包
		ds.send(dp);
		// 关闭资源
		oos.close();
		bos.close();
		ds.close();
	}
}

// 对象的传递之person类
class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	int age;
	String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age =" + age + ", name =" + name + "]";
	}

}
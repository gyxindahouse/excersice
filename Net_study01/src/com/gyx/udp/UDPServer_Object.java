package com.gyx.udp;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP：对象的传递之服务器端
 *    1. 创建客户端的DatagramSocket，创建时，定义客户端的监听端口。
      2. 创建服务器端的DatagramSocket，创建时，定义服务器端的监听端口。
      3. 在服务器端定义DatagramPacket对象，封装待发送的数据包。
      4. 客户端将数据报包发送出去。
      5. 服务器端接收数据报包
 * @author 郭蝈
 *
 */
public class UDPServer_Object {
	public static void main(String[] args) throws Exception {
		// 创建数据报套接字：指定接收信息端口
		DatagramSocket ds = new DatagramSocket(8999);
		byte[] b = new byte[1024];
		// 创建数据报包，指定要接受的数据缓存位置和长度
		DatagramPacket dp = new DatagramPacket(b, b.length);
		// 接收客户端发送的数据报
		ds.receive(dp);// 阻塞式方法
		// dp.getData():获取客户端发送的数据，返回值是一个字节数组
		ByteArrayInputStream bis = new ByteArrayInputStream(dp.getData());
		ObjectInputStream ois = new ObjectInputStream(bis);
		System.out.println(ois.readObject());
		// 关闭资源
		ois.close();
		bis.close();
		ds.close();
	}
}

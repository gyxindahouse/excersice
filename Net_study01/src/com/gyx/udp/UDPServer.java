package com.gyx.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP：基本数据类型的传递之服务器端
 * @author 郭蝈
 *
 */
public class UDPServer {
	public static void main(String[] args) throws Exception {
		//创建数据报套接字：指定接收信息的端口
		DatagramSocket ds = new DatagramSocket(8999);
		byte[] b = new byte[1024];
		//创建数据接受包，指定要接收的数据的缓存位置和长度
		DatagramPacket dp = new DatagramPacket(b, b.length);
		//接收客户端发送的数据报
		ds.receive(dp);//阻塞式方式
		//dp.getData()获取客户端发送的数据，返回值是一个字节数组
		ByteArrayInputStream bis = new ByteArrayInputStream(dp.getData());
		DataInputStream dis = new DataInputStream(bis);
		System.out.println(dis.readLong());
		//关闭资源
		dis.close();
		bis.close();
		ds.close();
	}
}

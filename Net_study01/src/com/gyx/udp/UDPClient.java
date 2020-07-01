package com.gyx.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * UDP:基本数据类型的传递之客户端
 * @author 郭蝈
 *
 */
public class UDPClient {
	public static void main(String[] args) throws Exception {
		long n = 2000L;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeLong(n);
		//获取字节数组流中的字节数组---我们要发送的数据
		byte[] b = bos.toByteArray();
		//必须告诉数据报要发到哪台计算机的哪个端口，发送的数据以及数据的长度
		DatagramPacket dp = new DatagramPacket(b, b.length, new InetSocketAddress("localhost", 8999));
		//创建数据报套接字：指定发送信息的端口
		DatagramSocket ds = new DatagramSocket(9000);
		//发送数据报包
		ds.send(dp);
		//关闭资源
		dos.close();
		bos.close();
		ds.close();
	}
}

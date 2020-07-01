package com.gyx.udp;
/**
 * 接收端：使用面向对象封装
 * @author 郭蝈
 *
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable {
	private DatagramSocket server;
	private String from;
	private int port;

	public TalkReceive(int port, String from) {
		this.port = port;
		this.from = from;
		try {
			server = new DatagramSocket(port);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		while (true) {
			// 2 准备容器封装成DatagramPacket包裹
			byte[] container = new byte[1024 * 60];
			DatagramPacket packet = new DatagramPacket(container, 0, container.length);
			// 3 阻塞式接收包裹receive(DatagramPacket p)
			try {
				server.receive(packet);// 阻塞式
				// 4 分析数据
				byte[] datas = packet.getData();
				int len = packet.getLength();
				String data = new String(datas, 0, len);
				System.out.println(data);
				if (data.equals("bye")) {
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 5 释放资源
			//server.close();
			//出现问题：当释放资源关闭server时，程序显示socket关闭，所以不能关闭io流否则会出错
		}
	}
}

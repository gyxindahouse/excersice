package com.gyx.chat.demo01;

import java.io.IOException;
import java.net.Socket;



public class TMultiClient {
	public static void main(String[] args) throws IOException {
		//1 建立连接：使用socket创建客户端+服务的地址和端口
		System.out.println("----Client----");
		Socket client = new Socket("localhost", 9999);
		//2 客户端发送消息
		new Thread(new Send(client)).start();
		new Thread(new Receive(client)).start();
	}
}

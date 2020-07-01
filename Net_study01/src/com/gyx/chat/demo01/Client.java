package com.gyx.chat.demo01;

import java.io.IOException;
import java.net.Socket;
/**
 * 在线聊天室：客户端
 * 目标：加入容器实现群聊
 * @author 郭蝈
 *
 */
public class Client {
	public static void main(String[] args) throws IOException {
		//1 建立连接：使用socket创建客户端+服务的地址和端口
		System.out.println("----Client----");
		Socket client = new Socket("localhost", 10000);
		//2 客户端发送消息
		new Thread(new Send(client)).start();
		new Thread(new Receive(client)).start();
	}
}

package com.gyx.chat.demo01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 在线聊天室：服务器 目标：使用多线程实现多个客户可以正常收发多条消息 问题： 1、代码不好维护 2、客户端读写没有分开 必须先写后读
 * 
 * @author 郭蝈
 *
 */
public class TMultiChat {
	public static void main(String[] args) throws IOException {
		System.out.println("----Server----");
		// 1 指定端口 使用serversocket创建服务器
		ServerSocket server = new ServerSocket(9999);
		// 2 阻塞式等待连接accept
		while (true) {
			Socket client = server.accept();
			System.out.println("一个客户端建立了连接");
			new Thread(new Channel(client)).start();
		}
	}
}


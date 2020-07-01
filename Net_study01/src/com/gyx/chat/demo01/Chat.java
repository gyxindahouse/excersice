package com.gyx.chat.demo01;
/**
 * 在线聊天室：服务器
 * 目标：加入容器实现群聊
 * @author 郭蝈
 *
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;

public class Chat {
	private static CopyOnWriteArrayList<Channel> all = new CopyOnWriteArrayList<Channel>();
	public static void main(String[] args) throws IOException {
		System.out.println("---Server---");
		// 1 指定端口 使用ServerSocket创建服务器
		ServerSocket server = new ServerSocket(10000);
		// 2 阻塞式等待连接accept
		while (true) {
			Socket client = server.accept();
			System.out.println("一个客户端建立了连接");
			Channel c = new Channel(client);
			all.add(c);
			new Thread(new Channel(client)).start();
		}
	}
}


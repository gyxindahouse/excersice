package com.gyx.tcp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 基本步骤：
 * 1、创建服务器ServerSocket，在创建时，定义ServerSocket的监听端口（在这个端口接收客户端发来的消息）
 * 2、ServerSocket调用accept()方法，使之处于阻塞状态
 * 3、创建客户端Socket，并设置服务器的IP及端口
 * 4、客户端发出连接请求，建立连接
 * 5、分别取得服务器和客户端Socket的InputStream和OutputStream
 * 6、利用Socket和ServerSocke进行数据传输
 * 7、关闭流及Socket
 * @author 郭蝈
 *
 */
public class Server {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		try {
			// 建立服务器端套接字：指定监听的接口
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("服务器建立监听");
			// 监听，等待客户端请求，并愿意接收连接
			socket = serverSocket.accept();
			// 获取socket的输出流，并使用缓冲流进行包装
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// 向客户端发送反馈消息
			bw.write("hhhh");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 关闭流及socket链接
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

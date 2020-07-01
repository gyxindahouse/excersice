package com.gyx.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/** 客户端：
 * 使用基于TCP的Java Socket编程，完成如下功能：
    1) 要求从客户端录入几个字符，发送到服务器端。
    2) 由服务器端将接收到的字符进行输出。
    3) 服务器端向客户端发出“您的信息已收到”作为响应。
    4) 客户端接收服务器端的响应信息。
    提示：
    服务器端:PrintWriter out =new PrintWriter(socket.getOutputStream(),true);
    客户端:BufferedReader line=new BufferedReader(new InputStreamReader(System.in));
 * @author Administrator
 *
 */
public class Homework02_TCPServer {
	public static void main(String[] args) {
		System.out.println("===server===");
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader br = null;
		try {
			// 创建服务器套接字：指定监听端口
			ServerSocket server = new ServerSocket(8888);
			// 监听客户端的连接
			socket = server.accept();
			// 获取socket的输入输出流接收和发送信息
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				// 接收客户端发送的信息
				String str = in.readLine();
				System.out.println("客户端说：" + str);
				String str2 = "";
				// 如果客户端发送的是“end”则终止连接
				if (str.equals("end")) {
					break;
				}
				// 否则，发送反馈信息
				str2 = br.readLine();// 读到\n为止，因此一定要输入换行符
				out.write(str2 + "\n");
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (br != null) {
				try {
					br.close();
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

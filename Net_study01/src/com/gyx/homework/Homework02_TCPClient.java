package com.gyx.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
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
public class Homework02_TCPClient {
	public static void main(String[] args) {
		System.out.println("===client===");
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		BufferedReader wt = null;

		// 创建socket对象，指定服务器端的IP与端口
		try {
			socket = new Socket("localhost", 8888);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			wt = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				// 发送信息
				String str = wt.readLine();
				out.write(str + "\n");
				out.flush();
				// 如果输入的信息为“end”则终止链接
				if (str.equals("end")) {
					break;
				}
				// 否则，则接受并输出服务器端信息
				System.out.println("服务器端说：" + in.readLine());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (wt != null) {
				try {
					wt.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

package com.gyx.tcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 模拟登录 多个客户端请求
 * 创建客户端
 * 1、 建立连接：使用socket创建客户端+服务的地址和端口
 * 2、操作:输入输出流操作
 * 3、释放资源
 * @author 郭蝈
 *
 */
public class LoginMultiClient {
	public static void main(String[] args) throws IOException {
		System.out.println("----Client----");
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入用户名:");
		String uname = console.readLine();
		System.out.println("请输入密码：");
		String upwd = console.readLine();
		
		//1 建立连接 使用socket创建客户端+服务的地址和端口
		Socket client = new Socket("localhost", 8888);
		//2 操作 输入输出流操作
		new Send(client).send("uname="+uname+"&"+"upwd="+upwd);
		new Receive(client).receive();
		client.close();
	}
	//发送
	static class Send{
		private Socket client;
		private DataOutputStream dos;
		public Send(Socket client){
			this.client = client;
			try {
				dos = new DataOutputStream(client.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void send(String msg){
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//接收
	static class Receive{
		private DataInputStream dis;
		private Socket client;
		public Receive(Socket client){
			this.client = client;
			try {
				dis = new DataInputStream(client.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void receive(){
			String result;
			try {
				result = dis.readUTF();
				System.out.println(result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

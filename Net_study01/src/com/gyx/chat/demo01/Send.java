package com.gyx.chat.demo01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 使用多线程封装发送端
 * 
 * @author 郭蝈
 *
 */
public class Send implements Runnable {
	private BufferedReader console;
	private DataOutputStream dos;
	private Socket client;
	private boolean isRunning;

	public Send(Socket client) {
		this.client = client;
		console = new BufferedReader(new InputStreamReader(System.in));
		try {
			dos = new DataOutputStream(client.getOutputStream());
		} catch (IOException e) {
			System.out.println("---1---");
		}
	}

	@Override
	public void run() {
		while (isRunning) {
			String msg = getStrFromConsole();
			if(!msg.equals("")){
				send(msg);
			}
		}
	}
	//发送消息
	private void send(String msg){
		try {
			dos.writeUTF(msg);
			dos.flush();
		} catch (IOException e) {
			System.out.println("---3---");
			release();
		}
	}
	private String getStrFromConsole(){
		try {
			return console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	// 释放资源
	private void release() {
		this.isRunning = false;
		SxtUtils.close(dos,client);//dos， client
	}

}

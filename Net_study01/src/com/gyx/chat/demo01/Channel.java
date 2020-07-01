package com.gyx.chat.demo01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;

public class Channel implements Runnable{
	private static CopyOnWriteArrayList<Channel> all = new CopyOnWriteArrayList<Channel>();
	private DataInputStream dis;
	private DataOutputStream dos;
	private Socket client;
	private boolean isRunning;
	private String name;

	public Channel(Socket client) {
		this.client = client;
		try {
			dis = new DataInputStream(client.getInputStream());
			dos = new DataOutputStream(client.getOutputStream());
			isRunning = true;
		} catch (IOException e1) {
			System.out.println("----1----");
			release();
		}
	}

	// 接收消息
	private String receive() {
		String msg = "";
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
			System.out.println("----2----");
			e.printStackTrace();
		}
		return msg;
	}

	// 发送消息
	private void send(String msg) {
		try {
			dos.writeUTF(msg);
			dos.flush();
		} catch (IOException e) {
			System.out.println("----3----");
			e.printStackTrace();
		}
	}
	//群聊:获取自己的消息
	private void sendOthers(String msg,boolean isSys){
		boolean isPrivate = msg.startsWith("@");
		if(isPrivate){//私聊
			int idx = msg.indexOf(":");
			//获取目标和数据
			String targetName = msg.substring(1,idx);
			msg = msg.substring(idx+1);
			for(Channel other:all){
				if(other.name.equals(targetName)){
					other.send(this.name+"悄悄对你说："+msg);
				}
			}
			
		}else{
			for(Channel other:all){
				if(other==this){//自己
					continue;
				}
				if(!isSys){
					other.send(this.name+"对所有人说："+msg);//群聊消息
					
				}else{
				other.send(msg);//系统消息
			}
		}
		}
		
	}
	// 释放资源
	private void release() {
		this.isRunning = false;
		SxtUtils.close(dis, dos, client);
	}

	@Override
	public void run() {
		while (isRunning) {
			String msg = receive();
			if (!msg.equals("")) {
				send(msg);
			}
		}
	}
}

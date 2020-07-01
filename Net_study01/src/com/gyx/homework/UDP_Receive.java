package com.gyx.homework;
/**
 * 接收端：使用面向对象封装
 * 
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP_Receive implements Runnable{
	private DatagramSocket server;
	private String from;
	private int port;
	
	
	public UDP_Receive(String from, int port) {
		this.from = from;
		this.port = port;
		try {
			server = new DatagramSocket(port);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while(true){
			byte[] container = new byte[1024*60];
			DatagramPacket packet = new DatagramPacket(container, 0, container.length);
			try {
				server.receive(packet);//阻塞式
				byte[] datas = packet.getData();
				int len = packet.getLength();
				String data = new String(datas,0,len);
				System.out.println(data);
				if(data.equals("bye")){
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

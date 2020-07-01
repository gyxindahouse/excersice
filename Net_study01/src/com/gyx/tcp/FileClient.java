package com.gyx.tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("---Client---");
		Socket client = new Socket("localhost", 8888);
		//上传
		InputStream is = new BufferedInputStream(new FileInputStream("src/zmnr.jpg"));
		OutputStream os = new BufferedOutputStream(client.getOutputStream());
		byte[] flush = new byte[1024];
		int len = -1;
		while((len = is.read(flush))!=-1){
			os.write(flush, 0, len);
		}
		os.flush();
		os.close();
		is.close();
		client.close();
	}
}

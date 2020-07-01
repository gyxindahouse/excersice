package com.gyx.homework;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * 编程实现：将网络上一张图片或一个mp3或一个视频的信息保存到本地。
 * 提示： URL url = new URL("https://wx1.sinaimg.cn/mw690/6838f258gy1g8o6c9zdtkj22jo334u0y.jpg");
 *	InputStream is = url.openStream();
 *	BufferedInputStream bis = new BufferedInputStream(is);
 * @author 郭蝈
 *
 */
public class Homework01 {
	public static void main(String[] args) throws IOException{
		URL url = new URL("https://wx3.sinaimg.cn/mw690/93e1f0dcly1g8o8nmd1ymj20u00xv46y.jpg");
		InputStream is = url.openStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		OutputStream os = new BufferedOutputStream(new FileOutputStream("src/作业1.jpg"));
		byte[] flush = new byte[1024];
		int len = -1;
		while((len=bis.read(flush))!=-1){
			os.write(flush, 0, len);
		}
		os.flush();
		bis.close();
		os.close();
	}
}

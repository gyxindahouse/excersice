package com.gyx.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 文件字节输出流
 * 
 * @author 郭蝈
 *
 */
public class Test05 {
	public static void main(String[] args) {
		File dest = new File("dest.txt");
		OutputStream os = null;
		try {
			os = new FileOutputStream(dest, true);
			String msg = "IO is so easy\r\n";
			byte[] datas = msg.getBytes();// 字符串》字节数组
			os.write(datas, 0, datas.length);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != os) {
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

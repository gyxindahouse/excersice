package com.gyx.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1.图片读取到字节数组
 * 2.字节数组写到文件
 * @author 郭蝈
 *
 */
public class Test09 {
	public static void main(String[] args) {
		byte[] datas = fileToByteArray("p.png");
		System.out.println(datas.length);
		byteArrayToFile(datas, "p-byte.png");
	}
/**
 * 1.图片读取到字节数组
 * 1）图片到程序 FileInputStream
 * 2）程序到字节数组 ByteArrayOutputStream
 */
	private static byte[] fileToByteArray(String filePath) {
		File src = new File(filePath);
		byte[] dest = null;
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		try {
			is = new FileInputStream(src);
			baos = new ByteArrayOutputStream();

			byte[] flush = new byte[1024 * 10];
			int len = -1;
			while ((len = is.read(flush)) != -1) {
				baos.write(flush, 0, len);
			}
			baos.flush();
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != is) {
					is.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dest;
	}

	/**
	 * 2、字节数组写到图片
	 * 1）字节数组到程序ByteArrayInputStream
	 * 2）程序到文件FileOutputStream
	 */
	public static void byteArrayToFile(byte[] src, String filePath) {
		File dest = new File(filePath);
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new ByteArrayInputStream(src);
			os = new FileOutputStream(dest);

			byte[] flush = new byte[5];
			int len = -1;
			while ((len = is.read(flush)) != -1) {
				os.write(flush, 0, len);
			}
			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != os) {
					os.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

package com.gyx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件拷贝：文件字节输入、输出流
 * 
 * @author 郭蝈
 *
 */
public class Test04 {
	public static void main(String[] args) {
		copy("src/com/gyx/io/Test01.java", "copy.txt");
	}

	private static void copy(String srcPath, String destPath) {
		// 1.创建源
		File src = new File(srcPath);
		File dest = new File(destPath);
		// 2.选择流
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			// 3.操作
			byte[] flush = new byte[1024];// 缓冲容器
			int len = -1;// 接受长度
			while ((len = is.read(flush)) != -1) {
				os.write(flush, 0, len);// 分段写出
			}
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != is) {
					is.close();
				}

				if (null != os) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

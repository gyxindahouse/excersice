package com.gyx.commons;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 2. 复制文件夹d:/sxtjava下面所有文件和子文件夹内容到d:/sxtjava2。
    提示：涉及单个文件复制、目录的创建、递归的使用
    思路：
    1.先遍历文件，得到文件名和文件夹名
    2.生成目标路径，
    	如果目标路径为目录，新建文件夹；
    	如果目标路径为文件，copy原文件到目标文件
 * @author 郭蝈
 *
 */

public class Homework02 {
	public static void main(String[] args) throws IOException {
		copy("F:/2_研究生资料/编程练习以及常识问题/Eclipse安装及其使用/eclipse练习/IO_study003/lib2", "lib-copy", 0);
	}

	public static void copy(String srcpath, String destpath, int i) throws IOException {
		File src = new File(srcpath);
		File dest = new File(destpath);
		dest.mkdirs();// 创建目的目录
		String srcName = src.getName();// 原文件名或者文件夹名

		if (null == src || !src.exists()) {
			return;// break
		} else if (src.isFile()) {
			destpath = destpath + "/" + srcName;
			dest = new File(destpath);
			copyFile(src, dest);
		} else {
			if (i != 0) {//如果i=0，就不将原文件夹也创建到目的地文件夹下		
				//如果初始i就不为0，那么一开始就会执行以下内容，使原文件夹也会被复制到目标文件夹下
				destpath = destpath + "/" + srcName;
			}
			i++;
			File[] files = src.listFiles();
			for (File file : files) {//遍历 递归
				copy(file.getAbsolutePath(), destpath, i);
			}
		}
	}

	private static void copyFile(File src, File dest) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

		byte[] flush = new byte[1024];
		int len;
		while ((len = bis.read(flush)) != -1) {
			bos.write(flush, 0, len);
		}
		bos.flush();
		try {
			if (null != bos) {
				bos.close();
			}

			if (null != bis) {
				bis.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

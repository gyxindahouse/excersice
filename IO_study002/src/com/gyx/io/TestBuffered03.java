package com.gyx.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件字符输出流 加入缓冲流
 * @author 郭蝈
 *
 */
public class TestBuffered03 {
	public static void main(String[] args) {
		File dest = new File("dest.txt");
		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter(dest));
			writer.append("IO is so easy");
			writer.newLine();
			writer.append("i am gyx");
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				if(null!=writer){
					writer.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

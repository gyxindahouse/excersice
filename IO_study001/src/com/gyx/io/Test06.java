package com.gyx.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 文件字符输出流 1、创建源 2、选择流 3、操作（写出内容） 4、释放资源
 * 
 * @author 郭蝈
 */

public class Test06 {
	public static void main(String[] args) {
		File dest = new File("dest.txt");
		Writer writer = null;
		try{
			writer = new FileWriter(dest);
			writer.append("gyx").append("郭一璇");
			writer.flush();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(null != writer){
					writer.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}

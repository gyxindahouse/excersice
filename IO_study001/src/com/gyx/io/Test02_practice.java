package com.gyx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 四大标准步骤： 1、创建源文件 2、选择流 3、读取文件 4、释放流
 * 
 * @author 郭蝈
 *
 */
public class Test02_practice {
	public static void main(String[] args) {
	//1.创建源文件
		File file =  new File("abc.txt");
		//选择流
		InputStream is = null;
		try {
			//操作
			is = new FileInputStream(file);
			int temp;
			try {
				while((temp = is.read()) != -1){
					System.out.print((char)temp);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			//释放流
			if(null!=is){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

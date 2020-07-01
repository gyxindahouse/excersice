package com.gyx.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 使用流读取文件内容
 * @author 郭蝈
 *
 */
public class Test01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("d:/b.txt");
			StringBuilder sb = new StringBuilder();
			int temp = 0;
			//当temp等于-1时，表示已经到了文件结尾，停止读取
			while((temp = fis.read()) != -1){
				sb.append((char) temp);
			}
			System.out.println(sb);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				//这种写法保证了即使遇到异常情况，也会关闭流对象
				if(fis != null){
					fis.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}

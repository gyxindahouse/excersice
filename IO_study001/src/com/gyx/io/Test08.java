package com.gyx.io;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节数组输出流ByteArrayOutputStream 1、创建源：内部维护 2、选择流： 不关联源 3、操作（写出内容） 4、 释放资源： 可以不用
 * 
 * @author 郭蝈
 *
 */
public class Test08 {
	public static void main(String[] args) {
		byte[] dest = null;
		ByteArrayOutputStream baos = null;
		try {
			baos = new ByteArrayOutputStream();
			String msg = "show me the money";
			byte[] datas = msg.getBytes();
			
			baos.write(datas, 0, datas.length);
			baos.flush();
			dest = baos.toByteArray();
			System.out.println(dest.length+"-->"+new String(dest, 0, baos.size()));
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(null!=baos){
					baos.close();
				}
			} catch (Exception e2) {
			}
		}
	}
}

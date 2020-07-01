package com.gyx.chat.demo01;

import java.io.Closeable;

/**
 * 工具类
 * @author 郭蝈
 *
 */
public class SxtUtils {
	/**
	 * 释放资源
	 */
	public static void close(Closeable... targets){
		for(Closeable target:targets){
			try{
				if(null!=target){
					target.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

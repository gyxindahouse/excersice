package com.gyx.commons;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 写出内容
 * @author 郭蝈
 *
 */
public class TestCIO04 {
	public static void main(String[] args) throws IOException {
		//写出文件
		FileUtils.write(new File("happy.sxt"), "学习室\r\n", "UTF-8");
		FileUtils.writeStringToFile(new File("happy.sxt"), "i am a girl\r\n", "UTF-8", true);
		FileUtils.writeByteArrayToFile(new File("happy.sxt"), "be happy\r\n".getBytes("UTF-8"),true);
		
		//写出列表
		List<String> datas = new ArrayList<String>();
		datas.add("mayun");
		datas.add("mahuateng");
		datas.add("gyx");
		
		FileUtils.writeLines(new File("happy.sxt"), datas, "---------", true);
	}
}

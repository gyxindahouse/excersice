package com.gyx.commons;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 使用IO包中的类读取D盘上exam.txt文本文件的内容，每次读取一行内容
 * 将每行作为一个输入放入ArrayList的泛型集合中并将集合中的内容使用加强for进行输出显示
 * @author 郭蝈
 *
 */
public class Homework03 {
	public static void main(String[] args) throws IOException {
		File src = new File("F:/2_研究生资料/编程练习以及常识问题/Eclipse安装及其使用/eclipse练习/IO_study003/emp.txt");
		List<String> list = FileUtils.readLines(src, "UTF-8");
		for(String str:list){
			System.out.println(str);
		}
	}
}

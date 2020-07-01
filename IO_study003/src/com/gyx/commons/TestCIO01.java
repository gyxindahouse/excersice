package com.gyx.commons;

import java.io.File;

import org.apache.commons.io.FileUtils;

/**
 * 大小
 * @author 裴新
 *
 */
public class TestCIO01 {
	public static void main(String[] args) {
		//文件大小
		long len = FileUtils.sizeOf(new File("src/com/gyx/commons/TestCIOTest01.java"));
		System.out.println(len);
		//目录大小
		len = FileUtils.sizeOf(new File("F:/2_研究生资料/编程练习以及常识问题/Eclipse安装及其使用/eclipse练习/IO_study003"));
		System.out.println(len);
	}
}

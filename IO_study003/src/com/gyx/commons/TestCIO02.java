package com.gyx.commons;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

/**
 * 列出子孙级
 * 
 * @author 郭蝈
 *
 */
public class TestCIO02 {
	public static void main(String[] args) {

		Collection<File> files = FileUtils.listFiles(
				new File("F:/2_研究生资料/编程练习以及常识问题/Eclipse安装及其使用/eclipse练习/IO_study003"), EmptyFileFilter.NOT_EMPTY, null);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("-----------------------");
		files = FileUtils.listFiles(new File("F:/2_研究生资料/编程练习以及常识问题/Eclipse安装及其使用/eclipse练习/IO_study003"),
				EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("----------------------------");
		files = FileUtils.listFiles(new File("F:/2_研究生资料/编程练习以及常识问题/Eclipse安装及其使用/eclipse练习/IO_study003"),
				new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("----------------------------------");
		files = FileUtils.listFiles(new File("F:/2_研究生资料/编程练习以及常识问题/Eclipse安装及其使用/eclipse练习/IO_study003"),
				FileFilterUtils.and(new SuffixFileFilter("java"), EmptyFileFilter.NOT_EMPTY),
				DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}

}

package cn.gyx.baozhuang;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("user.dir"));
		File f = new File("a.txt"); //相对路径：默认放到user。dir目录下
		f.createNewFile();
		File f2 = new File("d:/b.txt");//绝对路径
		f2.createNewFile();
	}
}

package cn.gyx.baozhuang;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("user.dir"));
		File f = new File("a.txt"); //���·����Ĭ�Ϸŵ�user��dirĿ¼��
		f.createNewFile();
		File f2 = new File("d:/b.txt");//����·��
		f2.createNewFile();
	}
}

package cn.gyx.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试异常
 * 
 * @author 郭蝈
 *
 */
public class TestTrycatch {
	public static void main(String[] args) {
		try {
			readFile("d:/b.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("所需文件不存在！");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件读写错误！");
		}
	}

	private static void readFile(String fileName) throws FileNotFoundException, IOException {
		FileReader in = new FileReader(fileName);
		int tem = 0;
		try {
			tem = in.read();
			//System.out.print((char) tem);
			while (tem != -1) {
				System.out.print((char) tem);
				tem = in.read();
			}
		} finally {
			in.close();
		}
	}
}
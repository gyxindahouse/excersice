package com.gyx.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * 转换流：InputStreamReader OutputStreamWriter
 * 1、以字符流的形式操作字节流 纯文本的
 * 2、指定字符集
 * @author 郭蝈
 *
 */
public class TestConvert02 {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new URL("http://www.baidu.com").openStream(), "UTF-8"));
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream("baidu.html"), "UTF-8"));) {
			String msg;
			while ((msg = reader.readLine()) != null) {
				writer.write(msg);
				writer.newLine();
			}
			writer.flush();
		} catch (IOException e) {
			System.out.println("操作异常");
		}
	}

	public static void test02() {
		// 操作网络流 下载百度的源代码
		try (InputStreamReader is = new InputStreamReader(new URL("http://www.baidu.com").openStream(), "UTF-8");) {
			int temp;
			while ((temp = is.read()) != -1) {
				System.out.println((char) temp);
			}
		} catch (IOException e) {
			System.out.println("操作异常");
		}
	}

	public static void test1() {
		// 操作网络流 下载百度的源代码
		try (InputStream is = new URL("http://www.baidu.com").openStream();) {
			int temp;
			while ((temp = is.read()) != -1) {
				System.out.println((char) temp);
			}
		} catch (IOException e) {
			System.out.println("操作异常");
		}
	}
}

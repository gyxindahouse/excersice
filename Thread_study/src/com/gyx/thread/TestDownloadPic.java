package com.gyx.thread;
/**
 * 从网上下载图片
 * @author 郭蝈
 *
 */

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class TestDownloadPic extends Thread{
	private String url;
	private String name;
	public TestDownloadPic(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}
	@Override
	public void run() {
		webDownload wb = new webDownload();
		wb.download(url, name);
	}
	
	public static void main(String[] args) {
		TestDownloadPic td1 = new TestDownloadPic("https://weibo.com/u/2951580462/home?wvr=5&display=0&retcode=6102", "shq1.jpg");
		TestDownloadPic td2 = new TestDownloadPic("https://wx2.sinaimg.cn/mw690/0072aga4gy1g81n6vwnyvj313u0nutc8.jpg", "zmnr.jpg");
		TestDownloadPic td3 = new TestDownloadPic("https://wx1.sinaimg.cn/mw690/80f256c3ly1g82fj4aqcxj21ii0u07wl.jpg", "mszb.jpg");
		
		td1.start();
		td2.start();
		td3.start();
		
		System.out.println(td1);
		System.out.println(td2);
		System.out.println(td3);
	}
}

class webDownload {
	public static void download(String url, String name) {
		try {
			FileUtils.copyURLToFile(new URL(url), new File(name));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("不合法的url");
		}
	}
}

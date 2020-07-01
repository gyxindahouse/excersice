package com.gyx.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机读取和写入流 RandomAccessFile
 * @author 郭蝈
 *
 */
public class TestRand01 {
	public static void main(String[] args) throws IOException {
		//分多少块
		File src = new File("src/com/gyx/io/TestData.java");
		//总长度
		long len = src.length();
		//每块大小
		int blockSize = 1024;
		//块数：多少块
		int size = (int)Math.ceil(len*1.0/blockSize);
		System.out.println(size);
		
		//起始位置和实际大小
		int beginPos = 0;
		int actualSize = (int)(blockSize>len?len:blockSize);
		for(int i=0;i<size;i++){
			beginPos = i*blockSize;
			if(i==size-1){//最后一块
				actualSize = (int)len; 
			}else{
				actualSize = blockSize;
				len -= actualSize;//剩余量
			}
			System.out.println(i+"-->"+beginPos+"-->"+actualSize);
			spit(i,beginPos,actualSize);
		}
	}
	/**
	 * 指定第i块的起始位置和实际长度
	 * @param i
	 * @param beginPos
	 * @param actualSize
	 * @throws IOException 
	 */

	private static void spit(int i, int beginPos, int actualSize) throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("src/com/gyx/io/TestData.java"),"r");
		//随机读取
		raf.seek(beginPos);
		//分段读取
		byte[] flush = new byte[1024];//缓冲容器
		int len = -1;//接收长度
		while((len=raf.read(flush))!=-1){
			if(actualSize>len){//获取本次读取的所有内容
				System.out.println(new String(flush, 0, len));
				actualSize -= len;
			}else{
				System.out.println(new String(flush, 0, actualSize));
				break;
			}
		}
		raf.close();
	}
	//分来思想：起始，实际大小
	public static void test2() throws IOException{
		RandomAccessFile raf = new RandomAccessFile(new File("src/com/gyx/io/TestData.java"),"r");
		//起始位置
		int beginPos = 2;
		int actualSize = 1026;
		raf.seek(beginPos);
		
		byte[] flush = new byte[1024];
		int len = -1;//接受长度
		while((len=raf.read(flush))!=-1){
			if(actualSize>len){
				System.out.println(new String(flush,0,len));
				actualSize -= len;
			}else{
				System.out.println(new String(flush,0,actualSize));
				break;
			}
		}
		raf.close();
	}
}

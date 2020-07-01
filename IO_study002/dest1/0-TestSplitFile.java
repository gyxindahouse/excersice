package com.gyx.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * 面向对象思想封装 分割
 * @author 郭蝈
 *
 */
public class TestSplitFile {
	private File src;//源头
	private String destDir;//目的地 文件夹
	private List<String> destPaths;//所分割后的文件存储路径
	private int blockSize;//每块大小
	private int size;//块数
	
	public TestSplitFile(String srcPath,String destDir){
		this(srcPath,destDir,1024);
	}
	
	public TestSplitFile(String srcPath, String destDir, int blockSize) {
		super();
		this.src = new File(srcPath);
		this.destDir = destDir;
		this.destPaths = new ArrayList<String>();
		
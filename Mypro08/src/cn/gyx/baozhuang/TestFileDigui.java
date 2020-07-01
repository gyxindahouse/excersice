package cn.gyx.baozhuang;

import java.io.File;

public class TestFileDigui {
	public static void main(String[] args) {
		File f = new File("e:/文献阅读");
		printFile(f, 0);
	}

	private static void printFile(File f, int level) {
		//输出层数次数
		for(int i=0; i<level; i++){
			System.out.print("-");
		}
		//输出文件名
		System.out.println(f.getName());
		//如果f是目录，则获取子文件列表，并对每个子文件进行相同操作
		if(f.isDirectory()){
			File[] files = f.listFiles();
			for(File temp:files){
				//递归调用该方法：注意等+1
				printFile(temp, level+1);
			}
		}
	}
}

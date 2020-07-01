package cn.gyx.baozhuang;

import java.io.File;
import java.io.IOException;

public class TestFile01 {
	public static void main(String[] args) {
		//指定一个文件
		File file = new File("d:/sxt/b.txt");
		//判断文件是否存在
		boolean flag = file.exists();
		//如果存在就删除，若不存在就创建
		if(flag){
			//删除
			boolean flagd = file.delete();
			if(flagd){
				System.out.println("删除成功");
			}else{
				System.out.println("删除失败");
			}
		}else{
			//创建
			boolean flagn = true;
			try{
				//如果目录不存在，先创建目录
				File dir = file.getParentFile();
				dir.mkdirs();
				//创建文件
				flagn = file.createNewFile();
				System.out.println("创建成功");
			}catch(IOException e){
				System.out.println("创建失败");
				e.printStackTrace();//e.printStackTrace();是打印异常的堆栈信息，指明错误原因。
				/*try catch 是捕捉try部分的异常，当你没有trycatch的时候，如果出现异常则程序报错，
				 * 加上trycatch，出现异常程序正常运行，只是把错误信息存储到Exception里，
				 * 所以catch是用来提取异常信息的，你可以在Catch部分加上一句System.out.println(e.ToString());，如果出现异常可以把异常打印出来*/
			}
		}
	}
}

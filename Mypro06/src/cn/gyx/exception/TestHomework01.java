package cn.gyx.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。
 * 如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。
 * @author 郭蝈
 *
 */


public class TestHomework01 {
	public static void main(String[] args) throws Exception {
		System.out.print("请输入您的成绩：");
		Scanner input = new Scanner(System.in);
		int grade = input.nextInt();
		boolean flag = false;
		try{
			if(grade<0 || grade>100){
				throw new Exception("分数必须在0—100之间!");	
			}
			flag = true;//当成绩在0-100之间时，异常已经抛出不再运行该句，所以异常抛出时flag=false
		}catch(InputMismatchException e){
			System.out.print("inputmismatchexception");
			//e.printStackTrace();
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
		if(flag){
			System.out.println("您的成绩是："+grade);
		}
	}
}

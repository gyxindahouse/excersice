package cn.gyx.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ��д��������û����������Ϣ�����������0��100֮�䣬����ɼ���
 * ����ɼ����ڸ÷�Χ�ڣ��׳��쳣��Ϣ����ʾ����������0��100֮�䡣
 * @author ����
 *
 */


public class TestHomework01 {
	public static void main(String[] args) throws Exception {
		System.out.print("���������ĳɼ���");
		Scanner input = new Scanner(System.in);
		int grade = input.nextInt();
		boolean flag = false;
		try{
			if(grade<0 || grade>100){
				throw new Exception("����������0��100֮��!");	
			}
			flag = true;//���ɼ���0-100֮��ʱ���쳣�Ѿ��׳��������иþ䣬�����쳣�׳�ʱflag=false
		}catch(InputMismatchException e){
			System.out.print("inputmismatchexception");
			//e.printStackTrace();
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
		if(flag){
			System.out.println("���ĳɼ��ǣ�"+grade);
		}
	}
}

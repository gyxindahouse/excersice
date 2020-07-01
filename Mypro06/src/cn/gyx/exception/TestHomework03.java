package cn.gyx.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 编写一个计算N个学生分数平均分的程序。程序应该提示用户输入N的值，如何必须输入所有N个学生分数。
 * 如果用户输入的分数是一个负数，则应该抛出一个异常并捕获，提示“分数必须是正数或者0”。并提示用户再次输入该分数。
 * 
 * @author 郭蝈
 *
 */
public class TestHomework03 {
	public static void main(String[] args) {
		System.out.print("请输入学生人数：");
		Scanner input1 = new Scanner(System.in);
		int num = input1.nextInt();
		System.out.printf("请输入%d个学生成绩:", num);
		Scanner input2 = new Scanner(System.in);
		int stu[] = new int[num];

		for (int i = 0; i < num; i++) {
			stu[i] = input2.nextInt();
			try {
				if ((stu[i] < 0) || (stu[i] > 100)) {
					i--;
					throw new Exception("分数必须是正数或者0,请重新输入:");
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
		int sum = 0;
		for (int i = 0; i < num - 1; i++) {
			sum = sum + stu[i];
		}
		System.out.printf("平均分为：%.3f" , (float)sum / num);
	}
}

/*public class TestHomework03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float grade = 0.0f;
		float aver = 0.0f;
		float sum = 0.0f;
		int stuNum = 0;

		System.out.print("请输入学生人数:");
		stuNum = input.nextInt();
		for (int i = 0; i < stuNum; i++) {
			try {
				System.out.println("请输入学生分数:");
				grade = input.nextFloat();
				if (grade > 100 || grade < 0) {
					i--;
					throw new Exception();
				} else {
					sum = sum + grade;
					aver = sum / stuNum;
					System.out.printf("总分数:%3.2f \t 平均分:%3.2f \n", sum, aver);
				}
			} catch (Exception e) {
				// e.gradeException();
				System.out.printf("分数必须是正数或者0\n");
			}
		}
	}
}*/



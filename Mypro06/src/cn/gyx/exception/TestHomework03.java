package cn.gyx.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ��дһ������N��ѧ������ƽ���ֵĳ��򡣳���Ӧ����ʾ�û�����N��ֵ����α�����������N��ѧ��������
 * ����û�����ķ�����һ����������Ӧ���׳�һ���쳣��������ʾ��������������������0��������ʾ�û��ٴ�����÷�����
 * 
 * @author ����
 *
 */
public class TestHomework03 {
	public static void main(String[] args) {
		System.out.print("������ѧ��������");
		Scanner input1 = new Scanner(System.in);
		int num = input1.nextInt();
		System.out.printf("������%d��ѧ���ɼ�:", num);
		Scanner input2 = new Scanner(System.in);
		int stu[] = new int[num];

		for (int i = 0; i < num; i++) {
			stu[i] = input2.nextInt();
			try {
				if ((stu[i] < 0) || (stu[i] > 100)) {
					i--;
					throw new Exception("������������������0,����������:");
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
		int sum = 0;
		for (int i = 0; i < num - 1; i++) {
			sum = sum + stu[i];
		}
		System.out.printf("ƽ����Ϊ��%.3f" , (float)sum / num);
	}
}

/*public class TestHomework03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float grade = 0.0f;
		float aver = 0.0f;
		float sum = 0.0f;
		int stuNum = 0;

		System.out.print("������ѧ������:");
		stuNum = input.nextInt();
		for (int i = 0; i < stuNum; i++) {
			try {
				System.out.println("������ѧ������:");
				grade = input.nextFloat();
				if (grade > 100 || grade < 0) {
					i--;
					throw new Exception();
				} else {
					sum = sum + grade;
					aver = sum / stuNum;
					System.out.printf("�ܷ���:%3.2f \t ƽ����:%3.2f \n", sum, aver);
				}
			} catch (Exception e) {
				// e.gradeException();
				System.out.printf("������������������0\n");
			}
		}
	}
}*/



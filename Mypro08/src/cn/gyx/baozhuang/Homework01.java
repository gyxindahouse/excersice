package cn.gyx.baozhuang;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��֤����������û�������Ϊ�գ����ȴ���6�����������֡� ��ʾ��ʹ���ַ���String�����ط������
 * ����ʹ��Scanner��nextLine()�������÷������Խӿڿյ��ַ�����
 * ��Ľ�
 * @author ����
 *
 */
/*
 * public class Homework01 { public static void main(String[] args) {
 * System.out.println("�������û�����"); Scanner s = new Scanner(System.in); String
 * name = s.nextLine(); boolean flag = true; if (name.length() == 0) {
 * System.out.println("�û�������Ϊ��,����������"); flag = false; } else { if (name.length()
 * <= 6) { System.out.println("�û������ȴ���6,����������"); flag = false; } } for (int i =
 * 0; i < name.length(); i++) { char num = name.charAt(i); //
 * System.out.println(num); if (Character.isDigit(num)) {//
 * Character.isDigit(num)�ж��Ƿ�Ϊ���� System.out.println("�û������ܰ�������,����������"); flag =
 * false; break; } } if (flag) { System.out.println("�����û���Ϊ��" + name); } } }
 */

public class Homework01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������û���");
		String id = scanner.next();
		boolean flag = false;

		for (int i = 0; i < id.length(); i++) {
			if (id.length() <= 6) {
				System.out.println("�û�����Ҫ����6λ");
				flag = true;
			}
			char num = id.charAt(i);// ��ȡstring��ÿ��Ԫ��
			if (Character.isDigit(num)) { // ʹ��Character.isDigit()�����ж��Ƿ��������
				flag = true;
				System.out.println("�û������ܰ�������");
				//break;
			}
			if ((!flag)) {
				System.out.println("�����ɹ�������û���Ϊ��" + id);
				break;
			}else{
				System.out.println("����������û���");
				id = scanner.next();
				flag = false;
				//System.out.print(id);
			}
		}
/*		if(!flag){
		System.out.println("�����ɹ�������û���Ϊ��" + id);
		}*/
	}
}

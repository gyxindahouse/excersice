package cn.gyx.baozhuang;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 验证键盘输入的用户名不能为空，长度大于6，不能有数字。 提示：使用字符串String类的相关方法完成
 * 可以使用Scanner的nextLine()方法，该方法可以接口空的字符串。
 * 需改进
 * @author 郭蝈
 *
 */
/*
 * public class Homework01 { public static void main(String[] args) {
 * System.out.println("请输入用户名："); Scanner s = new Scanner(System.in); String
 * name = s.nextLine(); boolean flag = true; if (name.length() == 0) {
 * System.out.println("用户名不能为空,请重新输入"); flag = false; } else { if (name.length()
 * <= 6) { System.out.println("用户名长度大于6,请重新输入"); flag = false; } } for (int i =
 * 0; i < name.length(); i++) { char num = name.charAt(i); //
 * System.out.println(num); if (Character.isDigit(num)) {//
 * Character.isDigit(num)判断是否为数字 System.out.println("用户名不能包含数字,请重新输入"); flag =
 * false; break; } } if (flag) { System.out.println("您的用户名为：" + name); } } }
 */

public class Homework01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的用户名");
		String id = scanner.next();
		boolean flag = false;

		for (int i = 0; i < id.length(); i++) {
			if (id.length() <= 6) {
				System.out.println("用户名须要大于6位");
				flag = true;
			}
			char num = id.charAt(i);// 获取string的每个元素
			if (Character.isDigit(num)) { // 使用Character.isDigit()方法判断是否包含数字
				flag = true;
				System.out.println("用户名不能包含数字");
				//break;
			}
			if ((!flag)) {
				System.out.println("创建成功！你的用户名为：" + id);
				break;
			}else{
				System.out.println("请输入你的用户名");
				id = scanner.next();
				flag = false;
				//System.out.print(id);
			}
		}
/*		if(!flag){
		System.out.println("创建成功！你的用户名为：" + id);
		}*/
	}
}

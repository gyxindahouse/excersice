package cn.gyx.baozhuang;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 接收从键盘输入的字符串格式的年龄，分数和入学时间，转换为整数、浮点数、日期类型，并在控制台输出。
    提示：使用包装类Integer、Double和日期转换类DateFormat实现
 * @author 郭蝈
 *
 */
public class Homework02 {
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入年龄");
		Scanner s1 = new Scanner(System.in);
		String inputage = s1.nextLine();
		System.out.println("请输入分数");
		Scanner s2 = new Scanner(System.in);
		String inputgrade = s2.nextLine();
		System.out.println("请输入入学时间,格式为yyyy-MM-dd");
		Scanner s3 = new Scanner(System.in);
		String inputtime = s3.nextLine();
		
		int age = Integer.parseInt(inputage);//parse就是把string型转化为int
		double grade = Double.parseDouble(inputgrade);
		//System.out.println(inputage + age);
		//System.out.println(inputgrade + grade);
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy-mm-dd");
		Date date = s.parse(inputtime);
		GregorianCalendar schooltime = new GregorianCalendar();
		schooltime.setTime(date);
		int year = schooltime.get(Calendar.YEAR);
		int month = schooltime.get(Calendar.MONTH)+1;
		int day = schooltime.get(Calendar.DAY_OF_MONTH);
		System.out.println("年龄为：" + age + "，分数为：" + grade + ",入学日期为： " + year +"年" + month + "月" + day + "日");
	}
}

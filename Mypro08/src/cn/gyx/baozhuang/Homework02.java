package cn.gyx.baozhuang;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * ���մӼ���������ַ�����ʽ�����䣬��������ѧʱ�䣬ת��Ϊ���������������������ͣ����ڿ���̨�����
    ��ʾ��ʹ�ð�װ��Integer��Double������ת����DateFormatʵ��
 * @author ����
 *
 */
public class Homework02 {
	public static void main(String[] args) throws ParseException {
		System.out.println("����������");
		Scanner s1 = new Scanner(System.in);
		String inputage = s1.nextLine();
		System.out.println("���������");
		Scanner s2 = new Scanner(System.in);
		String inputgrade = s2.nextLine();
		System.out.println("��������ѧʱ��,��ʽΪyyyy-MM-dd");
		Scanner s3 = new Scanner(System.in);
		String inputtime = s3.nextLine();
		
		int age = Integer.parseInt(inputage);//parse���ǰ�string��ת��Ϊint
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
		System.out.println("����Ϊ��" + age + "������Ϊ��" + grade + ",��ѧ����Ϊ�� " + year +"��" + month + "��" + day + "��");
	}
}

package cn.gyx.baozhuang;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ���Կ��ӻ�����
 * 
 * @author ����
 *
 */
public class TestCalendar2 {
	public static void main(String[] args) {
		System.out.println("���������ڣ���ʽΪ��2010-3-3����");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String dateString = scanner.nextLine();
		// ��������ַ���ת����������
		System.out.println("���ո�����������ǣ�" + dateString);
		String[] str = dateString.split("-");
		int year = Integer.parseInt(str[0]);
		int month = new Integer(str[1]);
		int day = new Integer(str[2]);
		Calendar c = new GregorianCalendar(year, month-1, day);
		c.set(Calendar.DATE, 1);
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=0; i<dow-1; i++){
			System.out.print("\t");
		}
		int maxDate = c.getActualMaximum(Calendar.DATE);
		for(int i=1; i<= maxDate; i++){
			StringBuilder s = new StringBuilder();
			if(c.get(Calendar.DATE) == day){
				s.append(c.get(Calendar.DATE)+"*\t");
			}else{
				s.append(c.get(Calendar.DATE)+"\t");
			}
			System.out.print(s);
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
				System.out.print("\n");
			}
			c.add(Calendar.DATE, 1);
		}
	}
}

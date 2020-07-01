package cn.gyx.baozhuang;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
		// 得到相关日期元素
		GregorianCalendar calendar = new GregorianCalendar(2999, 10, 9, 22, 10, 50);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day2 = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(day2);
		// 日期计算
		GregorianCalendar calendar3 = new GregorianCalendar();
		calendar3.add(Calendar.MONTH, -7);//月份减七
		calendar3.add(Calendar.DATE, 7);//增加7天
		printCalendar(calendar);
	}

	private static void printCalendar(GregorianCalendar calendar) {
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int date = calendar.get(Calendar.DAY_OF_WEEK)-1;
		String week = ""+((date == 0) ? "日" : date);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.printf("%d年%d月%d日,星期%s %d:%d:%d\n", year, month, day, week, hour, minute, second);
	}
}

package cn.gyx.baozhuang;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1.toString());
		long i = date1.getTime();
		Date date2 = new Date(i-1000);
		Date date3 = new Date(i+1000);
		System.out.println(date1.after(date2));
		System.out.println(date1.before(date2));
		System.out.println(date1.equals(date2));
		System.out.println(date1.after(date3));
		System.out.println(date1.before(date3));
		System.out.println(date1.equals(date3));
		System.out.println(new Date(1000L * 60 * 60 * 24 * 365 * 39L).toString());
		// 1000L��һ�룬֮��*60��һ���ӣ�*60��һСʱ��*24��һ�죬*365��һ�꣬*39L��39�꣬
		// ���н��Ϊ2008��12��22��8�㣬����2009��һ��һ����㣬����Ϊ�м仹������
	}
}

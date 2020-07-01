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
		// 1000L是一秒，之后*60是一分钟，*60是一小时，*24是一天，*365是一年，*39L是39年，
		// 运行结果为2008年12月22日8点，不是2009年一月一日零点，是因为中间还有闰年
	}
}

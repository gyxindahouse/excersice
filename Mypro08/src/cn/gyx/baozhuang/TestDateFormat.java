package cn.gyx.baozhuang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd");
		//将时间对象转换为字符串
		String daytime = s1.format(new Date());
		System.out.println(daytime);
		System.out.println(s2.format(new Date()));
		System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
		System.out.println("########");
		// 将符合指定格式的字符串转成成时间对象.字符串格式需要和指定格式一致。
		String time = "2007-10-7";
		Date date = s2.parse(time);
		System.out.println("date1: " + date);
		time = "2007-10-7 20:15:30";
		date = s1.parse(time);
		System.out.println("date2: " + date);
	}
}

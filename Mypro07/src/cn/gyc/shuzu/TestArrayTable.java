package cn.gyc.shuzu;

import java.util.Arrays;

public class TestArrayTable {
	public static void main(String[] args) {
		Object[] a1 = {1001,"��1�",18,"��ʦ","2016-2-14"};
		Object[] a2 = {1002,"��2�",28,"����","2006-2-14"};
		Object[] a3 = {1003,"��3�",38,"������","2019-5-5"};
		Object[][] emps = new Object[3][];
		emps[0] = a1;
		emps[1] = a2;
		emps[2] = a3;
		System.out.println(Arrays.toString(emps[0]));
		System.out.println(Arrays.toString(emps[1]));
		System.out.println(Arrays.toString(emps[2]));
	}
}

package cn.gyx.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����list
 * @author ����
 *
 */
public class TestList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println(list.isEmpty());
		list.add("gyx");
		System.out.println(list.isEmpty());
		list.add("gyx1");
		list.add("gyx2");
		System.out.println(list);
		System.out.println("list�Ĵ�С: "+ list.size());
		System.out.println("�Ƿ����ָ��Ԫ�أ�"+ list.contains("gyx"));
		list.remove("gyx");
		System.out.println(list);
		Object[] objs = list.toArray();
		System.out.println("ת��Ϊobject���飺 "+ Arrays.toString(objs));
		list.clear();
		System.out.println("�������Ԫ�أ�"+ list);
	}
}

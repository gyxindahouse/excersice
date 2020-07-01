package cn.gyx.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 测试list
 * @author 郭蝈
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
		System.out.println("list的大小: "+ list.size());
		System.out.println("是否包含指定元素："+ list.contains("gyx"));
		list.remove("gyx");
		System.out.println(list);
		Object[] objs = list.toArray();
		System.out.println("转化为object数组： "+ Arrays.toString(objs));
		list.clear();
		System.out.println("清空所有元素："+ list);
	}
}

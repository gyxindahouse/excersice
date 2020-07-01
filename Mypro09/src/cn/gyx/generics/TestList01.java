package cn.gyx.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试list1
 * @author 郭蝈
 *
 */
public class TestList01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("gyx");
		list.add("gyx2");
		list.add("gyx3");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("zhangsan");
		list2.add("lisi");
		list2.add("wangermazi");
		System.out.println(list.containsAll(list2));// list是否包含list2中所有元素
		System.out.println(list);
		list.addAll(list2);//将list2中所有元素都添加到list中
		System.out.println(list);
		list.removeAll(list2);//从list中删除同时在list和list2中存在的元素
		System.out.println(list);
		list.retainAll(list2); //取list和list2的交集
		System.out.println(list);
	}
}

package cn.gyx.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * ����list1
 * @author ����
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
		System.out.println(list.containsAll(list2));// list�Ƿ����list2������Ԫ��
		System.out.println(list);
		list.addAll(list2);//��list2������Ԫ�ض���ӵ�list��
		System.out.println(list);
		list.removeAll(list2);//��list��ɾ��ͬʱ��list��list2�д��ڵ�Ԫ��
		System.out.println(list);
		list.retainAll(list2); //ȡlist��list2�Ľ���
		System.out.println(list);
	}
}

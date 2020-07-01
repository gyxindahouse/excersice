package cn.gyx.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试hashmap的使用
 * @author 郭蝈
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "one");
		m1.put(2, "2");
		m1.put(3, "three");
		
		System.out.println(m1.get(1));
		System.out.println(m1.isEmpty());
		System.out.println(m1.containsValue("four"));
		
		Map<Integer, String> m2 = new HashMap<>(); 
		m2.put(4, "四");
		m2.put(5, "五");
		
		m1.putAll(m2);
		System.out.println(m1);
		
		//map中键不能重复！如果重复（是否重复根据equal方法来判断）则覆盖
		m1.put(3, "三");
		System.out.println(m1);
	}
}

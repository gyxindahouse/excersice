package cn.gyx.collection;

import java.util.HashMap;

/**
 * 手动实现一个hashset，更深刻理解hashset底层原理
 * @author 郭蝈
 *
 */
public class TestHashSet {
	HashMap map;
	private static final Object PRESENT = new Object();
	public TestHashSet(){
		map = new HashMap();
	}
	
	public int size(){
		return map.size();
	}
	
	public void add(Object o){
		map.put(o, PRESENT);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for(Object key:map.keySet()){
			sb.append(key+",");
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		TestHashSet set = new TestHashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.print(set);
	}
}

package cn.gyx.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 测试迭代器遍历map
 * 
 * @author 郭蝈
 *
 */
public class TestIteratorMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "gyx");
		map.put("B", "gyx1");
		//方法一
		Set<Entry<String, String>> ss = map.entrySet();//通过entrySet()方法将map集合中的映射关系取出（这个关系就是Map.Entry类型）
		for (Iterator<Entry<String, String>> iterator = ss.iterator(); iterator.hasNext();) {
			Entry<String, String> e = iterator.next();//获取Map.Entry关系对象e
			System.out.println(e.getKey() + "--" + e.getValue());
		}
		System.out.println("+++++++++++++++++++++++++++++++");
		
		//方法二,也可以通过map的keySet()、valueSet()获得key和value的集合，从而遍历它们
		Set<String> ss1 = map.keySet();//先获取map集合的所有键的Set集合
		for(Iterator<String> iterator = ss1.iterator(); iterator.hasNext();){
			String key = iterator.next();
			System.out.println(key+"--"+map.get(key));//可以通过map集合的get方法获取其对应的值。
		}
	}
}

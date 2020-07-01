package cn.gyx.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ≤‚ ‘collectionsπ§æﬂ¿‡
 * @author π˘ÚÂ
 *
 */
public class TestCollections {
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		for(int i=0; i<5; i++){
			aList.add("a"+i);
		}
		System.out.println(aList);
		Collections.shuffle(aList);//ÀÊª˙≈≈–Ú
		System.out.println(aList);
		Collections.reverse(aList);//ƒÊ–Ú
		System.out.println(aList);
		Collections.sort(aList);//≈≈–Ú
		System.out.println(aList);
		System.out.println(Collections.binarySearch(aList, "a2"));
		Collections.fill(aList, "hello");
		System.out.println(aList);
	}
}

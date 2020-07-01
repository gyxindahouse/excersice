package cn.gyx.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ²âÊÔµü´úÆ÷±éÀúList
 * 
 * @author ¹ùòå
 *
 */
public class TestIteratorList {
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			aList.add("a" + i);
		}
		System.out.println(aList);
		for (Iterator<String> iter = aList.iterator(); iter.hasNext();) {
			String temp = iter.next();
			System.out.print(temp + "\t");
			if (temp.endsWith("3")) {// delete the 3-ended string
				iter.remove();
			}
		}
		System.out.println();
		System.out.println(aList);
	}
}

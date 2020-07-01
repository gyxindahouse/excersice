package ex1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution2 {
	public static void main(String[] args) {
		// int[] nums = {0,8,7};
		String str = "abaccdeff";
		Solution2 sl2 = new Solution2();
		char res = sl2.firstUniqChar(str);
		System.out.println(res);
	}

	public char firstUniqChar(String s) {
		// 用来标记出现一次字符的下标，值为1表示出现1次
		int[] b = new int[s.length()];
		Arrays.fill(b, 0);
		/*
		 * for(int i=0;i<b.length;i++){ System.out.println(b[i]); }
		 */
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; ++i) {
			Integer index = map.get(chars[i]);
			if (index != null) {
				b[index] = 0;//上一次出现的下标
				b[i] = 0;
			} else {
				map.put(chars[i], i);
				b[i] = 1;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		// 遍历获取第一个出现一次的字符
		for (int i = 0; i < chars.length; ++i) {
			if (b[i] == 1) {
				return chars[i];
			}
		}
		return ' ';
	}
}

package cn.gyx.baozhuang;

public class TestString01 {
	public static void main(String[] args) {
		String s1 = new String("abcdef");
		String s2 = s1.substring(2,4);
		System.out.println(Integer.toHexString(s1.hashCode()));
		System.out.println(Integer.toHexString(s2.hashCode()));
	}
}

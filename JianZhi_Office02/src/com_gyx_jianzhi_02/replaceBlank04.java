package com_gyx_jianzhi_02;
/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author 郭蝈
 * （思路：先遍历一遍字符，统计空格数，由此计算替换之后的总长度。然后从后往前加载字符串，如果发现空格，就替换20%）
 */
public class replaceBlank04 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("We Are Happy");
		System.out.println(str);
		replaceSpace(str);
		System.out.println(str);
	}
	public static String replaceSpace(StringBuffer sb){
		int spacenum = 0;
		for(int i = 0; i < sb.length(); i++){
			if (sb.charAt(i)==' '){
				spacenum++;
			}
		}
		int indexold = sb.length() - 1;
		int newlength = sb.length() + spacenum*2;
		int indexnew = newlength - 1;
		sb.setLength(newlength);
		for(;indexold>=0 && indexold < newlength; --indexold){
			if(sb.charAt(indexold)==' '){
				sb.setCharAt(indexnew--, '0');
				sb.setCharAt(indexnew--, '2');
				sb.setCharAt(indexnew--, '%');
			}else{
				sb.setCharAt(indexnew--, sb.charAt(indexold));
			}
		}
		return sb.toString();
	}
}

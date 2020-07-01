package cn.gyx.baozhuang;
/**
 * 测试StringBuffer和StringBuilder
 * @author 郭蝈
 *
 */
public class TestBufferandBuilder {
	public static void main(String[] args) {
		/**StringBuilder*/
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<7; i++){
			sb.append((char)('a'+i)); //追加单个字符
		}
		System.out.println(sb.toString()); //转换成String输出
		sb.append(", I can sing my abc!");
		System.out.println(sb.toString());
		
		/**StringBuffer*/
		StringBuffer sb2 = new StringBuffer("中华人民共和国");
		sb2.insert(0, "爱").insert(0, "我");
		System.out.println(sb2);
		sb2.delete(0, 2);
		System.out.println(sb2);
		
		sb2.deleteCharAt(0).deleteCharAt(0);
		System.out.println(sb2.charAt(0));
		System.out.println(sb2.reverse());
	}
}

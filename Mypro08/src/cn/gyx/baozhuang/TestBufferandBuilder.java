package cn.gyx.baozhuang;
/**
 * ����StringBuffer��StringBuilder
 * @author ����
 *
 */
public class TestBufferandBuilder {
	public static void main(String[] args) {
		/**StringBuilder*/
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<7; i++){
			sb.append((char)('a'+i)); //׷�ӵ����ַ�
		}
		System.out.println(sb.toString()); //ת����String���
		sb.append(", I can sing my abc!");
		System.out.println(sb.toString());
		
		/**StringBuffer*/
		StringBuffer sb2 = new StringBuffer("�л����񹲺͹�");
		sb2.insert(0, "��").insert(0, "��");
		System.out.println(sb2);
		sb2.delete(0, 2);
		System.out.println(sb2);
		
		sb2.deleteCharAt(0).deleteCharAt(0);
		System.out.println(sb2.charAt(0));
		System.out.println(sb2.reverse());
	}
}

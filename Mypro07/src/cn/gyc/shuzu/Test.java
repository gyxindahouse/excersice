package cn.gyc.shuzu;
/**
 * ʹ��ѭ��������ʼ���Ͷ�ȡ����
 * @author ����
 *
 */
public class Test {
	public static void main(String[] args) {
		int[] a = new int[4];
		//��ʼ������Ԫ�ص�ֵ
		for(int i=0; i<a.length; i++){
			a[i] = 100*i;
		}
		//��ȡԪ�ص�ֵ
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}

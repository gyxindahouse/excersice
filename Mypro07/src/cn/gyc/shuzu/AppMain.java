package cn.gyc.shuzu;
/**
 * ��������
 * @author ����
 *
 */
/*public class Test {
	public static void main(String[] args) {
		int[] s = null;//��������
		s = new int[10];//���������ռ�
		for(int i = 0; i < 10; i++){
			s[i] = 2*i + 1;//������Ԫ�ظ�ֵ
			System.out.println(s[i]);
		}
	}
}*/
class Man{
	private int age;
	private int id;
	public Man(int id,int age){
		super();
		this.age = age;
		this.id = id;
	}
}
public class AppMain{
	public static void main(String[] args) {
		Man[] mans;//����������������
		mans = new Man[10];//�����������������ռ�
		
		Man m1 = new Man(1,11);
		Man m2 = new Man(2, 22);
		
		mans[0] = m1;//��������������Ԫ�ظ�ֵ
		mans[1] = m2;
		for(int i=0; i<= mans.length;i++){
			System.out.println(mans[i]);
		}
	}
}
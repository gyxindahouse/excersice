package cn.gyx.oo;
/**
 * �����ڲ���
 * @author Administrator
 *
 */
class Outer{
	private int age = 10;
	public void show(){
		System.out.println(age); //10
	}
}
public class TestInner {
	//�ڲ����п����������ⲿ��ͬ���������뷽��
	private int age = 20;
	public void show(){
		System.out.println(age); //20
	}
}

package cn.gyx.oo;

class Outer2{
	//�൱���ⲿ���һ����̬��Ա
	static class Inner{
	}
}
public class TestStaticInnerClass {
	public static void main(String[] args) {
		//ͨ�� new�ⲿ����.�ڲ�����()�������ڲ������
		Outer2.Inner inner = new Outer2.Inner();
	}
}

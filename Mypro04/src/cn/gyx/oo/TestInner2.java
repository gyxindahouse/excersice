package cn.gyx.oo;

class Outer1{
	private int age = 10;
	class Inner{
		int age = 20;
		public void show(){
			int age = 30;
			System.out.println("�ڲ��෽����ľֲ�����age:" + age);//30
			System.out.println("�ڲ���ĳ�Ա����age:" + this.age);//20
			System.out.println("�ⲿ��ĳ�Ա����age:" + Outer1.this.age);//10
		}
	}
}
public class TestInner2 {
	public static void main(String[] args) {
		Outer1.Inner inner = new Outer1().new Inner();
		inner.show();
		Outer1 outer = new Outer1();
		Outer1.Inner inn = outer.new Inner();
		inn.show();
	}
}

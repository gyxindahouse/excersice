package cn.gyx.oo;

class Outer1{
	private int age = 10;
	class Inner{
		int age = 20;
		public void show(){
			int age = 30;
			System.out.println("内部类方法里的局部变量age:" + age);//30
			System.out.println("内部类的成员变量age:" + this.age);//20
			System.out.println("外部类的成员变量age:" + Outer1.this.age);//10
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

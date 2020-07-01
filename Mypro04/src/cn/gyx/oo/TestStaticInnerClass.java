package cn.gyx.oo;

class Outer2{
	//相当于外部类的一个静态成员
	static class Inner{
	}
}
public class TestStaticInnerClass {
	public static void main(String[] args) {
		//通过 new外部类名.内部类名()来创建内部类对象
		Outer2.Inner inner = new Outer2.Inner();
	}
}

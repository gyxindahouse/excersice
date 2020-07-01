package cn.gyx.oo;
/**
 * 测试内部类
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
	//内部类中可以声明与外部类同名的属性与方法
	private int age = 20;
	public void show(){
		System.out.println(age); //20
	}
}

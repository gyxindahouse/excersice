package cn.gyx.oo;
/**
 * ������дtostring
 * @author ����
 *public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *}
 */
public class TestTostring {
	public static void main(String[] args) {
		Person2 p = new Person2();
		p.age = 20;
		p.name = "guoguo";
		System.out.println("info: " + p);
		
		TestTostring t = new TestTostring();
		System.out.println(t);
	}
}
class Person2{
	String name;
	int age;
	@Override
	public String toString(){
		return name+",���䣺"+age;
	}
}

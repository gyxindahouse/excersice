package cn.gyx.oo;
/**
 * 测试继承
 * @author 郭蝈
 *
 */
public class Test {
	public static void main(String[] args) {
		Student s = new Student("高淇", 172, "java");
		s.rest();
		s.study();
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Student);
	}
}
class Person{
	String name;
	int height;
	public void rest(){
		System.out.println("休息一会！");
	}
}
class Student extends Person{
	String major;
	public void study(){
		System.out.println("在尚学堂，学习java！");
	}
	public Student(String name, int height, String major){
		this.name = name;
		this.height = height;
		this.major = major;
	}
}


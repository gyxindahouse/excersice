package cn.gyx.oo;
/**
 * ���Լ̳�
 * @author ����
 *
 */
public class Test {
	public static void main(String[] args) {
		Student s = new Student("���", 172, "java");
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
		System.out.println("��Ϣһ�ᣡ");
	}
}
class Student extends Person{
	String major;
	public void study(){
		System.out.println("����ѧ�ã�ѧϰjava��");
	}
	public Student(String name, int height, String major){
		this.name = name;
		this.height = height;
		this.major = major;
	}
}


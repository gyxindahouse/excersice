package cn.gyx.oo;
/**
 * ��װ����2
 * @author ���� 
 *
 */
class Person4{
	private String name;
	private int age;
	public Person4(){
		
	}
	public Person4(String name, int age){
		this.name = name;
		//this.age = age;//���췽���в���ֱ�Ӹ�ֵ��Ӧ�õ���setAge����
		setAge(age);
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		//�ٷ�֮ǰ���ж������Ƿ�Ϸ�
		if(age>130 || age<0){
			this.age =18;//���Ϸ���Ĭ��ֵ18
		}else{
			this.age = age;//�Ϸ����ܸ�ֵ������age
		}
	}
	public int getAge(){
		return age;
	}
	@Override
	public String toString(){
		return "Person [name = " + name + ", age = " + age + "]";
	}
}
public class Test2 {
	public static void main(String[] args) {
		Person4 p1 = new Person4();
		//p1.name = "xiaohong";//�������
		p1.setName("xiaohong");
		p1.setAge(-45);
		System.out.println(p1);
		
		Person4 p2 = new Person4("xiaobai", 300);
		System.out.println(p2);
	}
}

package cn.gyx.oo;
/**
 * 封装测试2
 * @author 郭蝈 
 *
 */
class Person4{
	private String name;
	private int age;
	public Person4(){
		
	}
	public Person4(String name, int age){
		this.name = name;
		//this.age = age;//构造方法中不能直接赋值，应该调用setAge方法
		setAge(age);
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		//再服之前先判断年龄是否合法
		if(age>130 || age<0){
			this.age =18;//不合法赋默认值18
		}else{
			this.age = age;//合法才能赋值给属性age
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
		//p1.name = "xiaohong";//编译错误
		p1.setName("xiaohong");
		p1.setAge(-45);
		System.out.println(p1);
		
		Person4 p2 = new Person4("xiaobai", 300);
		System.out.println(p2);
	}
}

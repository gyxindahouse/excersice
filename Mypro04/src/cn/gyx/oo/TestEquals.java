package cn.gyx.oo;
/**
 * 测试重写equals
 * @author 郭蝈
 *
 */
public class TestEquals {
	public static void main(String[] args) {
		Person3 p1 = new Person3(123, "guoguo");
		Person3 p2 = new Person3(123, "郭蝈");
		System.out.println(p1 == p2);//false， 不是同一个对象
		System.out.println(p1.equals(p2));//true，id相同则认为两个对象内容相同
		String s1 = new String("尚学堂");
		String s2 = new String("尚学堂");
		System.out.println(s1 == s2);//false，两个字符串不是同一个对象，id不同（没有id0
		System.out.println(s1.equals(s2));//true，两个字符串内容相同
	}
}
class Person3{
	int id;
	String name;
	public Person3(int id, String name){
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}else{
			if(obj instanceof Person3){
				Person3 c = (Person3)obj;
				if(c.id == this.id){
					return true;
				}
			}
		}
		return false;
	}
}
package cn.gyx.oo;
/**
 * ������дequals
 * @author ����
 *
 */
public class TestEquals {
	public static void main(String[] args) {
		Person3 p1 = new Person3(123, "guoguo");
		Person3 p2 = new Person3(123, "����");
		System.out.println(p1 == p2);//false�� ����ͬһ������
		System.out.println(p1.equals(p2));//true��id��ͬ����Ϊ��������������ͬ
		String s1 = new String("��ѧ��");
		String s2 = new String("��ѧ��");
		System.out.println(s1 == s2);//false�������ַ�������ͬһ������id��ͬ��û��id0
		System.out.println(s1.equals(s2));//true�������ַ���������ͬ
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
package cn.gyx.oo;
/**
 * ��װʵ��
 * @author Administrator
 *
 */
public class JavaBeanPerson {
	//����һ��ʹ��private����
	private String name;
	private int age;
	private boolean flag;
	//Ϊ�����ṩpublic���ε�set/get����
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public boolean isFlag(){//ע�⣺boolean���͵�����get������is��ͷ��
		return flag;
	}
	public void setFlag(boolean flag){
		this.flag = flag;
	}
}

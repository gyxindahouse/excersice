package cn.gyx.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * ʹ��HashSet��TreeSet�洢�����Ʒ��Ϣ�����������;������Ʒ���ԣ���ţ����ƣ����ۣ�������;Ҫ����������Ӷ����ͬ����Ʒ����֤������Ԫ�ص�Ψһ�ԡ�
 * ��ʾ����HashSet������Զ�����Ķ�����Ϣ����Ҫ��дhashCode��equals( )��
 * ��TreeSet������Զ�����Ķ�����Ϣ����Ҫʵ��Comparable�ӿڣ�ָ���Ƚ� ����
 * 
 * @author ����
 *
 */
public class Homework03 {	
	public static void main(String[] args) {
		Set<Product> book1 = new TreeSet<>();
		book1.add(new Product(10001, "���ս���", 40, "�廪������"));
		book1.add(new Product(10002, "�����ʷ", 60, "�廪������"));
		book1.add(new Product(10003, "����", 30, "�廪������"));

		for (Product m : book1) {
			System.out.println(m);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		HashSet<Product> book2 = new HashSet<>();
		book2.add(new Product(10001, "���ս���", 40, "�廪������"));
		book2.add(new Product(10002, "�����ʷ", 60, "�廪������"));
		book2.add(new Product(10003, "����", 30, "�廪������"));
		
		//System.out.println(book2);
		for(Product m1:book2){
			System.out.println(m1);
		}
	}
	
}

class Product implements Comparable<Product> {
	int ID;
	String name;
	int price;
	String publication;

	public Product(int iD, String name, int price, String publication) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "���:" + ID + "\t����:" + name + "\t����:" + price + "\t������:" + publication;
	}

	public int compareTo(Product o) {
		System.out.println("���������compareTo()����");
		if (this.ID > o.ID) {
			return 1;
		} else
			return -1;
	}
	
	public int hashCode(){
		System.out.println("�ҵ�����hashcode()����!");
		return this.ID;
	}
	
/*	@Override equals���ô����ģ���
	public boolean equals(Object obj) {
		System.out.print("�ҵ�����equals()������");
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(getClass()!=obj.getClass()){
			return false;
		}
		Product other = (Product) obj;
		if(ID!=other.ID){
			return false;
		}else{
			return true;
		}
	}*/
}

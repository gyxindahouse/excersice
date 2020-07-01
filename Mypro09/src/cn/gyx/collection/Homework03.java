package cn.gyx.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 使用HashSet和TreeSet存储多个商品信息，遍历并输出;其中商品属性：编号，名称，单价，出版社;要求向其中添加多个相同的商品，验证集合中元素的唯一性。
 * 提示：向HashSet中添加自定义类的对象信息，需要重写hashCode和equals( )。
 * 向TreeSet中添加自定义类的对象信息，需要实现Comparable接口，指定比较 规则。
 * 
 * @author 郭蝈
 *
 */
public class Homework03 {	
	public static void main(String[] args) {
		Set<Product> book1 = new TreeSet<>();
		book1.add(new Product(10001, "长日将近", 40, "清华出版社"));
		book1.add(new Product(10002, "人类简史", 60, "清华出版社"));
		book1.add(new Product(10003, "江城", 30, "清华出版社"));

		for (Product m : book1) {
			System.out.println(m);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		HashSet<Product> book2 = new HashSet<>();
		book2.add(new Product(10001, "长日将近", 40, "清华出版社"));
		book2.add(new Product(10002, "人类简史", 60, "清华出版社"));
		book2.add(new Product(10003, "江城", 30, "清华出版社"));
		
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
		return "编号:" + ID + "\t名称:" + name + "\t单价:" + price + "\t出版社:" + publication;
	}

	public int compareTo(Product o) {
		System.out.println("这里调用了compareTo()方法");
		if (this.ID > o.ID) {
			return 1;
		} else
			return -1;
	}
	
	public int hashCode(){
		System.out.println("我调用了hashcode()函数!");
		return this.ID;
	}
	
/*	@Override equals的用处在哪？？
	public boolean equals(Object obj) {
		System.out.print("我调用了equals()函数！");
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

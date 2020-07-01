package cn.gyx.collection;

import java.util.*;

/**
 * 使用List和Map存放多个图书信息，遍历并输出。其中商品属性：编号，名称，单价，出版社;使用商品编号作为Map中的key。
 * 
 * @author 郭蝈
 *
 */
public class Homework02 {
	public static void main(String[] args) {
		
/*	    Map<String, Object> book1 = new HashMap<>();
		book1.put("编号", 1001);
		book1.put("名称", "长日将尽");
		book1.put("单价", 30);

		Map<String, Object> book2 = new HashMap<>();
		book2.put("编号", 1002);
		book2.put("名称", "人类简史");
		book2.put("单价", 60);

		Map<String, Object> book3 = new HashMap<>();
		book3.put("编号", 1003);
		book3.put("名称", "江城");
		book3.put("单价", 40);

		List<Map<String, Object>> ss = new ArrayList<>();
		ss.add(book1);
		ss.add(book2);
		ss.add(book3);
		
		for(Map<String, Object> book:ss){
			Set<String> keyset = book.keySet();
			for(String key:keyset){
				System.out.println(key + ":" + book.get(key)+"\t");
			}
			System.out.println();
		}
	}
}*/
		//答案
		List<Book> listBook = new ArrayList<Book>();
		Map<String, Book> mapBook = new HashMap();

		listBook.add(new Book("0000001", "老人与海", 18.80, "上海教育出版社"));
		listBook.add(new Book("0000002", "编程思想", 180, "机械印刷出版社"));
		listBook.add(new Book("0000003", "梦的解析", 50, "清华出版社"));

		mapBook.put("0000000", new Book("0000000", "红与黑", 30.5, "清华出版社"));
		mapBook.put("0000001", new Book("0000001", "老人与海", 18.8, "上海教育出版社"));
		mapBook.put("0000002", new Book("0000002", "编程思想", 180, "机械印刷出版社"));

		for (Book books : listBook) {
			System.out.println("ID:" + books.getId() + "\tname:" + books.getName() + "\tprice:" + books.getPrice()
					+ "\tpubilication:" + books.getPublication());
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Set<String> key = mapBook.keySet();
		for (String id : key) {
			System.out.println("ID:" + mapBook.get(id).getId() + "\tname:" + mapBook.get(id).getName() + "\tprice:"
					+ mapBook.get(id).getPrice() + "\tpublication:" + mapBook.get(id).getPublication());
		}
	}
}

class Book {
	String num;
	String name;
	double price;
	String publication;

	public Book(String num, String name, double price, String publication) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.publication = publication;
	}

	public String getPublication() {
		return publication;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getId() {
		return num;
	}
}

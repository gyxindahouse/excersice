package cn.gyx.collection;

import java.util.*;

/**
 * ʹ��List��Map��Ŷ��ͼ����Ϣ�������������������Ʒ���ԣ���ţ����ƣ����ۣ�������;ʹ����Ʒ�����ΪMap�е�key��
 * 
 * @author ����
 *
 */
public class Homework02 {
	public static void main(String[] args) {
		
/*	    Map<String, Object> book1 = new HashMap<>();
		book1.put("���", 1001);
		book1.put("����", "���ս���");
		book1.put("����", 30);

		Map<String, Object> book2 = new HashMap<>();
		book2.put("���", 1002);
		book2.put("����", "�����ʷ");
		book2.put("����", 60);

		Map<String, Object> book3 = new HashMap<>();
		book3.put("���", 1003);
		book3.put("����", "����");
		book3.put("����", 40);

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
		//��
		List<Book> listBook = new ArrayList<Book>();
		Map<String, Book> mapBook = new HashMap();

		listBook.add(new Book("0000001", "�����뺣", 18.80, "�Ϻ�����������"));
		listBook.add(new Book("0000002", "���˼��", 180, "��еӡˢ������"));
		listBook.add(new Book("0000003", "�εĽ���", 50, "�廪������"));

		mapBook.put("0000000", new Book("0000000", "�����", 30.5, "�廪������"));
		mapBook.put("0000001", new Book("0000001", "�����뺣", 18.8, "�Ϻ�����������"));
		mapBook.put("0000002", new Book("0000002", "���˼��", 180, "��еӡˢ������"));

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

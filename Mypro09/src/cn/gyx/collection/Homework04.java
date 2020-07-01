package cn.gyx.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ʵ��List��Map���ݵ�ת��������Ҫ�����£� ����1�����巽��public void listToMap( ){
 * }��List��StudentԪ�ط�װ��Map�� 1) ʹ�ù��췽��Student(int id,String name,int age,String
 * sex )�������ѧ����Ϣ������List; 2) ����List�����ÿ��Student��Ϣ; 3)
 * ��List�����ݷ���Map��ʹ��Student��id������Ϊkey��ʹ��Student������Ϣ��Ϊvalue; 4)
 * ����Map�����ÿ��Entry��key��value�� ����2�����巽��public void mapToList( ){
 * }��Map��Studentӳ����Ϣ��װ��List 1) ����ʵ����StudentEntry�����Դ洢Map��ÿ��Entry����Ϣ; 2)
 * ʹ�ù��췽��Student(int id,String name,int age,String sex
 * )�������ѧ����Ϣ����ʹ��Student��id������Ϊkey������Map; 3) ����List����ÿ��Ԫ��������StudentEntry; 4)
 * ��Map��ÿ��Entry��Ϣ����List���� ����3��˵��Comparable�ӿڵ����ã���ͨ����������ѧ����������
 * 
 * @author ����
 *
 */
public class Homework04 {
	public static void main(String[] args) {
		// ʹ�ù��췽��Student(int id,String name,int age,String sex )�������ѧ����Ϣ������List;
		List<Student> list = new ArrayList<>();
		list.add(new Student(10001, "gyx", 22, "girl"));
		list.add(new Student(10002, "gyx1", 24, "boy"));
		list.add(new Student(10003, "gyx2", 21, "girl"));

		// ����List�����ÿ��Student��Ϣ;
		System.out.println("������List������");
		for (Student m : list) {
			System.out.println(m);
		}

		// ����Map�����ÿ��Entry��key��value��
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("���潫listת��Ϊmap������");
		Map<Integer, Student> map = new HashMap<>();
		map = listToMap(list, map);
		//
		Set<Entry<Integer, Student>> set = map.entrySet();
		for (Entry<Integer, Student> entry : set) {
			System.out.println("ID:" + entry.getKey() + "\tinfo:" + entry.getValue());
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//ʹ�ù��췽��Student(int id,String name,int age,String sex )�������ѧ����Ϣ������List;
		Map<Integer, Student> map1 = new HashMap<>();
		map1.put(10001, new Student(10001, "gyx", 22, "girl"));
		map1.put(10002, new Student(10002, "gyx1", 24, "boy"));
		map1.put(10003, new Student(10003, "gyx2", 21, "girl"));
		
		//Map����
		System.out.println("������mapֱ�ӱ�����");
		Set<Integer> keyset = map1.keySet();
		for(Integer key:keyset){
			System.out.println(map1.get(key));
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//����List����ÿ��Ԫ��������StudentEntry;
		System.out.println("������mapת��Ϊlist������");
		List<StudentEntry> list1 = new ArrayList<StudentEntry>();
		list1 = mapToList(list1, map);
		for(StudentEntry s:list1){
			System.out.println(s);
		}
	}

	public static List<StudentEntry> mapToList(List<StudentEntry> list1, Map<Integer, Student> map) {
		Set<Entry<Integer, Student>> set = map.entrySet();
		list1.add(new StudentEntry(map,set));
		return list1;
	}

	// ��List�����ݷ���Map��ʹ��Student��id������Ϊkey��ʹ��Student������Ϣ��Ϊvalue;
	public static Map<Integer, Student> listToMap(List<Student> list, Map<Integer, Student> map) {
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i).getId(), list.get(i));
		}
		return map;
	}	
}

class Student {
	int id;
	String name;
	int age;
	String sex;

	public Student(int id, String name, int age, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ID:" + id + "\tname:" + name + "\tage:" + age + "\tsex:" + sex;
	}
}

class StudentEntry {
	Map<Integer, Student> map = new HashMap<Integer, Student>();
	Set<Entry<Integer, Student>> set = map.entrySet();
	public StudentEntry(Map<Integer, Student> map, Set<Entry<Integer, Student>> set) {
		super();
		this.map = map;
		this.set = set;
	}
	
	@Override
	public String toString() {
		return set+"\n";
	}
}

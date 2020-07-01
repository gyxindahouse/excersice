package cn.gyx.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 实现List和Map数据的转换。具体要求如下： 功能1：定义方法public void listToMap( ){
 * }将List中Student元素封装到Map中 1) 使用构造方法Student(int id,String name,int age,String
 * sex )创建多个学生信息并加入List; 2) 遍历List，输出每个Student信息; 3)
 * 将List中数据放入Map，使用Student的id属性作为key，使用Student对象信息作为value; 4)
 * 遍历Map，输出每个Entry的key和value。 功能2：定义方法public void mapToList( ){
 * }将Map中Student映射信息封装到List 1) 创建实体类StudentEntry，可以存储Map中每个Entry的信息; 2)
 * 使用构造方法Student(int id,String name,int age,String sex
 * )创建多个学生信息，并使用Student的id属性作为key，存入Map; 3) 创建List对象，每个元素类型是StudentEntry; 4)
 * 将Map中每个Entry信息放入List对象。 功能3：说明Comparable接口的作用，并通过分数来对学生进行排序。
 * 
 * @author 郭蝈
 *
 */
public class Homework04 {
	public static void main(String[] args) {
		// 使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息并加入List;
		List<Student> list = new ArrayList<>();
		list.add(new Student(10001, "gyx", 22, "girl"));
		list.add(new Student(10002, "gyx1", 24, "boy"));
		list.add(new Student(10003, "gyx2", 21, "girl"));

		// 遍历List，输出每个Student信息;
		System.out.println("下面是List遍历：");
		for (Student m : list) {
			System.out.println(m);
		}

		// 遍历Map，输出每个Entry的key和value。
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("下面将list转化为map遍历：");
		Map<Integer, Student> map = new HashMap<>();
		map = listToMap(list, map);
		//
		Set<Entry<Integer, Student>> set = map.entrySet();
		for (Entry<Integer, Student> entry : set) {
			System.out.println("ID:" + entry.getKey() + "\tinfo:" + entry.getValue());
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//使用构造方法Student(int id,String name,int age,String sex )创建多个学生信息并加入List;
		Map<Integer, Student> map1 = new HashMap<>();
		map1.put(10001, new Student(10001, "gyx", 22, "girl"));
		map1.put(10002, new Student(10002, "gyx1", 24, "boy"));
		map1.put(10003, new Student(10003, "gyx2", 21, "girl"));
		
		//Map遍历
		System.out.println("下面是map直接遍历：");
		Set<Integer> keyset = map1.keySet();
		for(Integer key:keyset){
			System.out.println(map1.get(key));
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//创建List对象，每个元素类型是StudentEntry;
		System.out.println("下面是map转化为list遍历：");
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

	// 将List中数据放入Map，使用Student的id属性作为key，使用Student对象信息作为value;
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

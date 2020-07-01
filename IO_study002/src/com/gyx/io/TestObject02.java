package com.gyx.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 对象流02
 * ObjectOutputStream ObjectInputStream
 * @author 郭蝈
 *
 */
public class TestObject02 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("obj.ser")));
		oos.writeUTF("bianmaxinsuanlei");
		oos.writeInt(18);
		oos.writeBoolean(false);
		oos.writeChar('a');
		
		oos.writeObject("sheijieqizhongwei");
		oos.writeObject(new Date());
		Employee emp = new Employee("mayun", 400);
		oos.writeObject(emp);
		oos.flush();
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("obj.ser")));
		String msg = ois.readUTF();
		int age = ois.readInt();
		boolean flag = ois.readBoolean();
		char ch = ois.readChar();
		System.out.println(flag);
		
		Object str = ois.readObject();
		Object date = ois.readObject();
		Object employee = ois.readObject();
		
		if(str instanceof String){
			String strObj = (String) str;
			System.out.println(strObj);
		}
		if(date instanceof Date){
			Date dateObj = (Date) date;
			System.out.println(dateObj);
		}
		if(employee instanceof Employee){
			Employee empObj = (Employee) employee;
			System.out.println(empObj.getName() + "-->" + empObj.getSalary());
		}
		ois.close();
	}
}

package com.gyx.commons;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Homework01 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//基本数据类型————》字节数组
		DataToByteArray tba = new DataToByteArray("hello world");//1.创建源
		byte[] bt = tba.strToByteArray();
		System.out.println(bt.length);
		//字节数组---》数据类型
		ByteArrayToData bat = new ByteArrayToData(bt);
		String str = bat.byteArrayToStr();
		System.out.println(str);
		System.out.println("---------------------");
		//引用类型----》字节数组
		Employee ee = new Employee(22, "gyx");
		ObjToByteArray otba = new ObjToByteArray(ee);
		bt = otba.objToByteArray();
		System.out.println(bt.length);
		//字节数组---》引用类型
		Employee ee1 = null;
		ByteArrayToObj baot = new ByteArrayToObj(bt, ee1);
		ee1 = (Employee) baot.byteArrayToObj();
		System.out.println(ee1.getName()+"------->"+ee1.getAge());
	}
}
//基本数据类型————》字节数组
class DataToByteArray{
	byte[] bytes;
	private String str;
	private int num;
	private char ch;
	private boolean flag;
	
	public DataToByteArray(String str) {
		super();
		this.str = str;
	}
	public DataToByteArray(int num) {
		super();
		this.num = num;
	}
	public DataToByteArray(char ch) {
		super();
		this.ch = ch;
	}
	public DataToByteArray(boolean flag) {
		super();
		this.flag = flag;
	}
	
	public byte[] strToByteArray() throws IOException{
		// 2.选择流
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);//dos-->baos
		//3.操作
		dos.writeUTF(str);//data-->dos
		//4.释放
		close(dos);
		return bytes = baos.toByteArray();
	}
	
	public byte[] intToByteArray() throws IOException{
		//1.创建源 2.选择流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);//dos-->baos
		//3.操作
		dos.write(num);//data-->dos
		//4.释放
		close(dos);
		return bytes = baos.toByteArray();
	}
	
	public byte[] charToByteArray() throws IOException{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeChar(ch);
		close(dos);
		bytes = baos.toByteArray();
		return bytes;
		
	}
	
	public byte[] BooleanToByteArray() throws IOException{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeBoolean(flag);
		close(dos);
		return bytes = baos.toByteArray();
	}
	
	private void close(Closeable...ios) {
		for(Closeable io:ios){
			if(null!=io){
				try {
					io.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

//字节数组---》数据类型
class ByteArrayToData{
	byte[] bytes;

	public ByteArrayToData(byte[] bytes) {
		super();
		this.bytes = bytes;
	}
	
	public String byteArrayToStr() throws IOException{
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		DataInputStream dis = new DataInputStream(bais);
		String str = dis.readUTF();
		close(dis);
		return str;
	}
	
	public int byteArrayToInt() throws IOException{
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		DataInputStream dis = new DataInputStream(bais);
		int Integer = dis.readInt();
		close(dis);
		return Integer;
	
	}
	public char byteArrayTOChar() throws IOException{
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		DataInputStream dis = new DataInputStream(bais);
		char ch = dis.readChar();
		close(dis);
		return ch;
	}

	public boolean byteArrayTOBoolean() throws IOException{
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		DataInputStream dis = new DataInputStream(bais);
		boolean flag = dis.readBoolean();
		close(dis);
		return flag;
	}
	
	private void close(DataInputStream dis) {
		if(null!=dis){
			try {
				dis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
//引用类型--》字节数组
class ObjToByteArray{
	private Object obj;
	private byte[] bytes;
	public ObjToByteArray(Object obj) {
		super();
		this.obj = obj;
	}
	
	public byte[] objToByteArray() throws IOException{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(obj);
		bytes = baos.toByteArray();
		close(oos);
		return bytes;
	}

	private void close(ObjectOutputStream oos) {
		if(null!=oos){
			try {
				oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

//字节数组--》引用类型
class ByteArrayToObj{
	private byte[] bytes;
	private Object obj;
	public ByteArrayToObj(byte[] bytes, Object obj) {
		super();
		this.bytes = bytes;
		this.obj = obj;
	}
	public Object byteArrayToObj() throws ClassNotFoundException, IOException{
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bais);
		obj = ois.readObject();
		close(ois);
		return obj;
	}
	private void close(ObjectInputStream ois) {
		if(null!= ois){
			try {
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}
}

//对象Employee---必须可序列化
class Employee implements Serializable{
	private int age;
	private String name;
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

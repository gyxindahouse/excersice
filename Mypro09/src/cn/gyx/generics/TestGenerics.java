package cn.gyx.generics;

import java.util.Objects;

/**
 * ���Է���
 * @author ����
 *
 */
public class TestGenerics {
	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<String>();
		mc.set("aaa", 0);
		mc.set("bbb", 1);
		String str = mc.get(0);//���˷��ͣ�ֱ�ӷ���string���ͣ�����ǿ��ת��
		System.out.println(str);
	}
}
class MyCollection<E>{
	Object[] objs = new Objects[5];
	
	@SuppressWarnings("unchecked")
	public E get(int index){
		return(E) objs[index];
	}
	public void set(E e, int index){
		objs[index] = e;
	}
}
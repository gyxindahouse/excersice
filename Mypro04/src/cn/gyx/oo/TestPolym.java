package cn.gyx.oo;
/**
 * ���Զ�̬
 * @author ����
 *
 */
class Animal{
	public void shout(){
		System.out.println("����һ����");
	}
}
class Dog extends Animal{
	public void shout(){
		System.out.println("��������");
	}
	public void seeDoor(){
		System.out.println("������");
	}
}
class Cat extends Animal{
	public void shout(){
		System.out.println("����������");
	}
}
public class TestPolym {
	public static void main(String[] args) {
		Animal a1 = new Cat();//���Ͽ����Զ�ת��
		//���ľ�������һ����͵�����һ����ķ������������˳���Ŀ���չ��
		animalCry(a1);
		Animal a2 = new Dog();
		animalCry(a2);//a2Ϊ�������ͣ�Dog�����������ʱ����,Dog a2 = new Dog();Ч����һ����
		
		//��д����ʱ��������������ʱ���͵ķ�����ֻ�ܽ���ǿ������ת����
		//����ͨ�����������ļ��
		Dog dog = (Dog) a2;//������Ҫǿ������ת��
		dog.seeDoor();
	}
	
	//���˶�̬��ֻҪ�����ӵ�����ۼ̳�Animal��Ϳ�����
	static void animalCry(Animal a){
		a.shout();
	}
    /* ���û�ж�̬������������Ҫд�ܶ����صķ�����
     * ÿ����һ�ֶ������Ҫ����һ�ֶ���ĺ��з������ǳ��鷳��
    static void animalCry(Dog d) {
        d.shout();
    }
    static void animalCry(Cat c) {
        c.shout();
    }*/
}
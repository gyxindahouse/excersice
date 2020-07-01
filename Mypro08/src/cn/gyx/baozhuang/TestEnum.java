package cn.gyx.baozhuang;

import java.util.Random;

public class TestEnum {
	public static void main(String[] args) {
		//ö�ٱ���
		for(Week k:Week.values()){
			System.out.println(k);
		}
		//switch�����ʹ��ö��
		int a = new Random().nextInt(4);//����0��1��2��3�������
		switch(Season.values()[a]){
		case SPRING:
			System.out.println("����");
			break;
		case SUMMER:
			System.out.println("����");
			break;
		case AUTUMN:
			System.out.println("����");
			break;
		case WINTER:
			System.out.println("����");
			break;
		}
	}
}
enum Season{
	SPRING, SUMMER, AUTUMN, WINTER
}
enum Week{
	//����һ, ���ڶ�, ������, ������,  ������, ������, ������
}

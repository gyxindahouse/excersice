package cn.gyc.shuzu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ������Ҳ���������һ������Ϊ10 ��һά�ַ������飬��ÿһ��Ԫ�ش��һ������;
 * Ȼ������ʱ������������һ�����ʣ������ж������Ƿ������������ʣ�
 * ����������ʾʹ�ӡ����Yes�����������ʹ�ӡ����No����
 * @author ����
 *
 */

/*
 * public class Homework01 {
	public static void main(String[] args) {
		String[] arr= {"love", "hatry", "freedom", "fortune", "lonely", "happy", "cute", "selfish", "cool", "beauty"};
		System.out.println("������һ��Ԫ�أ�");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		System.out.println("Ԫ�������ǣ�" + arrEqual(arr, a));
	}
	public static int arrEqual(String[] arr, String word){
		for(int i=0; i<arr.length-1; i++){
			if(word.equals(arr[i])){
				return i;
				//System.out.print("yes");
			}
		}
		return -1;
	}
}
*/

//��
public class Homework01 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�ˮ����");
		String input=scanner.next();
		Homework01.SearchFruit(input);
		
		
	}
	//����SearchFruit�����������û�����ĵ���
	public static void SearchFruit(String fruit) {
		boolean flag = true;
		String[] fruits= {"apple","banana","orange","pineapple","strawberry","blackberry","peach","pear","lemon","cherry"};
		for(int i=0;i<fruits.length;i++) {
			flag=true;
			if(fruits[i].equals(fruit)) {
				System.out.println("Yes");
				flag=false;
				break;
			}
			
		}
		if(flag) {
				System.out.println("No");
			}
	}
	
}


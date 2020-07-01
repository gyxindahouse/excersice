package cn.gyc.shuzu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词;
 * 然后运行时从命令行输入一个单词，程序判断数组是否包含有这个单词，
 * 包含这个单词就打印出“Yes”，不包含就打印出“No”。
 * @author 郭蝈
 *
 */

/*
 * public class Homework01 {
	public static void main(String[] args) {
		String[] arr= {"love", "hatry", "freedom", "fortune", "lonely", "happy", "cute", "selfish", "cool", "beauty"};
		System.out.println("请输入一个元素：");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		System.out.println("元素索引是：" + arrEqual(arr, a));
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

//答案
public class Homework01 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入你要查找的水果：");
		String input=scanner.next();
		Homework01.SearchFruit(input);
		
		
	}
	//定义SearchFruit方法来查找用户输入的单词
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


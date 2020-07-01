package cn.gyc.shuzu;

import java.util.Arrays;

/**
 * 数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果。
   思路：把0索引和arr.length-1的元素交换，把1索引和arr.length-2的元素交换…..
   只要交换到arr.length/2的时候即可。
 * @author 郭蝈
 *
 */
/*
 	自己的版本
	public static void main(String[] args) {
		int[] array = {1,2,4,45,66,7,8,9,0,17};
		System.out.println("原数组为：" + Arrays.toString(array));
		Exchange(array);
		System.out.println("对调后的数组为：" + Arrays.toString(array));
	}

	private static int[] Exchange(int[] arr) {
		int temp = 0;
		for(int i=0; i<arr.length/2; i++){
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return arr;
	}
}
*/

public class Homework03 {
	 public static void main(String[] args) {
	 	int[] numbers= {0,1,2,3,4,5,6,7,8,9};
	 	System.out.println("初始数组:"+Arrays.toString(numbers));
	 	int k=0;
	 	for(int start=0,end=numbers.length-1;start<end;start++,end--) {
	 			k=numbers[start];
	 			numbers[start]=numbers[end];
	 			numbers[end]=k;
	 			System.out.println("第"+start+"次交换："+Arrays.toString(numbers));
	 	}
	 	System.out.println("对调结束，数组为："+Arrays.toString(numbers));
	 }
	}

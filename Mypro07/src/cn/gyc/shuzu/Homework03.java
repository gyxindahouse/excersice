package cn.gyc.shuzu;

import java.util.Arrays;

/**
 * ����������������峤��Ϊ10�����飬������Ԫ�ضԵ���������Ե�ǰ��Ľ����
   ˼·����0������arr.length-1��Ԫ�ؽ�������1������arr.length-2��Ԫ�ؽ�����..
   ֻҪ������arr.length/2��ʱ�򼴿ɡ�
 * @author ����
 *
 */
/*
 	�Լ��İ汾
	public static void main(String[] args) {
		int[] array = {1,2,4,45,66,7,8,9,0,17};
		System.out.println("ԭ����Ϊ��" + Arrays.toString(array));
		Exchange(array);
		System.out.println("�Ե��������Ϊ��" + Arrays.toString(array));
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
	 	System.out.println("��ʼ����:"+Arrays.toString(numbers));
	 	int k=0;
	 	for(int start=0,end=numbers.length-1;start<end;start++,end--) {
	 			k=numbers[start];
	 			numbers[start]=numbers[end];
	 			numbers[end]=k;
	 			System.out.println("��"+start+"�ν�����"+Arrays.toString(numbers));
	 	}
	 	System.out.println("�Ե�����������Ϊ��"+Arrays.toString(numbers));
	 }
	}

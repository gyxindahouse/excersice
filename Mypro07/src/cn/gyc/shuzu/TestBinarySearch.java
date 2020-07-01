package cn.gyc.shuzu;

import java.util.Arrays;

/**
 * ���Զ��ַ�����
 * @author ����
 *
 */
public class TestBinarySearch {
	public static void main(String[] args) {
		int[] arr = { 30,20,50,10,80,9,7,12,100,40,8};
		int searchword = 80;//��Ҫ���ҵ���
		Arrays.sort(arr);//���ַ�����֮ǰ��һ��Ҫ������Ԫ������
		System.out.print(Arrays.toString(arr));
		System.out.print(searchword + "Ԫ�ص�����:" + binarysearch(arr, searchword));
	}
	public static int binarysearch(int[] array, int value){
		int low = 0;
		int high = array.length - 1;
		while(low <= high){
			int middle = (low + high) / 2;
			if(value ==  array[middle]){
				return middle;  //���ز�ѯ��������λ��
			}
			if(value > array[middle]){
				low = middle + 1;
			}
			if(value < array[middle]){
				high = middle - 1;
			}
		}
		return -1; //����ѭ����ϣ�˵��δ�ҵ�������-1
	}
}

package cn.gyc.shuzu;

import java.util.Arrays;

/**
 * 测试二分法查找
 * @author 郭蝈
 *
 */
public class TestBinarySearch {
	public static void main(String[] args) {
		int[] arr = { 30,20,50,10,80,9,7,12,100,40,8};
		int searchword = 80;//所要查找的数
		Arrays.sort(arr);//二分法查找之前，一定要对数组元素排序
		System.out.print(Arrays.toString(arr));
		System.out.print(searchword + "元素的索引:" + binarysearch(arr, searchword));
	}
	public static int binarysearch(int[] array, int value){
		int low = 0;
		int high = array.length - 1;
		while(low <= high){
			int middle = (low + high) / 2;
			if(value ==  array[middle]){
				return middle;  //返回查询到的索引位置
			}
			if(value > array[middle]){
				low = middle + 1;
			}
			if(value < array[middle]){
				high = middle - 1;
			}
		}
		return -1; //上面循环完毕，说明未找到，返回-1
	}
}

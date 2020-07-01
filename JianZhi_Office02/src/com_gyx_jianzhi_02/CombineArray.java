package com_gyx_jianzhi_02;

import java.util.Arrays;

/**
 * 有两个排序的数组A1和A2，内存在A1的末尾有足够多的空余空间容纳A2 实现一个函数将A2中所有的数字插入到A1中，并且所有数字是排序的
 * 
 * @author 郭蝈 思想：从尾到头比较A1和A2中的数字，并把较大的数字复制到A1中合适位置
 */
public class CombineArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 6, 9};
		int[] arr2 = { 3, 5, 10, 14, 23 };
		int[] arr3 = CombinSort(arr1, arr2, arr1.length, arr2.length);
		System.out.println(Arrays.toString(arr3));
	}

	private static int[] CombinSort(int[] arr1, int[] arr2, int length1, int length2) {
		int indexmerge = length1 + length2 - 1;
		int indexarr1 = length1 - 1;
		int indexarr2 = length2 - 1;
		int[] temp = new int[indexmerge + 1];
		// 如果arr2的indexarr2不为零 即还有数
		while (indexarr1 >= 0 && indexarr2 >= 0) {
			if (arr1[indexarr1] >= arr2[indexarr2]) {
				temp[indexmerge] = arr1[indexarr1];
				indexarr1--;
				indexmerge--;
			} else {
				temp[indexmerge] = arr2[indexarr2];
				indexarr2--;
				indexmerge--;
			}
		}
		// 此循环是当arr2长度大于arr1时，由于arr1中已经没有数字，所以将剩余的数字
		// 都插在arr1中，若arr2长度小于arr1就不循环
		while (indexarr1 >= 0) {
			temp[indexmerge] = arr1[indexarr1];
			indexarr1--;
			indexmerge--;
		}
		return temp;
	}
}

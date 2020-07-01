package com_gyx_jianzhi_02;
/**
 * 题目描述 
在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
1.该数位于最大最小值之间
 * @author 郭蝈
 * 思路：  从右上角开始，若小，向下走，删除一行，若大，向左走，删除一列
 */
public class find2D0301 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		findSolution(arr, 3);
	}

	private static void findSolution(int[][] arr, int target) {
		int row = 0;
		int col = arr[0].length - 1;
		boolean flag = false;
		while (row <= arr[0].length - 1 && col >= 0) {
			if (target == arr[row][col]) {
				System.out.println("找到" + target + ",在" + row + "行" + col + "列");
				flag = true;
				break;
			} else if (arr[row][col] < target) {
				row++;
			} else {
				col--;
			}
		}
		if ((target < arr[0][0]) || (target > arr[arr.length - 1][arr[0].length - 1])) {
			flag = true;
			System.out.println("超出索引范围");
		}
		if(!flag){
			System.out.println("该数未出现在数组内");
		}
	}
}

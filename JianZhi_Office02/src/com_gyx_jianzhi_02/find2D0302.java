package com_gyx_jianzhi_02;
/**
 * 题目描述 
查找一个二维数组中的最大值
 * @author 郭蝈
 * 思路：  从右上角开始，若小，向下走，删除一行，若大，向左走，删除一列
 */
public class find2D0302 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 4, 3 }, { 4, 6, 22, 6}, { 44, 3, 6, 8 }, { 33, 22, 10, 9 } };
		findMax(arr);
		System.out.println(findMax(arr));
	}

	private static int findMax(int[][] arr) {
		int col = arr[0].length;
		int row = arr.length;
		int max = arr[0][0];
		for(int i = 0; i < row -1 ; i++){
			for(int j = 0; j < col -1 ; j++){
				if(max<=arr[i][j]){
					max = arr[i][j];
				}
			}
		}
		return max;
	}
}

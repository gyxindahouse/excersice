package cn.gyc.shuzu;

import java.util.Arrays;

/**
 * 测试二维数组
 * @author 郭蝈
 *
 */

public class Test2DArray {
	public static void main(String[] args) {
		int[][] a = new int[3][];
		// a[0] = {1,2,5};//错误，没有声明类型就初始化
		a[0] = new int[]{1, 2};
		a[1] = new int[]{2, 3};
		a[2] = new int[]{2, 2, 3, 4};
		System.out.println(a[2][3]);
		System.out.println(Arrays.toString(a[0]));
		System.out.println(Arrays.toString(a[1]));
		System.out.println(Arrays.toString(a[2]));
		
		//获取数组长度
		System.out.println(a.length);
		System.out.println(a[0].length);
	}
}

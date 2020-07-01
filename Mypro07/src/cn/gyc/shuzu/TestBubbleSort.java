package cn.gyc.shuzu;

import java.util.Arrays;

/**
 * 测试冒泡排序
 * @author 郭蝈
 *
 */
public class TestBubbleSort {
	public static void main(String[] args) {
		int[] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
		bubblesort(values);
		//System.out.println(Arrays.toString(values));
	}
	public static void bubblesort(int[] values){
		int temp;
		int i;
		// 外层循环：n个元素排序，则至多需要n-1趟循环
		for(i = 0; i < values.length - 1; i++){
			// 定义一个布尔类型的变量，标记数组是否已达到有序状态
			boolean flag = true;
			/*内层循环：每一趟循环都从数列的前两个元素开始进行比较，比较到无序数组的最后*/
			for(int j = 0; j < values.length - 1 - i; j++){
				if(values[j] > values[j+1]){
					temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
					 //本趟发生了交换，表明该数组在本趟处于无序状态，需要继续比较；
					flag = false;
				}
				System.out.println(Arrays.toString(values));
			}
			 //根据标记量的值判断数组是否有序，如果有序，则退出；无序，则继续循环。
			if(flag){
				System.out.println("结束了！！！！");
				break;
			}
			System.out.println("##############################");
		}
	}
}

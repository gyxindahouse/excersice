package cn.gyc.shuzu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 获取数组最大值和最小值操作：利用Java的Math类的random()方法，编写函数得到0到n之间的随机数，n是参数。
 * 并找出产生50个这样的随机数中最大的、最小的数，并统计其中>=60的有多少个。 提示：使用 int
 * num=(int)(n*Math.random());获取随机数
 * 
 * @author 郭蝈
 *
 */

/*我的版本
public class Homework02 {
	public static void main(String[] args) {
		System.out.print("请输入n的值(n<100)： ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[100];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (n * Math.random());
			if(arr[i] >= 60){
				cnt++;
			}
		}
		System.out.println(Arrays.toString(arr));
		Sort(arr);
		System.out.println("大于等于60的数个数为： "+cnt);
		System.out.println("min num = "+arr[0]);
		System.out.println("max num = "+arr[arr.length-1]);
	}
	 public static int[] Sort(int[] arr){
		int temp = 0;
		boolean flag = true;
		for(int j=0; j < arr.length-1; j++){
			for(int i=0; i < arr.length-1-j; i++){
				if(arr[i] > arr[i+1]){
					temp = arr[i];
					arr[i] = arr [i+1];
					arr[i+1] = temp;
					flag = false;
				}
				if(flag){
					break;
				}
			}
		}
		return arr;
	}
}
*/

//答案
public class Homework02 {
	public static void main(String[] args) {
		int[] neednumbers=getNum(50);
		System.out.println("随机数组为："+Arrays.toString(neednumbers));
		System.out.println("冒泡排序后的数组为："+Arrays.toString(bubbleSort(neednumbers)));
		System.out.println("最小的数为："+neednumbers[0]+"\n最小的数为："+neednumbers[49]);
		System.out.println("大于60的数个数为："+numSearch(neednumbers,60));
	}
	public static int[] getNum(int num) { //获取一个随机数组
		int[] numbers=new int[num];
		for(int a=0;a<num;a++) {
			int b=(int)(num*Math.random());
			numbers[a]=b;
		}
		return numbers;
	}	
	
	public static int[] bubbleSort(int[] numbers) {
		for(int x=0;x<numbers.length;x++) {  //定义冒泡排序，首位为最小数，末位为最大数 
					for(int y=0;y<numbers.length-1-x;y++) {
						if(numbers[y]>numbers[y+1]) {
							int z=numbers[y];
							numbers[y]=numbers[y+1];
							numbers[y+1]=z;	
						}
						
					}
									
				}
		return numbers;
	}
	
	public static int numSearch(int[] numbers,int num) {
		int count=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>=num) {
				count+=1;
			}
		}
		return count;
	}
}


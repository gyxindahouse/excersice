package com_gyx_jianzhi_02;

public class chongfuzi02 {
	public static void main(String[] args) {
		findRecycled fr = new findRecycled();
		int[] shuzu = fr.arr(7);
		fr.print(shuzu);
		System.out.println();
		int[] shuzu1 = fr.bubbleSort(shuzu);
		fr.print(shuzu1);
	}

}

class findRecycled {
	public static int[] bubbleSort(int[] shuzu) {
		int temp;
		int i;
		int cnt = 0;
		for (i = 0; i < shuzu.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < shuzu.length - 1 - i; j++) {
				if (shuzu[j] > shuzu[j + 1]) {
					temp = shuzu[j];
					shuzu[j] = shuzu[j + 1];
					shuzu[j + 1] = temp;
					flag = false;
				}
				if(shuzu[j] == shuzu[j + 1]){
					cnt++;
					System.out.println(shuzu[j] + "重复" + cnt + "次");
				}
			}
			if (flag) {
				break;
			}
			cnt = 0;
		}
		return shuzu;
	}

	public static int[] arr(int i) {
		int[] arr = new int[i];
		for (int a = 0; a < i; a++) {
			arr[a] = (int) (i * Math.random());
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

/*	public static void find(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				cnt++;
				System.out.println(arr[i] + "重复" + cnt + "次");
			}
			cnt = 0;
		}
	}*/
}

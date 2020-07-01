package ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution8 {
	public static void main(String[] args) {
		Solution8 sl8 = new Solution8();
		String str = " 4!5";
		int[] nums = {1,2,3,4,5};
		//int[] res = sl8.printNumbers(2);
		// int sum = sl8.sum(4);
	/*	for(int i = 0; i < res.length; i++){
			System.out.println(res[i]);
		}*/
	}
/*
	public int lastRemaining(int n, int m) {
		int ans = 0;
		// 最后一轮剩下2个人，所以从2开始反推
		for (int i = 2; i <= n; i++) {
			ans = (ans + m) % i;
			// System.out.println(ans);
		}
		return ans;
	}

	public int sum(int n) {
		int sum = n;
		boolean result = (n > 0) && ((sum += sum(n - 1)) > 0);
		// boolean result = (n > 0);
		System.out.println(result);
		return sum;
	}

	public int strToInt(String str) {
		char[] c = str.trim().toCharArray();
		if (c.length == 0)
			return 0;
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		int res = 0, bndry = Integer.MAX_VALUE / 10;
		int i = 1, sign = 1;
		if (c[0] == '-')
			sign = -1;
		else if (c[0] != '+')
			i = 0;
		for (int j = i; j < c.length; j++) {
			if (c[j] < '0' || c[j] > '9')
				break;
			if (res > bndry || res == bndry && c[j] > '7')
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			res = res * 10 + (c[j] - '0');
			System.out.println(res);
		}
		return sign * (int) res;
	}

	public int findRepeatNumber(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return -1;
    }

	public int[] constructArr(int[] a) {
		if(a.length == 0) return new int[0];
        int[] b = new int[a.length];
        b[0] = 1;
        int tmp = 1;
        for(int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i - 1];
            //System.out.println(b[i]);
        }
        for(int i = a.length - 2; i >= 0; i--) {
        	//System.out.println("tmp="+tmp+"\ta[i]="+a[i+1]+"\tb[i]="+b[i]);
            tmp *= a[i + 1];
            b[i] *= tmp;
            //System.out.println("tmp="+tmp+"\ta[i]="+a[i+1]+"\tb[i]="+b[i]);
        }

        return b;
    }
*/
	
}

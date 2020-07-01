package ex1;

import java.util.HashMap;
import java.util.Map;

public class Solution5 {
	public static void main(String[] args) {
		int[] nums = {3,4,3,3};
		Solution5 sl5 = new Solution5();
		int res = sl5.singleNumber(nums);
		System.out.println(res);
	}
	public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            Integer index = map.get(new Integer(nums[i]));
            //System.out.println(index);
            if(index != null){
                arr[index] = 0;
                arr[i] = 0;
            }else{
                map.put(nums[i], i);
                arr[i] = 1;
            }
        } 
        for(int i = 0; i < arr.length; i++){
        	//System.out.println(arr[i]);
            if(arr[i] == 1){
                return nums[i];
            }
        } 
        return 0;
    }
}

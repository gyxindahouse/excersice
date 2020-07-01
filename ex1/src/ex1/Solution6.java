package ex1;

public class Solution6 {
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,5};
		Solution6 sl = new Solution6();
		int res = sl.missingNumber(nums);
		System.out.println(res);
	}
	public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            System.out.println("i="+i+"\tj="+j+"\tm="+m);
            if(nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}

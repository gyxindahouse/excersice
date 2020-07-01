package ex1;

public class Solution4 {
	public static void main(String[] args) {
		int[] nums = {1,2,10,4,1,4,3,3};
		//String str = "abaccdeff";
		Solution4 sl2 = new Solution4();
		int[] res = sl2.singleNumbers(nums);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
	
	public int[] singleNumbers(int[] nums) {
        int sum = 0;
       int[] res = new int[2];
       for(int num : nums){
           sum ^= num;
           //System.out.println("sum="+sum);
       }
       int lowbit = sum & (-sum);
       System.out.println(lowbit);
       for(int num : nums){
    	   System.out.println("("+num+" & "+lowbit+")=" + (num & lowbit));
           if((num & lowbit) == 0){
               res[0] ^= num;
               System.out.println("res[0]="+res[0]);
           }else{
               res[1] ^= num;
               System.out.println("res[1]="+res[1]);
           }
       }
       return res;
   }
}

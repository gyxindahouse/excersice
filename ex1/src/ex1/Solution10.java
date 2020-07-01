package ex1;

public class Solution10 {
	public static void main(String[] args) {
		Solution10 sl = new Solution10();
		int count = sl.movingCount(1, 2, 1);
		System.out.println(count);
	}
	
	 public int movingCount(int m, int n, int k) {
	        int[][] flag = new int[m][n];
	        return dfs(0, 0, m, n, k, flag);
	    }
	    int dfs(int i, int j, int m, int n, int k, int[][] flag){
	        if(i < 0 || i >= m || j < 0 || j >= n || flag[i][j] == 1 || sum(i) + sum(j) > k) return 0;
	        flag[i][j] = 1;
	        return dfs(i+1, j, m, n, k, flag) + dfs(i, j+1, m, n, k, flag) + 1; 
	    }
	    int sum(int i){
	        int sum = 0;
	        while(i > 0){
	            sum += i % 10;
	            i /= 10;
	        }
	        return sum;
	    }
}

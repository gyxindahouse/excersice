package ex1;

public class Solution11 {
	public static void main(String[] args) {
		Solution11 sl = new Solution11();
		int num = sl.movingCount(18, 35, 38);
		System.out.println(num);
	}
    public int movingCount(int threshold, int rows, int cols)
    {
        int[][] flag = new int[rows][cols];
        return helper(0,0,rows,cols,threshold, flag);
    }
    public int helper(int m, int n, int row, int col, int threshold, int[][] flag){
        if(m < 0 || n < 0|| m >= row || n >= col || sum(m)+sum(n) > threshold || flag[m][n] == 1) return 0;
        flag[m][n] = 1;
        return helper(m+1, n, row, col, threshold, flag) 
            + helper(m, n+1, row, col, threshold,flag)+1;
           // helper(m-1, n, row, col, threshold,flag)
           // +helper(m, n-1, row, col, threshold,flag)+1;
    }
    //int sum = 0;
    int sum(int i){
        int sum = 0;
        while(i>0){
            sum += i%10;
            i/=10;
        }
        //System.out.println(sum);
        return sum;
    }
}

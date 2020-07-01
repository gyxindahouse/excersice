package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution12 {
	public static void main(String[] args) {
		Solution12 sl12 = new Solution12();
		int[] num = {2,3,4,2,6,2,5,1};
		ArrayList<Integer> res = sl12.maxInWindows(num, 3);
		for(int i = 0; i < res.size(); i++){
			System.out.println(res.get(i));
		}
	}
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        //if(num.length < size || size < 1) return new ArrayList<Integer>(); 
    	ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 0; i < num.length; i++){
            while(!queue.isEmpty() && num[queue.peekLast()]<num[i]){
                queue.pollLast();
            }
            queue.addLast(i);
            if(queue.peekFirst() == (i-size)){
                queue.pollFirst();
            }
            if(i>=(size-1)){
                arr.add(num[queue.peekFirst()]);
            }
        }
        return arr;
    }
    
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        int row = 1;
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            TreeNode node = queue.poll();
            if(row % 2 == 0) {
                for(int i = 0; i < size; i++){
                    list.add(node.val);
                    queue.add(pRoot.left);
                    queue.add(pRoot.right);
                }
            }else{
                for(int i = size; i >; i--){
                    list.add(node.val);
                    queue.add(pRoot.left);
                    queue.add(pRoot.right);
                }
            }
            row++;
            res.add(list);
        }
        return res;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
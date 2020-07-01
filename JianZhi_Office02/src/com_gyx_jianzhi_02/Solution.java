package com_gyx_jianzhi_02;
/**
 * 思路：递归思想
 * 前序序列的第一个元素即为根节点，根据根节点的值在中序序列找到根节点的位置假定为i
 * 则根据二叉树前序和中序的规律：
 * 前序序列索引1~i构成子数列为根节点左子树的前序序列，i+1~n1构成子数列为根节点右子树的前序序列（n1为前序序列的长度）；
 * 中序序列索引0~i-1构成子数列为根节点左子树的中序序列，i+1~n1构成子数列为根节点右子树的中序序列（n1为前序序列的长度）；
 * 根节点的左节点为左子树的根节点，根节点的右节点为右子树的根节点
 * 根据这样的规律一直递归下去，直到序列为空。
 * @author 郭蝈
 *
 */
public class Solution {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
		
		return root;
	}

	// 前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
	private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
		System.out.println("startPre:"+startPre);
		System.out.println("startIn:"+startIn);
		System.out.println("endPre:"+endPre);
		System.out.println("endIn:"+endIn);
		System.out.println("------------------");
		if (startPre > endPre || startIn > endIn)
			return null;
		TreeNode root = new TreeNode(pre[startPre]);
		for (int i = startIn; i <= endIn; i++)
			if (in[i] == pre[startPre]) {
				root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1); // 注意pre的位置，要用偏移量，不能用i，因为i是在变化
				root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
			}
		System.out.println("startPre:"+startPre);
		System.out.println("startIn:"+startIn);
		System.out.println("endPre:"+endPre);
		System.out.println("endIn:"+endIn);
		System.out.println("------------------");
		return root;
	}

	public static void main(String[] args) {
		Solution rt = new Solution();
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		TreeNode tr = rt.reConstructBinaryTree(pre, in);
		System.out.println(tr.val);
	}
}

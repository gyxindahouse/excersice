package com_gyx_jianzhi_02;
/**
 * 题目描述：已知中序和前序，请重建二叉树
 * 前序序列：先访问根节点，再访问左子节点，最后访问右子节点。
 * 中序序列：先访问左子节点，再访问根节点，最后访问右子节点。
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
public class reconstructTree01 {
	public TreeNode reconstructBinaryTree(int[] pre, int[] in){
		TreeNode root = new TreeNode(pre[0]);//前序的第一个数一定为根
		int len = pre.length;
		//当只有一个数的时候
		if(len == 1){
			root.left = null;
			root.right = null;
			return root;
		}
		//找到中序的根位置
		int rootval = root.val;
		int i;
		for(i = 0; i < len; i++){
			if(rootval == in[i]){
				break;
			}
		}
		//创建左子树，1~i构成子数列为根节点左子树的前序序列
		if(i>0){
			int[] pr = new int[i];
			int[] ino = new int[i];
			for(int j = 0; j < i; j++){
				pr[j] = pre[j+1];
			}
			for(int j = 0; j < i; j++){
				ino[j] = in[j];
			}
			root.left = reconstructBinaryTree(pr,ino);
		}else{
			root.left = null;
		}
		//创建右子树，i+1~n1构成子数列为根节点右子树的前序序列
		if(len-i-1>0){
			int[] pr = new int[len - i - 1];
			int[] ino = new int[len - i - 1];
			for(int j = i + 1; j < len; j++){
				ino[j - i - 1] = in[j];
				pr[j - i - 1] = pre[j];
			}
			root.right = reconstructBinaryTree(pr, ino);
		}else{
			root.right = null;
		}
		System.out.println(root.val+"-->"+root.right.val);
		return root;
	}
	public static void main(String[] args) {
		reconstructTree01 rt = new reconstructTree01();
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode tr = rt.reconstructBinaryTree(pre, in);
		System.out.println(tr.val);
	}
}

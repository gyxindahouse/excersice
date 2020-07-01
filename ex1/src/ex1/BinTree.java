package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinTree {
	private BinTree lChild;// 左孩子
	private BinTree rChild;// 右孩子
	private BinTree root;// 根节点
	private Object data;// 数据域

	public BinTree() {
	}

	public BinTree(BinTree lChrild, BinTree rChild, Object data) {
		this.lChild = lChrild;
		this.rChild = rChild;
		this.data = data;
	}

	public BinTree(Object data) {
		this(null, null, data);
	}

	public void createTree(Object[] objects) {
		List<BinTree> datas = new ArrayList<>();// 存储所有节点
		for (Object obj : objects) {
			datas.add(new BinTree(obj));
		}
		root = datas.get(0);// 将一个作为根节点
		for (int i = 0; i < objects.length / 2; i++) {
			datas.get(i).lChild = datas.get(2 * i + 1);
			if (2 * i + 2 < objects.length) {// 避免偶数的时候，下标越界
				datas.get(i).rChild = datas.get(2 * i + 2);
			}
		}
	}

	// 先序遍历
	public void preorder(BinTree root) {
		if (root != null) {
			visit(root.getData());
			preorder(root.lChild);
			preorder(root.rChild);
		}
	}

	// 中序遍历
	public void inorder(BinTree root) {
		if (root != null) {
			inorder(root.lChild);
			visit(root.getData());
			inorder(root.rChild);
		}
	}

	public void afterorder(BinTree root) {
		if (root != null) {
			afterorder(root.lChild);
			afterorder(root.rChild);
			visit(root.getData());
		}
	}

	private void visit(Object obj) {
		System.out.print(obj + " ");
	}

	private Object getData() {
		return data;
	}

	private BinTree getRoot() {
		return root;
	}

/*	public List<List<Integer>> levelOrder(BinTree root) {
		List<List<Integer>> res = new ArrayList<>();
		LinkedList<Integer> list = new LinkedList<>();
		if (root == null)
			return new ArrayList<>();
		Queue<BinTree> queue = new LinkedList<>();
		queue.offer(root);
		int row = 1;
		while (!queue.isEmpty()) {
			int count = queue.size();
			for (int i = 0; i < count; i++) {
				BinTree node = queue.poll();
				if (row % 2 == 0) {
					list.addFirst((Integer) node.data);
				} else {
					list.add((Integer) node.data);
				}
				if (node.lChild != null)
					queue.offer(node.lChild);
				if (node.rChild != null)
					queue.offer(node.rChild);
			}
			row++;
			res.add(new LinkedList<>(list));
			list.clear();
		}
		return res;
	}*/

/*	public boolean verifyPostorder(int[] postorder) {
		if (postorder == null || postorder.length == 0)
			return true;
		return process(postorder, 0, postorder.length - 1);
	}

	public boolean process(int[] postorder, int left, int right) {
		if (left >= right)
			return true;
		int i = right - 1;
		while (i >= left && postorder[i] > postorder[right])
			i--;
		for (int k = left; k <= i; k++) {
			if (postorder[k] > postorder[right]) {
				return false;
			}
		}
		return process(postorder, left, i) && process(postorder, i + 1, right - 1);
	}*/

	List<List<Integer>> listAll = new ArrayList<>();
	List<Integer> list = new ArrayList<>();

	public List<List<Integer>> pathSum(BinTree root, int sum) {
		if (root == null)
			return listAll;
		list.add((int)root.data);
		sum -= (int)root.data;

		if (sum == 0 && root.lChild == null && root.rChild == null) {
			listAll.add(new ArrayList<>(list));
		}
		pathSum(root.lChild, sum);
		pathSum(root.rChild, sum);
		list.remove(list.size() - 1);
		// list.clear();
		return listAll;
	}

	public static void main(Solution1[] args) {
		Object[] objs = { 5,4,8,11,null,13,4,7,2,null,null,5,1 };
		BinTree binTree = new BinTree();
		binTree.createTree(objs);
		//System.out.println(binTree.levelOrder(binTree.getRoot()));
		//System.out.println(binTree.verifyPostorder(objs));
		System.out.println(binTree.pathSum(binTree.getRoot(), 22));
		
	}

}

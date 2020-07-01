package cn.gyx.collection;

public class Node {
	Node previous;//上一个节点
	Object element;//下一个节点
	Node next;//元素数据
	
	public Node(Node previous, Object element, Node next) {
		super();
		this.previous = previous;
		this.element = element;
		this.next = next;
	}

	public Node(Object element) {
		super();
		this.element = element;
	}
	
}

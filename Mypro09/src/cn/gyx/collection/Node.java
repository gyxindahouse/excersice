package cn.gyx.collection;

public class Node {
	Node previous;//��һ���ڵ�
	Object element;//��һ���ڵ�
	Node next;//Ԫ������
	
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

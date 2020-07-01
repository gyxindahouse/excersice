package cn.gyx.collection;

/**
 * �Զ���һ������
 * 
 * @author ����
 *
 */
public class SxtLinkedList05<E> {
	private Node first;
	private Node last;
	private int size;

	public void add(int index, E element) {
		checkRange(index);
		Node newNode = new Node(element);
		Node temp = getNode(index);

		if (temp != null) {
			Node up = temp.previous;
			up.next = newNode;
		}
	}

	public void remove(int index) {
		checkRange(index);
		Node temp = getNode(index);

		if (temp != null) {
			Node up = temp.previous;
			Node down = temp.next;
		
			if (up != null) {
				up.next = down;
			}
			if (down != null) {
				down.previous = up;
			}

			// ��ɾ����Ԫ���ǵ�һ��Ԫ��ʱ
			if (index == 0) {
				first = down;
			}

			// ��ɾ����Ԫ�������һ��Ԫ��ʱ
			if (index == size - 1) {
				last = up;
			}
			size--;
		}
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		checkRange(index);
		Node temp = getNode(index);
		return temp != null ? (E) temp.element : null;
	}

	private void checkRange(int index) {
		if (index < 0 || index > size - 1) {
			throw new RuntimeException("�������ֲ��Ϸ���" + index);
		}
	}

	private Node getNode(int index) {
		checkRange(index);
		Node temp = null;
		if (index <= (size >> 1)) {
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			temp = last;
			for (int i = size - 1; i > index; i--) {
				temp = temp.previous;
			}
		}
		return temp;
	}

	public void add(E element) {
		Node node = new Node(element);
		if (first == null) {
			first = node;
			last = node;
		} else {
			node.previous = last;
			node.next = null;
			last.next = node;
			last = node;
		}
		size++;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node temp = first;
		while (temp != null) {
			sb.append(temp.element + ",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length() - 1, ']');
		return sb.toString();
	}

	public static void main(String[] args) {
		SxtLinkedList05<String> list = new SxtLinkedList05<>();
		list.add("a");
		list.add("b");
		System.out.println(list);
		System.out.println(list.get(1));
	}
}

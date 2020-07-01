package ex1;

public class Solution {
	public static void main(Solution1[] args) {
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ln1.next = ln2;
		ln2.next = ln3;

		ListNode ln4 = new ListNode(1);
		ListNode ln5 = new ListNode(3);
		ListNode ln6 = new ListNode(4);
		ln4.next = ln5;
		ln5.next = ln6;
		Solution sl = new Solution();
		System.out.println(sl.mergeTwoLists(ln1, ln4).toString());
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
	

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
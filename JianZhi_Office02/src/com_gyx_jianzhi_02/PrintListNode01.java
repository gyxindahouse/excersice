package com_gyx_jianzhi_02;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述： 
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 思想： 用堆栈实现链表打印，先进后出
 * @author 郭蝈
 *
 */
public class PrintListNode01 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		if(listNode == null){
			ArrayList list = new ArrayList();
			return list;
		}
		Stack<Integer> stk = new Stack<Integer>();
		while(listNode != null){
			stk.push(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(!stk.isEmpty()){
			arr.add(stk.pop());//先进后出
		}
		return arr;
	}
	public static void main(String[] args) {
		PrintListNode01 p = new PrintListNode01();
		ListNode listNode = new ListNode(); //创建一个新的结点A
		listNode.val = 4; //该结点值为4
		listNode.next = new ListNode();  //创建下一个新的结点B!!
		listNode.next.val = 6; //下一个结点的值为6
		listNode.next.next = null; //下一个结点的引用为空
		ArrayList<Integer> list = p.printListFromTailToHead(listNode);
		System.out.println(list);
	}
}


package com_gyx_jianzhi_02;

import java.util.ArrayList;

/**
 * 题目描述： 
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 思想： 递归
 * @author 郭蝈
 *
 */
public class PrintListNode02 {
	public void printListFromBottomToTop(ListNode listNode){
		if(listNode != null){
			if(listNode.next != null){
				printListFromBottomToTop(listNode.next);
			}
		}
		System.out.println(""+listNode.val);
	}
	public static void main(String[] args) {
		PrintListNode02 p = new PrintListNode02();
		ListNode listNode = new ListNode();
		listNode.val = 99;
		listNode.next = new ListNode();
		listNode.next.val = 87;
		listNode.next.next = null;
		p.printListFromBottomToTop(listNode);
	}
}

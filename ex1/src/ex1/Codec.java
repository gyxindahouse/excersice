package ex1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Codec {
	public static void main(String[] args) {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		Codec cd = new Codec();
		int[] arr = cd.maxSlidingWindow(nums, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || k < 1 || nums.length < k) {
			return new int[0];
		}

		int index = 0;
		int[] res = new int[nums.length - k + 1];
		Deque<Integer> queue = new ArrayDeque<>();

		for (int i = 0; i < nums.length; i++) {
			// 在队列不为空的情况下，如果队列尾部的元素要比当前的元素小，或等于当前的元素
			// 那么为了维持从大到小的原则，我必须让尾部元素弹出
			while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {//如果全部小于则全部循环弹出
				queue.pollLast();
			}
			// 不走 while 的话，说明我们正常在队列尾部添加元素
			queue.addLast(i);
			// 如果滑动窗口已经略过了队列中头部的元素，则将头部元素弹出
			if (queue.peekFirst() == (i - k)) {
				queue.pollFirst();
			}
			// 看看窗口有没有形成，只有形成了大小为 k 的窗口，我才能收集窗口内的最大值
			if (i >= (k - 1)) {
				res[index++] = nums[queue.peekFirst()];
			}
		}
		return res;
	}
	
}

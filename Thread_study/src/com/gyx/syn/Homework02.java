package com.gyx.syn;

/**
 * 设计一个多线程的程序如下：设计一个火车售票模拟程序。假如火车站要有100张火车票要卖出， 
 * 现在有5个售票点同时售票，用5个线程模拟这5个售票点的售票情况。
 * 
 * @author 郭蝈
 *
 */
public class Homework02 {
	public static void main(String[] args) {
		TrainStation station = new TrainStation(20);
		new Thread(station, "dl1").start();
		new Thread(station, "dl2").start();
		new Thread(station, "dl3").start();
		new Thread(station, "dl4").start();
		new Thread(station, "dl5").start();

	}
}

// 火车站
class TrainStation implements Runnable {
	int ticketNums;
	boolean hasTicket = true;

	public TrainStation(int ticketNums) {
		this.ticketNums = ticketNums;
	}

	public void run() {
		while (hasTicket) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			orderTicket();
		}
	}

	private void orderTicket() {
		/*if (ticketNums <= 0) {// 考虑没有票的情况
			hasTicket = false;
			return;
		}*/
		synchronized (this) {
			if (ticketNums <= 0) {// 考虑最后一张票的情况!!!
				hasTicket = false;
				return;
			} else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
			}
		}
	}
}
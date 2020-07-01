package com.gyx.syn;

/**
 * 快乐火车票
 * 
 * @author 郭蝈
 *
 */
public class Happy12306 {
	public static void main(String[] args) {
		Web12306 c = new Web12306(4, "happy sxt");
		new Passenger(c, "gyx", 2).start();
		new Passenger(c, "gyx1", 3).start();
	}
}

class Passenger extends Thread {
	int seats;

	public Passenger(Runnable target, String name, int seats) {
		super(target, name);//延续父类构造器
		this.seats = seats;
	}
}

class Web12306 implements Runnable {
	int available;
	String name;

	public Web12306(int available, String name) {
		this.available = available;
		this.name = name;
	}

	@Override
	public void run() {
		Passenger p = (Passenger) Thread.currentThread();
		boolean flag = this.bookTickets(p.seats);
		if (flag) {
			System.out.println("出票成功:" + Thread.currentThread().getName() + "-<位置为：" + p.seats);
		} else {
			System.out.println("出票失败:" + Thread.currentThread().getName() + "位置不够");
		}
	}

	private synchronized boolean bookTickets(int seats) {
		System.out.println("可用位置为：" + available);
		if (seats > available) {
			return false;
		}
		available -= seats;
		return true;
	}
}
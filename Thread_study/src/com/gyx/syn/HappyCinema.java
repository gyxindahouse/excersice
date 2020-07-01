package com.gyx.syn;

import java.util.ArrayList;
import java.util.List;

public class HappyCinema {
	public static void main(String[] args) {
		List<Integer> available = new ArrayList<Integer>();
		available.add(1);
		available.add(2);
		available.add(3);
		available.add(6);
		available.add(7);
		
		
		List<Integer> seats1 = new ArrayList<Integer>();
		seats1.add(1);
		seats1.add(2);
		
		List<Integer> seats2 = new ArrayList<Integer>();
		seats2.add(4);
		seats2.add(5);
		seats2.add(6);
		
		SxtCinema c = new SxtCinema(available,"happy sxt");
		new Thread(new Customer(c, seats1),"gyx").start();
		new Thread(new Customer(c, seats2),"gyx1").start();
	}
	
}

class Customer implements Runnable{
	SxtCinema cinema;
	List<Integer> seats;
	
	public Customer(SxtCinema cinema, List<Integer> seats) {
		super();
		this.cinema = cinema;
		this.seats = seats;
	}

	@Override
	public void run() {
		synchronized (cinema) {
			boolean flag = cinema.bookTickets(seats);
			if(flag){
				System.out.println("出票成功："+Thread.currentThread().getName()+"位置为"+seats);
			}else{
				System.out.println("出票失败："+Thread.currentThread().getName()+"位置不够");
			}
		}
	}
}
class SxtCinema{
	List<Integer> available;
	String name;
	
	public SxtCinema(List<Integer> available, String name) {
		super();
		this.available = available;
		this.name = name;
	}

	public boolean bookTickets(List<Integer> seats){
		System.out.println("可用位置为："+available);
		List<Integer> copy = new ArrayList<Integer>();
		copy.addAll(available);
		copy.removeAll(seats);
		if(available.size()-copy.size()!=seats.size()){
			return false;
		}
		available = copy;
		return true;
		
	}
}
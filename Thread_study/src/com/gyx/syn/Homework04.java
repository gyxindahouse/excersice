package com.gyx.syn;
/**
 * 编写多线程程序，模拟多个人通过一个山洞的模拟。这个山洞每次只能通过一个人，
 * 每个人通过山洞的时间为5秒，有10个人同时准备过此山洞，显示每次通过山洞人的姓名和顺序。
 * @author 郭蝈
 *
 */
public class Homework04{
	public static void main(String[] args) {
		Cave c = new Cave();
		new Thread(c,"gyx1").start(); 
		new Thread(c,"gyx2").start(); 
		new Thread(c,"gyx3").start(); 
		new Thread(c,"gyx4").start(); 
		new Thread(c,"gyx5").start(); 
		 
	}
}
class Cave implements Runnable{
	private int count = 1;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+"正在第"+ count++ +"个过山洞");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
/*public class Homework04 {
	public static void main(String[] args) {
		new Thread(new Hole(new Climber("gyx1", 1))).start(); 
		new Thread(new Hole(new Climber("gyx2", 2))).start(); 
		new Thread(new Hole(new Climber("gyx3", 3))).start(); 
		new Thread(new Hole(new Climber("gyx4", 4))).start(); 
		new Thread(new Hole(new Climber("gyx5", 5))).start(); 
	}
}
class Hole implements Runnable{
	Climber c;

	public Hole(Climber c) {
		super();
		this.c = c;
	}
	@Override
	public void run() {
		synchronized(this){
		System.out.println("攀登者"+c.getName()+"----"+c.getIndex()+"号----->正在通过,请等候");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
class Climber implements Runnable{
	String name;
	int index;
	public Climber(String name, int index) {
		super();
		this.name = name;
		this.index = index;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	@Override
	public void run() {
		synchronized (this) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notify();
		}
	}
}*/
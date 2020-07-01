package com.gyx.syn;
/**
 * 多线程操作同一个对象（未使用线程同步）
 * @author Administrator
 *
 */
public class Unsafe01 {
	public static void main(String[] args) {
		Account a1 = new Account(100, "gyx");
		Drawing draw1 = new Drawing(80, a1, "gyx1");
		Drawing draw2 = new Drawing(80, a1, "gyx2");
		draw1.start();
		draw2.start();
	}
}

class Account {
	int money;
	String aname;

	public Account(int money, String aname) {
		super();
		this.money = money;
		this.aname = aname;
	}
}

/**
 * 模拟提款操作
 */
class Drawing extends Thread {
	int drawingNum;
	Account account;
	int expenseTotal;

	public Drawing(int drawingNum, Account account, String name) {
		super(name);
		this.drawingNum = drawingNum;
		this.account = account;
	}

	@Override
	public void run() {
		draw();
	}
//同步块和同步方法的区别
	void draw() {
		synchronized (account) {
			if (account.money - drawingNum < 0) {
				System.out.println(this.getName()+"取款，余额不足！");
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.money -= drawingNum;
			expenseTotal += drawingNum;
			System.out.println(this.getName() + "--账户余额：" + account.money);
			System.out.println(this.getName() + "--总共取了：" + expenseTotal);
		}
	}
}
	
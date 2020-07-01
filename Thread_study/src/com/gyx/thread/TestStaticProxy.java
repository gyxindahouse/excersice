package com.gyx.thread;
/**
 * 测试静态代理
 * @author 郭蝈
 *
 */
public class TestStaticProxy {
	public static void main(String[] args) {
		Marry you = new You();
		WeddingCompany company = new WeddingCompany(you);
		company.marry();
	}
}
interface Marry{
	public abstract void marry();
}
class You implements Marry{

	@Override
	public void marry() {
		System.out.println("you and xxx...");
	}
}
class WeddingCompany implements Marry{
	private Marry you;
	public WeddingCompany(){
	}
	public WeddingCompany(Marry you) {
		super();
		this.you = you;
	}
	
	private void before(){
		System.out.println("before...");
	}
	private void after(){
		System.out.println("after....");
	}
	public void marry(){
		before();
		you.marry();
		after();
	}
}
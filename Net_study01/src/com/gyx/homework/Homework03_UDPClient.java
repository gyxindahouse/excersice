package com.gyx.homework;

/**
 * 使用基于UDP的Java Socket编程，完成在线咨询功能：
    1) 客户向咨询人员咨询。
    2) 咨询人员给出回答。
    3) 客户和咨询人员可以一直沟通，直到客户发送bye给咨询人员。
 * @author Administrator
 *
 */
public class Homework03_UDPClient {
	public static void main(String[] args) {
		new Thread(new UDP_Send(7777, "localhost", 9999)).start();//发送
		new Thread(new UDP_Receive("服务器端", 8888)).start();//接收
	}
}

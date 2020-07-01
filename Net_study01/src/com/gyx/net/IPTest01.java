package com.gyx.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP：定位一个节点：计算机、路由、通信设备
 * {@link InetAddress}：多个静态方法
 * 
 * 1、getLocalHost：本机
 * 2、getByName：根据域名DNS IP地址---》IP
 * 
 * 两个成员
 * 1、getHostAddress：返回地址
 * 2、getHostName：返回计算机
 * @author 郭蝈
 *
 */
public class IPTest01 {
	public static void main(String[] args) throws UnknownHostException {
		//使用getlocalHost方法创建InetAddreass对象本机
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());//返回：192.168.1.110
		System.out.println(addr.getHostName());//输出计算机名
		
		//根据域名得到netAddress对象
		addr = InetAddress.getByName("www.163.com");
		System.out.println(addr.getHostAddress());//返回163服务器的ip
		System.out.println(addr.getHostName());//输出www.163.com
		
		//根据ip得到inetAddress对象
		addr = InetAddress.getByName("61.135.253.15");
		System.out.println(addr.getHostAddress());//返回163服务器的ip：61....
		System.out.println(addr.getHostName());//输出ip而不是域名，如果这个ip地址不存在或DNS服务器不允许进行IP地址和域名映射是，则返回Ip地址
	}
}

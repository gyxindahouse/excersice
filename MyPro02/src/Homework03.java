/**
 * 编写递归算法程序：一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求数列的第40位数是多少。
 * 
 * @author 郭蝈
 *
 */

//public class Homework03 {
//	public static void main(String[] args) {
//		Homework03 hm = new Homework03();
//		int num = hm.fun(0, 1);
//		System.out.print("第40位数是： " + num);
//	}
//
//	static int fun(int j1, int j2) {
//		int count = 0;
//		if (count > 40) {
//			return j1;
//		} 
//		int sum = j1 + j2;
//		count += 2;
//		return fun(j2, sum);
//	}
//}


public class Homework03 {
	public static void main(String[] args) {
		int before = 0;
		int now = 1;
		
		Recursion recursion = new Recursion();
		System.out.println("第40个数是： " + recursion.Recursion(before, now));
	}
}
class Recursion{
	int i =1;
	int Recursion(int before, int now){
		if(i > 40){
			return before;
		}
		now += before;
		before = now - before;
		i++;
		return Recursion(before, now);
	}
}



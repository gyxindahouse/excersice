package cn.gyx.exception;

import java.util.Scanner;

/**
 * 写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形，
 * 如果不能则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，
 * 如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个整数， 调用此方法，并捕获异常。
 * @author 郭蝈
 *
 */
public class TestHomework02 {
	public static void main(String[] args) {
		int a[] = new int[3];
		System.out.print("请输入三遍长：");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			a[i] = input.nextInt();
		}
		boolean flag = false;
		try {
			if ((a[0] + a[1] <= a[2]) || (a[2] + a[1] <= a[0]) || (a[0] + a[2] <= a[1])) {
				throw new Exception("a,b,c不能构成三角形");
			}
			flag = true;
		} catch (IllegalArgumentException e) {
			System.out.print("IllegalArgumentException");
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		if (flag) {
			System.out.printf("三角形三边长分别为：%d, %d, %d", a[0], a[1], a[2]);
		}
	}
}

/*class  IllegalArgumentException extends Exception {
    void IllegalArgumentException(int a,int b, int c){
        System.out.printf("\n%d,%d,%d不能构成三角形",a,b,c);
    }
}
 
 class isTriangle {
     void isTriangle(int a, int b, int c) throws IllegalArgumentException {
         int max = Math.max(Math.max(a, b), c);
         int min = Math.min(Math.min(a, b), c);
         int sum = a + b + c;
         int twoEdgeDec = sum - max - min - min;     //较小的两边之差
         int twoEdgeAdd = sum - max;                //较小的两边之和
 
         //两边之和小于第三边,两边之差大于第三边
         if (max >= twoEdgeAdd || min <= twoEdgeDec)
             throw new IllegalArgumentException();
         else System.out.printf("可以构成三角形");
     }
 }
 
public class TestHomework02{
    public static void main(String[] args) {
        int a[] = new int[3];
        Scanner input = new Scanner(System.in);
 
        System.out.print("请输入三角形三边:");
        for(int i = 0;i < 3; i++){
            a[i] = input.nextInt();
        }
        System.out.print("三边:");
        for(int i : a){
            System.out.printf("\t%d",i);
        }
        isTriangle isTriangle = new isTriangle();
        try{
            isTriangle.isTriangle(a[0],a[1],a[2]);
        }
        catch (IllegalArgumentException e){
            e.IllegalArgumentException(a[0],a[1],a[2]);
        }
    }
}*/


package cn.gyx.exception;

import java.util.Scanner;

/**
 * дһ������void isTriangle(int a,int b,int c)���ж����������Ƿ��ܹ���һ�������Σ�
 * ����������׳��쳣IllegalArgumentException����ʾ�쳣��Ϣ ��a,b,c���ܹ��������Ρ���
 * ������Թ�������ʾ�����������߳������������еõ���������������������� ���ô˷������������쳣��
 * @author ����
 *
 */
public class TestHomework02 {
	public static void main(String[] args) {
		int a[] = new int[3];
		System.out.print("���������鳤��");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			a[i] = input.nextInt();
		}
		boolean flag = false;
		try {
			if ((a[0] + a[1] <= a[2]) || (a[2] + a[1] <= a[0]) || (a[0] + a[2] <= a[1])) {
				throw new Exception("a,b,c���ܹ���������");
			}
			flag = true;
		} catch (IllegalArgumentException e) {
			System.out.print("IllegalArgumentException");
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		if (flag) {
			System.out.printf("���������߳��ֱ�Ϊ��%d, %d, %d", a[0], a[1], a[2]);
		}
	}
}

/*class  IllegalArgumentException extends Exception {
    void IllegalArgumentException(int a,int b, int c){
        System.out.printf("\n%d,%d,%d���ܹ���������",a,b,c);
    }
}
 
 class isTriangle {
     void isTriangle(int a, int b, int c) throws IllegalArgumentException {
         int max = Math.max(Math.max(a, b), c);
         int min = Math.min(Math.min(a, b), c);
         int sum = a + b + c;
         int twoEdgeDec = sum - max - min - min;     //��С������֮��
         int twoEdgeAdd = sum - max;                //��С������֮��
 
         //����֮��С�ڵ�����,����֮����ڵ�����
         if (max >= twoEdgeAdd || min <= twoEdgeDec)
             throw new IllegalArgumentException();
         else System.out.printf("���Թ���������");
     }
 }
 
public class TestHomework02{
    public static void main(String[] args) {
        int a[] = new int[3];
        Scanner input = new Scanner(System.in);
 
        System.out.print("����������������:");
        for(int i = 0;i < 3; i++){
            a[i] = input.nextInt();
        }
        System.out.print("����:");
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


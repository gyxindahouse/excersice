package cn.gyx.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestHomework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������֣�");
		try{
			int num=input.nextInt();
			if(num<1 || num>4){
				throw new Exception("������1-4֮��");
			}
		}catch(InputMismatchException e){
			System.out.print("inputmismatchexception");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
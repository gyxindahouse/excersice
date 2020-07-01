
/**
 * 第三章作业十进制转化为二进制数
 * @author 郭蝈
 *
 */
import java.util.Scanner;

public class Test10to2 {
	public static void main(String[] args) {
			int decimal;
			String sbinary;
			int binary;
			
			Scanner input = new Scanner(System.in);
			System.out.print("请输入一个整数: ");
			decimal = input.nextInt();
			sbinary = Integer.toBinaryString(decimal);
			System.out.println(sbinary);
			binary = Integer.parseInt(sbinary);//将string转化为int
			System.out.print("二进制数为： " + binary);
	}
}

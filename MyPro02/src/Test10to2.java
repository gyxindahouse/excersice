
/**
 * ��������ҵʮ����ת��Ϊ��������
 * @author ����
 *
 */
import java.util.Scanner;

public class Test10to2 {
	public static void main(String[] args) {
			int decimal;
			String sbinary;
			int binary;
			
			Scanner input = new Scanner(System.in);
			System.out.print("������һ������: ");
			decimal = input.nextInt();
			sbinary = Integer.toBinaryString(decimal);
			System.out.println(sbinary);
			binary = Integer.parseInt(sbinary);//��stringת��Ϊint
			System.out.print("��������Ϊ�� " + binary);
	}
}

import java.util.Scanner;

/**
 * �����������
 * @author ����
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������֣�");
		String name = scanner.nextLine();
		System.out.println("��������İ��ã�");
		String favour = scanner.nextLine();
		System.out.println("������������䣺");
		int age = scanner.nextInt();
		
		System.out.println("#############");
		System.out.println(name);
		System.out.println(favour);
		System.out.println("���������������"+ age*365);
	}
}

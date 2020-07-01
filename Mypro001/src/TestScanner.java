import java.util.Scanner;

/**
 * 测试输入程序
 * @author 郭蝈
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名字：");
		String name = scanner.nextLine();
		System.out.println("请输入你的爱好：");
		String favour = scanner.nextLine();
		System.out.println("请输入你的年龄：");
		int age = scanner.nextInt();
		
		System.out.println("#############");
		System.out.println(name);
		System.out.println(favour);
		System.out.println("来到地球的天数："+ age*365);
	}
}

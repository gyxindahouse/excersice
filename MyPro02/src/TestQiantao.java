/**
 * 测试循环嵌套
 * 
 * @author 郭蝈
 *
 */
public class TestQiantao {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}

		System.out.println("######################################");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");

			}
			System.out.println();
		}
		/*
		 * for (int i = 1; i < 10; i++) { // i是一个乘数 for (int j = 1; j <= i; j++)
		 * { // j是另一个乘数 System.out.print(j + "*" + i + "=" + (i * j < 10 ? (" "
		 * + i * j) : i * j) + "  "); } System.out.println();
		 */
		System.out.println("##################################################");
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);

		System.out.println("########################################################");
			for (int i = 1,j=1; i <= 1000; i++) {
				if (i % 5 == 0) {
					System.out.print(i + "\t");
					j++;
				}
				
				if (j % 5 == 0) {
					System.out.println();
					j = 1;
				}
			}
		}
	}


/**
 * ��������ṹ
 * @author ����
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//ͨ����������ձ鷽��
		TestMethod tm = new TestMethod();
		int c = tm.add(0, 1, 2)+1000;
		System.out.println(c);
	}
	int add(int a, int b, int c){
		int sum = a + b + c;
		System.out.println(sum);
		return sum;//return���������ã�1���������������У�2������ֵ
	}
}

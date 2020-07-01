/**
 * 测试语句块结构
 * @author 郭蝈
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//通过对象调用普遍方法
		TestMethod tm = new TestMethod();
		int c = tm.add(0, 1, 2)+1000;
		System.out.println(c);
	}
	int add(int a, int b, int c){
		int sum = a + b + c;
		System.out.println(sum);
		return sum;//return的两个作用：1、结束方法的运行，2、返回值
	}
}

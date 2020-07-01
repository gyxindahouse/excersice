package cn.gyc.shuzu;
/**
 * 测试数组
 * @author 郭蝈
 *
 */
/*public class Test {
	public static void main(String[] args) {
		int[] s = null;//声明数组
		s = new int[10];//给数组分配空间
		for(int i = 0; i < 10; i++){
			s[i] = 2*i + 1;//给数组元素赋值
			System.out.println(s[i]);
		}
	}
}*/
class Man{
	private int age;
	private int id;
	public Man(int id,int age){
		super();
		this.age = age;
		this.id = id;
	}
}
public class AppMain{
	public static void main(String[] args) {
		Man[] mans;//声明引用类型数组
		mans = new Man[10];//给引用类型数组分配空间
		
		Man m1 = new Man(1,11);
		Man m2 = new Man(2, 22);
		
		mans[0] = m1;//给引用类型数组元素赋值
		mans[1] = m2;
		for(int i=0; i<= mans.length;i++){
			System.out.println(mans[i]);
		}
	}
}
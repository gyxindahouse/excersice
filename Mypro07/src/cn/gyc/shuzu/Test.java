package cn.gyc.shuzu;
/**
 * 使用循环遍历初始化和读取数组
 * @author 郭蝈
 *
 */
public class Test {
	public static void main(String[] args) {
		int[] a = new int[4];
		//初始化数组元素的值
		for(int i=0; i<a.length; i++){
			a[i] = 100*i;
		}
		//读取元素的值
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}

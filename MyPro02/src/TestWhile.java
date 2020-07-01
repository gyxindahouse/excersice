/**
 * 测试while循环体
 * @author 郭蝈
 *
 */
public class TestWhile {
	public static void main(String[] args) {
		//计算1+2+3+。。。+100的累加和，5050
		int i = 1;
		int sum = 0;
		
		while(i<=100){
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
	}
}

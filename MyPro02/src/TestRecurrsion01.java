/**
 * ���Եݹ�
 * @author ����
 *
 */
public class TestRecurrsion01 {
	public static void main(String[] args) {
		long d1 = System.currentTimeMillis();
		System.out.printf("%d�׳˵Ľ����%s%n", 10, factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("�ݹ��ʱ��%s%n", d2 - d1);
	
		long d3 = System.currentTimeMillis();
		int a =10;
		int result = 1;
		while(a>1){
			result *= a*(a-1);
			a -=2;
		}
		long d4 = System.currentTimeMillis();
		System.out.println(result);
		System.out.printf("��ͨѭ����ʱ��%s%n", d4-d3);
	}
	/*��׳˵ķ���*/
	static long factorial(int n){
		if(n == 1){//�ݹ�ͷ
			return 1;
		}else{//�ݹ���
			return n*factorial(n-1);//n!=n*(n-1)
		}
	}
}

/**
 * ���Դ���ǩ��break��continue
 * @author ����
 *
 */
public class TestLabelContinue {
	public static void main(String[] args) {
		outer: for(int i=101; i<150; i++){
			for(int j=2; j<i/2; j++){//ֻ��ѭ����һ�뼴�� �������޷�����
				if(i%j==0){
					continue outer;
				}
			}
			System.out.print(i + " ");
		}
	}
}

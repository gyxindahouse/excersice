/**
 * ��������ҵ
 * @author ����
 *
 */
public class Homework {
	public static void main(String args[]) {
        int i = 99;
        mb_operate(i);
        System.out.print(i + 100);
    }
    static void mb_operate(int i) {
         i += 1000000;
    }
    /*
     *     �Ǿ�̬����,�ββ���Ӱ��ʵ��
     *    static int mb_operate(int i) {
        	return i += 1000000;
    	  }
     */
}

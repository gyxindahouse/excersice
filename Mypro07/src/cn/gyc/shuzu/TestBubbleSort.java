package cn.gyc.shuzu;

import java.util.Arrays;

/**
 * ����ð������
 * @author ����
 *
 */
public class TestBubbleSort {
	public static void main(String[] args) {
		int[] values = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8};
		bubblesort(values);
		//System.out.println(Arrays.toString(values));
	}
	public static void bubblesort(int[] values){
		int temp;
		int i;
		// ���ѭ����n��Ԫ��������������Ҫn-1��ѭ��
		for(i = 0; i < values.length - 1; i++){
			// ����һ���������͵ı�������������Ƿ��Ѵﵽ����״̬
			boolean flag = true;
			/*�ڲ�ѭ����ÿһ��ѭ���������е�ǰ����Ԫ�ؿ�ʼ���бȽϣ��Ƚϵ�������������*/
			for(int j = 0; j < values.length - 1 - i; j++){
				if(values[j] > values[j+1]){
					temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
					 //���˷����˽����������������ڱ��˴�������״̬����Ҫ�����Ƚϣ�
					flag = false;
				}
				System.out.println(Arrays.toString(values));
			}
			 //���ݱ������ֵ�ж������Ƿ���������������˳������������ѭ����
			if(flag){
				System.out.println("�����ˣ�������");
				break;
			}
			System.out.println("##############################");
		}
	}
}

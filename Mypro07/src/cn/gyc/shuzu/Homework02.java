package cn.gyc.shuzu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��ȡ�������ֵ����Сֵ����������Java��Math���random()��������д�����õ�0��n֮����������n�ǲ�����
 * ���ҳ�����50������������������ġ���С��������ͳ������>=60���ж��ٸ��� ��ʾ��ʹ�� int
 * num=(int)(n*Math.random());��ȡ�����
 * 
 * @author ����
 *
 */

/*�ҵİ汾
public class Homework02 {
	public static void main(String[] args) {
		System.out.print("������n��ֵ(n<100)�� ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[100];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (n * Math.random());
			if(arr[i] >= 60){
				cnt++;
			}
		}
		System.out.println(Arrays.toString(arr));
		Sort(arr);
		System.out.println("���ڵ���60��������Ϊ�� "+cnt);
		System.out.println("min num = "+arr[0]);
		System.out.println("max num = "+arr[arr.length-1]);
	}
	 public static int[] Sort(int[] arr){
		int temp = 0;
		boolean flag = true;
		for(int j=0; j < arr.length-1; j++){
			for(int i=0; i < arr.length-1-j; i++){
				if(arr[i] > arr[i+1]){
					temp = arr[i];
					arr[i] = arr [i+1];
					arr[i+1] = temp;
					flag = false;
				}
				if(flag){
					break;
				}
			}
		}
		return arr;
	}
}
*/

//��
public class Homework02 {
	public static void main(String[] args) {
		int[] neednumbers=getNum(50);
		System.out.println("�������Ϊ��"+Arrays.toString(neednumbers));
		System.out.println("ð������������Ϊ��"+Arrays.toString(bubbleSort(neednumbers)));
		System.out.println("��С����Ϊ��"+neednumbers[0]+"\n��С����Ϊ��"+neednumbers[49]);
		System.out.println("����60��������Ϊ��"+numSearch(neednumbers,60));
	}
	public static int[] getNum(int num) { //��ȡһ���������
		int[] numbers=new int[num];
		for(int a=0;a<num;a++) {
			int b=(int)(num*Math.random());
			numbers[a]=b;
		}
		return numbers;
	}	
	
	public static int[] bubbleSort(int[] numbers) {
		for(int x=0;x<numbers.length;x++) {  //����ð��������λΪ��С����ĩλΪ����� 
					for(int y=0;y<numbers.length-1-x;y++) {
						if(numbers[y]>numbers[y+1]) {
							int z=numbers[y];
							numbers[y]=numbers[y+1];
							numbers[y+1]=z;	
						}
						
					}
									
				}
		return numbers;
	}
	
	public static int numSearch(int[] numbers,int num) {
		int count=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>=num) {
				count+=1;
			}
		}
		return count;
	}
}


package cn.gyx.baozhuang;
/**
 * ���ݽ�ͨ�źŵ���ɫ��������ͣ������ʻ������(��ʾ��ʹ��ö��ʵ��)
 * @author ����
 *
 */
public class Homework03 {
	public static void main(String[] args) {
		int random = (int)(3*Math.random());
		//System.out.print(random);
		switch(TrafficLights.values()[random]){
		case RED:
			System.out.println("STOP");
			break;
		case GREEN:
			System.out.println("GO");
			break;
		case YELLOW:
			System.out.println("WAIT");
			break;
		}
	}
}
enum TrafficLights{
	RED, GREEN, YELLOW;
}
package cn.gyx.baozhuang;
/**
 * 根据交通信号灯颜色决定汽车停车、行驶和慢行(提示：使用枚举实现)
 * @author 郭蝈
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
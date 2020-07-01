/**
 * 测试switch语句
 * @author 郭蝈
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
		int month = (int)(1+12*Math.random());
		System.out.println("月份："+ month);
		
		switch(month){
		case 1:
			System.out.println("一月份！过年啦！");
			break;
		case 2:
			System.out.println("二月份！开春了");
			break;
		default:
			System.out.println("我是其他月份！");
			break;
		}
	}
}

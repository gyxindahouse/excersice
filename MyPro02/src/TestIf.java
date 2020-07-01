/**
 * 测试if单选择结构
 * @author 郭蝈
 *
 */
public class TestIf {
	public static void main(String[] args) {
		double d = Math.random(); //返回【0，1】之间的随机数
		System.out.println(d);
		
		int h = (int)(6*Math.random()+1);
		System.out.println(h);
		if(h<=3){
			System.out.println("小");
			System.out.println("小小小");
		}
		System.out.println("#######################");
		//通过掷三个骰子看看今天的手气如何？
		int i = (int)(6 * Math.random()) + 1;//通过math。random产生随机数
		int j = (int)(6 * Math.random()) + 1;
		int k = (int)(6 * Math.random()) + 1;
		int count = i + j + k;
		System.out.println("count=" + count);
		//如果两个骰子之和大于15，则手气不错
		if(count > 15){
			System.out.println("今天手气不错");
		}
		//如果三个骰子之和在10和15之间则手气一般
		if(count >= 10 && count <= 15){//错误写法：10 <= count <= 15
			System.out.println("今天手气很一般");
		}
		//如果三个骰子之和小于10，则手气不怎样
		if(count < 10){
			System.out.println("今天手气不怎么样");
		}
	}
}

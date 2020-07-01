/**
 * 测试带标签的break和continue
 * @author 郭蝈
 *
 */
public class TestLabelContinue {
	public static void main(String[] args) {
		outer: for(int i=101; i<150; i++){
			for(int j=2; j<i/2; j++){//只需循环到一半即可 超过则无法整除
				if(i%j==0){
					continue outer;
				}
			}
			System.out.print(i + " ");
		}
	}
}

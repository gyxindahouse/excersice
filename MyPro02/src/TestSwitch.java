/**
 * ����switch���
 * @author ����
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
		int month = (int)(1+12*Math.random());
		System.out.println("�·ݣ�"+ month);
		
		switch(month){
		case 1:
			System.out.println("һ�·ݣ���������");
			break;
		case 2:
			System.out.println("���·ݣ�������");
			break;
		default:
			System.out.println("���������·ݣ�");
			break;
		}
	}
}

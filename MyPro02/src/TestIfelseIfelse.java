/**
 * ����ifelseifelse��ѡ��ṹ
 * @author ����
 *
 */
public class TestIfelseIfelse {
	public static void main(String[] args) {
		int age = (int)(100*Math.random());
		System.out.println("������"+ age + "������");
		if (age<15){
			System.out.println("��ͯ��ϲ���棡");
		}else if(age < 25){
			System.out.println("���꣬Ҫѧϰ��");
		}else if(age < 45){
			System.out.println("���꣬Ҫ������");
		}else if(age < 65){
			System.out.println("�����꣬Ҫ���ƣ�");
		}else if(age < 85){
			System.out.println("���꣬���˶���");
		}else{
			System.out.println("�����ǣ�����ϡ��");
		}
	}
}

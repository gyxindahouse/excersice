/**
 * ���췽��������
 * @author ����
 *
 */
public class User {
	int id; //id
	String name; //�˻���
	String pwd; //����
	public User(){
		
	}
	public User(int id, String name){
		super();
		this.id = id;//��Ҫʹ��this�ؼ��������������β�
		this.name = name;
	}
	public User(int id, String name, String pwd){
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(101, "guoguo");
		User u3 = new User(100, "guoguo", "123456");
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
	}
}

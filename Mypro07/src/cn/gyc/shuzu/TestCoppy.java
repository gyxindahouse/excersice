package cn.gyc.shuzu;

public class TestCoppy {
	public static void main(String[] args) {
		String[] s = {"����","��ѧ��","����","�Ѻ�","����"};
		//String[] sBak = new String[6];
		System.arraycopy(s, 2, s, 1, 3);
		s[s.length - 1] = null;
		for(int i = 0; i < s.length; i++){
			System.out.print(s[i]+"\t");
		}
	}
}
//�����ɾ�������������鿽��

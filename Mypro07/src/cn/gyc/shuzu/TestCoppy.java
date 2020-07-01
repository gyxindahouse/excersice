package cn.gyc.shuzu;

public class TestCoppy {
	public static void main(String[] args) {
		String[] s = {"阿里","尚学堂","京东","搜狐","网易"};
		//String[] sBak = new String[6];
		System.arraycopy(s, 2, s, 1, 3);
		s[s.length - 1] = null;
		for(int i = 0; i < s.length; i++){
			System.out.print(s[i]+"\t");
		}
	}
}
//数组的删除本质上是数组拷贝

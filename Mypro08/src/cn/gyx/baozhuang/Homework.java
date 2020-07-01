package cn.gyx.baozhuang;

public class Homework {
	public static void main(String[ ] args) {
	     String s1 = new String("bjsxt");
	        String s2 = new String("bjsxt");
	        if (s1 == s2)            
	             System.out.println("s1 == s2");
	        if (s1.equals(s2))        
	             System.out.println("s1.equals(s2)");
	    }
	}

/*String类的对象是final型,不能被修改。concat方法是生成一个新的字符串，不是修改原字符串*/
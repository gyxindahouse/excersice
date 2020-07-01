package ex1;

import java.util.ArrayList;

public class Solution1 {
	public static void main(String[] args) {
		String res = "abc";
		Solution1 sl = new Solution1();
		String[] str = sl.permutation(res);
		for(int i=0;i<str.length;i++){
		    System.out.println(str[i].toString());
		}
	}
	ArrayList<String> res = new ArrayList<>();
    public String[] permutation(String s) {
        char[] ch = s.toCharArray();
        dfs(ch,0);
        String[] str = new String[res.size()];
        if(s == null || s.length() == 0) return str;
        for(int i = 0; i < res.size(); i++) {
            str[i] = res.get(i);
        } 
        return str;
    }
    private void dfs(char[] ch, int start) {
        if(start == ch.length) {
            res.add(new String(ch));
            return;
        }
        boolean[] used = new boolean[256];
        for(int i = start; i < ch.length; i++) {
            if(used[ch[i]]) continue;
            used[ch[i]] = true;
            swap(ch,start,i);
            dfs(ch,start+1);
            swap(ch,start,i);
        } 
    }
    private void swap(char[] ch, int i, int j) {
        char tmp = ch[i];
        ch[i] = ch[j];
        ch[j] = tmp;
    }
}

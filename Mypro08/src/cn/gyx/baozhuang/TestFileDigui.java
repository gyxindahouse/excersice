package cn.gyx.baozhuang;

import java.io.File;

public class TestFileDigui {
	public static void main(String[] args) {
		File f = new File("e:/�����Ķ�");
		printFile(f, 0);
	}

	private static void printFile(File f, int level) {
		//�����������
		for(int i=0; i<level; i++){
			System.out.print("-");
		}
		//����ļ���
		System.out.println(f.getName());
		//���f��Ŀ¼�����ȡ���ļ��б�����ÿ�����ļ�������ͬ����
		if(f.isDirectory()){
			File[] files = f.listFiles();
			for(File temp:files){
				//�ݹ���ø÷�����ע���+1
				printFile(temp, level+1);
			}
		}
	}
}

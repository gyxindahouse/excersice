package cn.gyx.baozhuang;

import java.io.File;
import java.io.IOException;

public class TestFile01 {
	public static void main(String[] args) {
		//ָ��һ���ļ�
		File file = new File("d:/sxt/b.txt");
		//�ж��ļ��Ƿ����
		boolean flag = file.exists();
		//������ھ�ɾ�����������ھʹ���
		if(flag){
			//ɾ��
			boolean flagd = file.delete();
			if(flagd){
				System.out.println("ɾ���ɹ�");
			}else{
				System.out.println("ɾ��ʧ��");
			}
		}else{
			//����
			boolean flagn = true;
			try{
				//���Ŀ¼�����ڣ��ȴ���Ŀ¼
				File dir = file.getParentFile();
				dir.mkdirs();
				//�����ļ�
				flagn = file.createNewFile();
				System.out.println("�����ɹ�");
			}catch(IOException e){
				System.out.println("����ʧ��");
				e.printStackTrace();//e.printStackTrace();�Ǵ�ӡ�쳣�Ķ�ջ��Ϣ��ָ������ԭ��
				/*try catch �ǲ�׽try���ֵ��쳣������û��trycatch��ʱ����������쳣����򱨴�
				 * ����trycatch�������쳣�����������У�ֻ�ǰѴ�����Ϣ�洢��Exception�
				 * ����catch��������ȡ�쳣��Ϣ�ģ��������Catch���ּ���һ��System.out.println(e.ToString());����������쳣���԰��쳣��ӡ����*/
			}
		}
	}
}

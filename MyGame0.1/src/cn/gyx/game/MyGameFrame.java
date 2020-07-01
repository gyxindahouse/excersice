package cn.gyx.game;

import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * ���ڳ�ʼ��
 * 
 * @author ����
 *
 */
public class MyGameFrame extends JFrame {
	// ������ͼƬ��ɻ�ͼƬ����Ϊ��Ա����
	Image bgImg = GameUtil.getImage("images/bg.jpg");
	Image planeImg = GameUtil.getImage("images/plane.png");
	
	Plane plane = new Plane(planeImg, 300, 300, 9);
	
	ArrayList<Shell> shellList = new ArrayList<Shell>();//�������ú���������
	
	Explode bao;
	
	Date startTime = new Date(); 
	Date endTime;
	//paint������������:�����������ڼ��ڲ����ݣ���ϵͳ�Զ�����
	@Override
	public void paint(Graphics g){
		g.drawImage(bgImg, 0, 0, null);
		plane.drawMySelf(g);//�����ɻ�����

		//�������������е��ӵ�
		for(int i=0; i<shellList.size(); i++){
			Shell b = shellList.get(i);
			b.draw(g);
			
			//�ɻ��������ڵ�������о��μ��
			boolean peng = b.getRect().intersects(plane.getRect());
			if(peng){
				plane.live = false; //�ɻ�����,���治��ʾ
				endTime = new Date();
				if(bao == null){
					 bao = new Explode(plane.x, plane.y);
				}
				bao.draw(g);
			}
		}
		if(!plane.live){
			if(endTime == null){
				endTime = new Date();
			}
			int period = (int)((endTime.getTime()-startTime.getTime())/1000);
			printInfo(g, "time: "+period+"s", 50, 120, 260, Color.white);
		}
	}
	 /**
     * �ڴ����ϴ�ӡ��Ϣ
     * @param g
     * @param str
     * @param size
     */
	private void printInfo(Graphics g, String str, int size, int x, int y, Color color) {
		// TODO Auto-generated method stub
		Color c = g.getColor();
		g.setColor(color);
		Font f = new Font("����", Font.BOLD, size);
		g.setFont(f);
		g.drawString(str, x, y);
		g.setColor(c);
	}

	/**
	 * ����һ���ػ����ڵ��߳��࣬��һ���ڲ���
	 */
	class PaintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try{
					Thread.sleep(40);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
	//����Ϊ�ڲ��࣬���Է����ʹ���ⲿ�����ͨ����,���Ӽ��̼�������
	class KeyMonitor extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e){
			plane.addDirection(e);
		}
		@Override
		public void keyReleased(KeyEvent e){
			plane.minusDirection(e);
		}
	}
	
	public void launchFrame() {
		// ����Ϸ���ڴ�ӡ����
		setTitle("��ѧ��ѧԱ��������Ʒ");
		// ����Ĭ�ϲ��ɼ�����Ϊ�ɼ�
		setVisible(true);
		setSize(Constant.game_height, Constant.game_width);
		setLocation(300, 300);

		// ���ӹرմ��ڼ����������û�������Ͻǹر�ͼ�꣬���Թر���Ϸ����
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		addKeyListener(new KeyMonitor()); //���Ӽ��̵ļ���
		new PaintThread().start();//�����ػ��߳�
		
		for(int i=0; i<50; i++){
			Shell b = new Shell();
			shellList.add(b);
		}
	}

	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}







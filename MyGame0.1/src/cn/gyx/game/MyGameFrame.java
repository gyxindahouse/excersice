package cn.gyx.game;

import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * 窗口初始化
 * 
 * @author 郭蝈
 *
 */
public class MyGameFrame extends JFrame {
	// 将背景图片与飞机图片定义为成员变量
	Image bgImg = GameUtil.getImage("images/bg.jpg");
	Image planeImg = GameUtil.getImage("images/plane.png");
	
	Plane plane = new Plane(planeImg, 300, 300, 9);
	
	ArrayList<Shell> shellList = new ArrayList<Shell>();//容器作用和数组类似
	
	Explode bao;
	
	Date startTime = new Date(); 
	Date endTime;
	//paint方法的作用是:画出整个窗口及内部内容，被系统自动调用
	@Override
	public void paint(Graphics g){
		g.drawImage(bgImg, 0, 0, null);
		plane.drawMySelf(g);//画出飞机本身

		//画出容器中所有的子弹
		for(int i=0; i<shellList.size(); i++){
			Shell b = shellList.get(i);
			b.draw(g);
			
			//飞机和所有炮弹对象进行矩形检测
			boolean peng = b.getRect().intersects(plane.getRect());
			if(peng){
				plane.live = false; //飞机死掉,画面不显示
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
     * 在窗口上打印信息
     * @param g
     * @param str
     * @param size
     */
	private void printInfo(Graphics g, String str, int size, int x, int y, Color color) {
		// TODO Auto-generated method stub
		Color c = g.getColor();
		g.setColor(color);
		Font f = new Font("宋体", Font.BOLD, size);
		g.setFont(f);
		g.drawString(str, x, y);
		g.setColor(c);
	}

	/**
	 * 定义一个重画窗口的线程类，是一个内部类
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
	//定义为内部类，可以方便的使用外部类的普通属性,增加键盘监听功能
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
		// 在游戏窗口打印标题
		setTitle("尚学堂学员—郭蝈作品");
		// 窗口默认不可见，设为可见
		setVisible(true);
		setSize(Constant.game_height, Constant.game_width);
		setLocation(300, 300);

		// 增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		addKeyListener(new KeyMonitor()); //增加键盘的监听
		new PaintThread().start();//启动重画线程
		
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







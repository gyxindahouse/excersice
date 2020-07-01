package cn.gyx.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * GameUtil�ࣺ����ͼƬ����
 * @author ����
 *
 */
public class GameUtil {
	//��������ý�������˽�л�
	private GameUtil(){
		
	}
	public static Image getImage(String path){
		BufferedImage bi = null;
		try{
			java.net.URL u = GameUtil.class.getClassLoader().getResource(path);
			bi = ImageIO.read(u);
		}catch(IOException e){
			e.printStackTrace();
		}
		return bi;
	}
	
//	//������ͼƬ��ɻ�ͼƬ����Ϊ��Ա����
//	Image bgImg = GameUtil.getImage("images/ball.jpg");
//	Image planeImg = GameUtil.getImage("images/desk.jpg");
//	
//	public void paint(Graphics g){
//		g.drawImage(bgImg, 0, 0, null);
//		g.drawImage(planeImg, 200, 200, null);
//	}
}

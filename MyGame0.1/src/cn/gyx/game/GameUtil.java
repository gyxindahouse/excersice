package cn.gyx.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * GameUtil类：加载图片代码
 * @author 郭蝈
 *
 */
public class GameUtil {
	//工具类最好将构造器私有化
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
	
//	//将背景图片与飞机图片定义为成员变量
//	Image bgImg = GameUtil.getImage("images/ball.jpg");
//	Image planeImg = GameUtil.getImage("images/desk.jpg");
//	
//	public void paint(Graphics g){
//		g.drawImage(bgImg, 0, 0, null);
//		g.drawImage(planeImg, 200, 200, null);
//	}
}

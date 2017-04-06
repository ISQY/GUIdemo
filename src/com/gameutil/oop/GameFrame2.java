package com.gameutil.oop;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 加载游戏界面 物体沿着任意角度移动
 * 
 * @author Leon
 */

public class GameFrame2 extends Frame {
	private static final long serialVersionUID = -104374919783234466L;
	private static final int GAME_WIDHE = 1000;
	private static final int GAME_HEIGHT = 1000;
	private double x = 0, y = 0;
	private double degree = 3.14 / 3; // 控制运动角度
	private double speed = 50; // 控制速度
	Image img = LoadImage.loadImage("image/gur-project-20.png");// 设置image路径

	/**
	 * 加载窗口
	 */
	public void launchFrame() {
		setTitle("游戏窗口"); // 设置窗口标题
		setSize(GAME_WIDHE, GAME_HEIGHT); // 设置窗口大小尺寸
		setLocation(500, 20); // 设置窗口位置
		setVisible(true); // 设置窗口是否可见
		addWindowListener(new WindowAdapter() { // 添加窗口监听事件
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 程序退出
			}
		});
		new paintThread().start();// 开启重画窗口线程类
	}

	/**
	 * 画窗口
	 */
	@Override
	public void paint(Graphics g) {
		// 添加图片
		g.drawImage(img, (int) x, (int) y, null);
		x += speed * Math.cos(degree);
		y += speed * Math.sin(degree);
		// if (y > 1000 - 32) {
		// degree = -degree;
		// }
		// if (y < 30) {
		// degree = -degree;
		// }
		// if (x < 0) {
		// degree = Math.PI - degree;
		// }
		// if (x > 1000 - 32) {
		// degree = Math.PI - degree;
		// }
		// if (speed > 0) {
		// speed -= 0.5; // 在线程类每次重画窗口,速度小0.5
		// }
		if (y > 1000 - 32 || y < 30) {
			degree = -degree;
		}
		if (x < 0 || x > 1000 - 32) {
			degree = Math.PI - degree;
		}
		if (speed > 0) {
			speed -= 0.5; // 在线程类每次重画窗口,速度小0.5
		}
		if (speed <= 0) {
			speed = 0; // 球停止运动
		}
	}

	/**
	 * 定义一个重画窗口的线程内部类,实现动画闪烁.
	 */
	class paintThread extends Thread {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * 程序入口(主方法)
	 * 
	 * @param agrs
	 */
	public static void main(String agrs[]) {
		GameFrame2 g = new GameFrame2();
		g.launchFrame();
	}

}
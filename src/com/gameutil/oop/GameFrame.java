package com.gameutil.oop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 加载游戏界面
 * 
 * @author Leon
 */

public class GameFrame extends Frame {
	Image img = LoadImage.loadImage("image/github.jpg");// 设置image路径

	/**
	 * 加载窗口
	 */
	public void launchFrame() {
		setTitle("游戏窗口"); // 设置窗口标题
		setSize(1000, 900); // 设置窗口大小尺寸
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
	int i = 1;
	private double x = 0, y = 0;

	@Override
	public void paint(Graphics g) {
		System.out.println("第" + (i++) + "次重画窗口");
		// TODO Auto-generated method stub
		// Color c = g.getColor(); // 初始化笔的颜色
		// g.setColor(Color.blue);
		// g.drawLine(100, 100, 400, 400);
		// g.drawLine(100, 400, 400, 100);
		// g.setColor(Color.RED);
		// g.drawRect(100, 100, 300, 300);
		Font f = new Font("宋体", Font.BOLD, 100); // 设置字体
		g.setFont(f); // 添加字体
		g.drawString("大帅哥", 250, 150);
		// 添加图片
		g.drawImage(img, (int) x, (int) y, null);
		x += 3;
		y += 3;
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
					Thread.sleep(50);
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
		GameFrame g = new GameFrame();
		g.launchFrame();
	}

}
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
 * 物体沿着水平竖直方向移动
 * @author Leon
 */

public class GameFrame3 extends Frame {
	Image img = LoadImage.loadImage("image/gur-project-20.png");// 设置image路径

	/**
	 * 加载窗口
	 */
	public void launchFrame() {
		setTitle("游戏窗口"); // 设置窗口标题
		setSize(1000, 1000); // 设置窗口大小尺寸
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
	private double x = 0, y = 0;
	// left控制水平方向,up控制竖直方向
	private boolean left, up;

	@Override
	public void paint(Graphics g) {
		// 添加图片
		g.drawImage(img, (int) x+16, (int) y, null);
//		if (left) {
//			x -= 3;
//		} else {
//			x += 3;
//		}
//		if (x > 1000-32) {
//			left = true;
//		}
//		if(x<0){
//			left = false;
//		}
		if (up) {
			y -= 10;
		} else {
			y += 10;
		}
		if (y > 1000-32) {
			up = true;
		}
		if(y<32){
			up = false;
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
		GameFrame3 g = new GameFrame3();
		g.launchFrame();
	}

}
package com.gameutil.oop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ������Ϸ����
 * 
 * @author Leon
 */

public class GameFrame extends Frame {
	Image img = LoadImage.loadImage("image/github.jpg");// ����image·��

	/**
	 * ���ش���
	 */
	public void launchFrame() {
		setTitle("��Ϸ����"); // ���ô��ڱ���
		setSize(1000, 900); // ���ô��ڴ�С�ߴ�
		setLocation(500, 20); // ���ô���λ��
		setVisible(true); // ���ô����Ƿ�ɼ�
		addWindowListener(new WindowAdapter() { // ��Ӵ��ڼ����¼�
			public void windowClosing(WindowEvent e) {
				System.exit(0); // �����˳�
			}
		});
		new paintThread().start();// �����ػ������߳���
	}

	/**
	 * ������
	 */
	int i = 1;
	private double x = 0, y = 0;

	@Override
	public void paint(Graphics g) {
		System.out.println("��" + (i++) + "���ػ�����");
		// TODO Auto-generated method stub
		// Color c = g.getColor(); // ��ʼ���ʵ���ɫ
		// g.setColor(Color.blue);
		// g.drawLine(100, 100, 400, 400);
		// g.drawLine(100, 400, 400, 100);
		// g.setColor(Color.RED);
		// g.drawRect(100, 100, 300, 300);
		Font f = new Font("����", Font.BOLD, 100); // ��������
		g.setFont(f); // �������
		g.drawString("��˧��", 250, 150);
		// ���ͼƬ
		g.drawImage(img, (int) x, (int) y, null);
		x += 3;
		y += 3;
	}

	/**
	 * ����һ���ػ����ڵ��߳��ڲ���,ʵ�ֶ�����˸.
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
	 * �������(������)
	 * 
	 * @param agrs
	 */
	public static void main(String agrs[]) {
		GameFrame g = new GameFrame();
		g.launchFrame();
	}

}

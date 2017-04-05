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
	Image img = LoadImage.loadImage("image/DSC_0005.JPG");// ����image·��

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
	}

	/**
	 * ������
	 */
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
//		Color c = g.getColor(); // ��ʼ���ʵ���ɫ
//		g.setColor(Color.blue);
//		g.drawLine(100, 100, 400, 400);
//		g.drawLine(100, 400, 400, 100);
//		g.setColor(Color.RED);
//		g.drawRect(100, 100, 300, 300);
		Font f = new Font("����", Font.BOLD, 100); // ��������
		g.setFont(f); // �������
		g.drawString("��˧��", 250, 150);
		// ���ͼƬ
		g.drawImage(img, 200, 200, null);
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

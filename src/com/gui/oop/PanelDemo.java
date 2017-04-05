package com.gui.oop;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelDemo {
	public static void main(String[] args) {
		new MyFrameAddPanel("������",300,300,400,300);//������������
	}
}
@SuppressWarnings("serial")
class MyFrameAddPanel extends Frame{
	private Panel p1,p2,p3,p4;//����Panel����
	/**
	 * ��Panle��ӵ�Frame��
	 * @param s ���ñ���������
	 * @param x ���������X����
	 * @param y ���������Y����
	 * @param w ��������Ŀ��
	 * @param h ��������ĸ߶�
	 */
	public MyFrameAddPanel(String s,int x,int y,int w,int h){
		super(s);
		setLayout(null);
		p1 = new Panel(null); p2 = new Panel(null);
		p3 = new Panel(null); p4 = new Panel(null);
		p1.setBounds(0, 0, w/2, h/2);     //����Panel��С�Լ�λ��
		p2.setBounds(0, h/2, w/2, h/2);   //����Panel��С�Լ�λ��
		p3.setBounds(w/2, 0, w/2, h/2);   //����Panel��С�Լ�λ��
		p4.setBounds(w/2, h/2, w/2, h/2); //����Panel��С�Լ�λ��
		p1.setBackground(Color.BLUE);     //����Panel��ɫ
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.YELLOW);
		p4.setBackground(Color.MAGENTA);
		add(p1);add(p2);     //��Panle��ӵ�Frame��
		add(p3);add(p4);
		setBounds(x, y, w, h);
		setVisible(true);
	}
}

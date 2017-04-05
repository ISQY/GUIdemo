package com.gui.oop;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class MyFrame extends Frame{
	private static int i= 0;//����ȫ�ֱ�����Ϊ���ñ�������ֵ������
	/**
	 * �˷������Զ��巽ʽ�����������Ļ����ʾ
	 * @param x ���������X����
	 * @param y ���������Y����
	 * @param w ��������Ŀ��
	 * @param h ��������ĸ߶�
	 * @param yanse ���������ʾ��ɫ
	 */
	public  MyFrame (int x,int y,int w,int h,Color yanse){
		super("������"+(i++));//���ü̳�Frame����public Frame(String title)���췽�����Լ�����i������
		setBounds(x,y,w,h);//�˷�����Window���ж���
		setBackground(yanse);//�˷�����Window���ж���
		setVisible(true);//��ʾ������Window
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

	}

public static void main(String args[ ]){
	MyFrame f1 = new MyFrame(100,100,200,200,Color.RED);
	MyFrame f2 = new MyFrame(300,100,200,200,Color.BLUE);
	MyFrame f3 = new MyFrame(100,300,200,200,Color.GREEN);
	MyFrame f4 = new MyFrame(300,300,200,200,Color.YELLOW);
    }
}
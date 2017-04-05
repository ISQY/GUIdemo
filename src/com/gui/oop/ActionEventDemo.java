package com.gui.oop;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ActionEventDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("�¼�����");
		Button b1 = new Button("��ʼ");
		Button b2 = new Button("����");
		b1.addActionListener(new Monitor());// ����b1��ť
		b2.addActionListener(new Monitor());// ����b2��ť
		b1.setActionCommand("��Ϸ��ʼ");
		b2.setActionCommand("��Ϸ����");
		frame.add(b1, "North");
		frame.add(b2, "Center");
		frame.pack();
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(-1);
			}
		});
		b2.addActionListener(new ActionListener() {// button�м��봰�ڼ����¼�
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(-1);
			}
		});
	}
}

class Monitor implements ActionListener {// ʵ��һ�������Ķ�������Ϊ����
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// ���ش˰�ť�����Ķ����¼����������ơ������������Ϊ null��Ĭ�ϣ�����˷������ذ�ť�ı�ǩ��
		System.out.println(e.getActionCommand());
	}

}

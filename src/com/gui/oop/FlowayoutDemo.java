package com.gui.oop;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("������");
		Button button1 = new Button("��");
		Button button2 = new Button("�ر�");
		Button button3 = new Button("�˳�");
		frame.setLayout(new FlowLayout());
		//setLayout()��Frame�ĸ���ĸ���Container�еķ�����
		//���������ò��ֹ�����������һ��ָ�����ֹ�����LayoutManager
        //��LayoutManager��һ���ӿڣ��ڵ�����ʵ����FlowLayout
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(200, 200);
		frame.setVisible(true);

	}

}

package com.gui.oop;

import java.awt.Button;
import java.awt.Frame;

public class BorderLayout {
	private static Object NORTH;
	private static Object south;
	public static Object CENTER;
	public static Object SOUTH;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("������");
		frame.add(new Button("��"), BorderLayout.NORTH);
		frame.add(new Button("�ر�"), BorderLayout.south);
		frame.setSize(500, 500);
		frame.setVisible(true);


	}

}

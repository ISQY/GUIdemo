package com.gui.oop;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class GridLayoutDrmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("¼ÆËãÆ÷");
		TextField T = new TextField(10);
		frame.setLayout(new GridLayout(3, 3));
		frame.add(new Button("1"));
		frame.add(new Button("2"));
		frame.add(new Button("3"));
		frame.add(new Button("4"));
		frame.add(new Button("5"));
		frame.add(new Button("6"));
		frame.add(new Button("7"));
		frame.add(new Button("8"));
		frame.add(new Button("9"));
		frame.pack();
		frame.setVisible(true);
		

	}

}

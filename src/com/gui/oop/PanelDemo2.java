package com.gui.oop;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame3(300,300,400,300,Color.BLUE);
	}
}
//此类将panel放入Frame中，且居中
class MyFrame3 extends Frame{
	private Panel p;
	public MyFrame3(int x,int y,int w,int h,Color c){
		super("标题栏");
		setLayout(null);
		setBounds(x,y,w,h);
		setBackground(c);
		p = new Panel(null);
		p.setBounds(w/4, h/4, w/2, h/2);
		p.setBackground(Color.yellow);
		add(p);
		setVisible(true);
	}
}

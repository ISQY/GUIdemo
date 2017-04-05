package com.gui.oop;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelDemo {
	public static void main(String[] args) {
		new MyFrameAddPanel("标题栏",300,300,400,300);//采用匿名对象
	}
}
@SuppressWarnings("serial")
class MyFrameAddPanel extends Frame{
	private Panel p1,p2,p3,p4;//定义Panel数量
	/**
	 * 将Panle添加到Frame中
	 * @param s 设置标题栏名字
	 * @param x 设置组件的X坐标
	 * @param y 设置组件的Y坐标
	 * @param w 设置组件的宽度
	 * @param h 设置组件的高度
	 */
	public MyFrameAddPanel(String s,int x,int y,int w,int h){
		super(s);
		setLayout(null);
		p1 = new Panel(null); p2 = new Panel(null);
		p3 = new Panel(null); p4 = new Panel(null);
		p1.setBounds(0, 0, w/2, h/2);     //设置Panel大小以及位置
		p2.setBounds(0, h/2, w/2, h/2);   //设置Panel大小以及位置
		p3.setBounds(w/2, 0, w/2, h/2);   //设置Panel大小以及位置
		p4.setBounds(w/2, h/2, w/2, h/2); //设置Panel大小以及位置
		p1.setBackground(Color.BLUE);     //设置Panel颜色
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.YELLOW);
		p4.setBackground(Color.MAGENTA);
		add(p1);add(p2);     //将Panle添加到Frame中
		add(p3);add(p4);
		setBounds(x, y, w, h);
		setVisible(true);
	}
}

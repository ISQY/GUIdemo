package com.gui.oop;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class MyFrame extends Frame{
	private static int i= 0;//定义全局变量，为设置标题栏数值的增加
	/**
	 * 此方法以自定义方式设置组件在屏幕上显示
	 * @param x 设置组件的X坐标
	 * @param y 设置组件的Y坐标
	 * @param w 设置组件的宽度
	 * @param h 设置组件的高度
	 * @param yanse 设置组件显示颜色
	 */
	public  MyFrame (int x,int y,int w,int h,Color yanse){
		super("标题栏"+(i++));//调用继承Frame类中public Frame(String title)构造方法，以及变量i的自增
		setBounds(x,y,w,h);//此方法在Window类中定义
		setBackground(yanse);//此方法在Window类中定义
		setVisible(true);//显示或隐藏Window
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
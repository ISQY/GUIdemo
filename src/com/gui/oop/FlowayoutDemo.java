package com.gui.oop;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("标题栏");
		Button button1 = new Button("打开");
		Button button2 = new Button("关闭");
		Button button3 = new Button("退出");
		frame.setLayout(new FlowLayout());
		//setLayout()是Frame的父类的父类Container中的方法，
		//其作用设置布局管理器，接收一个指定布局管理器LayoutManager
        //，LayoutManager是一个接口，在调用其实现类FlowLayout
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(200, 200);
		frame.setVisible(true);

	}

}

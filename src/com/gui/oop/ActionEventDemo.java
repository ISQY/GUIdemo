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
		Frame frame = new Frame("事件监听");
		Button b1 = new Button("开始");
		Button b2 = new Button("结束");
		b1.addActionListener(new Monitor());// 监听b1按钮
		b2.addActionListener(new Monitor());// 监听b2按钮
		b1.setActionCommand("游戏开始");
		b2.setActionCommand("游戏结束");
		frame.add(b1, "North");
		frame.add(b2, "Center");
		frame.pack();
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(-1);
			}
		});
		b2.addActionListener(new ActionListener() {// button中加入窗口监听事件
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(-1);
			}
		});
	}
}

class Monitor implements ActionListener {// 实现一个监听的动作和行为的类
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 返回此按钮激发的动作事件的命令名称。如果命令名称为 null（默认），则此方法返回按钮的标签。
		System.out.println(e.getActionCommand());
	}

}

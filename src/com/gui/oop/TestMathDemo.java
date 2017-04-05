package com.gui.oop;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class TFFrame extends Frame{
	TextField num1,num2,num3;
	public void launchFrame(){
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		Label lblplus = new Label("+");//定义标签
		Button button = new Button("=");
		button.addActionListener(new MyMonitor(this));
		setLayout(new FlowLayout());
		add(num1);
		add(lblplus);
		add(num2);
		add(button);
		add(num3);
		pack();
		setVisible(true);
	}
}

class MyMonitor implements ActionListener{
	TFFrame tf = null;//这里注意:传TFFrame的引用，能够得到TFFrame的属性，才能操作TFFrame它的内容
	public MyMonitor(TFFrame tf) {
		this.tf = tf;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(tf.num1.getText());//将字符串转换为int型并获取内容
		int n2 = Integer.parseInt(tf.num2.getText());
		tf.num3.setText("" + (n1+n2));
	}
}

public class TestMathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TFFrame().launchFrame();
	}
}


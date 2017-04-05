package com.gui.oop;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("记事本");
		JMenuBar jmb=new JMenuBar();
		String[] menuLab={"文件","编辑","帮助"};
		String[][] menuItemLab={{"新建","打开","保存","另存","退出"},
				{"撤销","剪切","复制","粘贴","删除","全选","查找","替换"},
				{"版本"}};
		for(int i=0;i<menuLab.length;i++){
			JMenu menu=new JMenu(menuLab[i]);
			jmb.add(menu);
			for(int j=0;j<menuItemLab[i].length;j++){
				JMenuItem jmi=new JMenuItem(menuItemLab[i][j]);
				menu.add(jmi);
			}
		}
		frame.setJMenuBar(jmb);
		frame.setSize(500, 500);;
		frame.setVisible(true);

	}

}

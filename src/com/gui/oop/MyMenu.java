package com.gui.oop;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("���±�");
		JMenuBar jmb=new JMenuBar();
		String[] menuLab={"�ļ�","�༭","����"};
		String[][] menuItemLab={{"�½�","��","����","���","�˳�"},
				{"����","����","����","ճ��","ɾ��","ȫѡ","����","�滻"},
				{"�汾"}};
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

package view;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar{

	private JMenu menuNew;
	private JMenu menuEdit;
	private JMenu menuHelp;
	
	private JMenuItem itemNew;
	private JMenuItem itemClose;
	
	public MenuBar() {
		
		menuNew = new JMenu("New");
		menuNew.setMnemonic(KeyEvent.VK_N);
		
		menuEdit = new JMenu("Edit");
		menuEdit.setMnemonic(KeyEvent.VK_E);
		
		menuHelp = new JMenu("Help");
		menuHelp.setMnemonic(KeyEvent.VK_H);
	
	dodajOpcije();
	
	
	}
	
	public void dodajOpcije() {
		this.add(menuNew);
		this.add(menuEdit);
		this.add(menuHelp);
	}
}

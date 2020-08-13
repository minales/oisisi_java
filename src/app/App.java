package app;

import javax.swing.UIManager;

import view.MainFrame;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		MainFrame mf = new MainFrame();
		
		mf.setVisible(true);
	}

}

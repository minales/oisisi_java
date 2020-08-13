package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame  extends JFrame{

	private static MainFrame instance = new MainFrame();
	
	private MenuBar meniBar;
	private StatusBar statusBar;
	private ToolBar toolBar;
	
	public MainFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 700);
		setLocationRelativeTo(null);
		setTitle("Studentska služba");
		
		meniBar = new MenuBar();
		setJMenuBar(meniBar);
		
		toolBar = new ToolBar();
		add(toolBar, BorderLayout.NORTH);
		
		statusBar = new StatusBar();
		add(statusBar);
		
	}

	
	
}

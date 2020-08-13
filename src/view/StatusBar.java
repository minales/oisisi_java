package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusBar extends JPanel{

	public static final String FORMAT_DATUMA = "dd/MM/yyyy";
	public static final String FORMAT_SATA = "h:mm";

	public StatusBar() {
		setLayout(new BorderLayout());
	    
	    // Formiranje dimenzija panela za statusbar
	    Toolkit kit = Toolkit.getDefaultToolkit();
	    Dimension screenSize = kit.getScreenSize();
	    Dimension panelWidth = new Dimension(screenSize.width, 30);
        
        JPanel panStatusBar = new JPanel(new BorderLayout());
        panStatusBar.setPreferredSize(panelWidth);
        panStatusBar.setBackground(Color.white);
	    add(panStatusBar,BorderLayout.SOUTH);
	    
	    JLabel statusLabel = new JLabel("Studentska služba");
	    panStatusBar.add(statusLabel, BorderLayout.WEST);
	   
	    // Labela koja ce prikazivati datum
	    DateFormat dateFormat = new SimpleDateFormat(FORMAT_DATUMA);
	    Calendar cal = Calendar.getInstance();
//	    JLabel lblDate = new JLabel(dateFormat.format(cal.getTime())+ " ");
	//    panStatusBar.add(lblDate,BorderLayout.EAST);
	    
	    DateFormat timeFormat = new SimpleDateFormat(FORMAT_SATA);
	    Date currentTime = cal.getTime();
	    JLabel lblTime = new JLabel(timeFormat.format(cal.getTime())+ " " + dateFormat.format(cal.getTime())+ " ");
	    panStatusBar.add(lblTime,BorderLayout.EAST);
	}

}

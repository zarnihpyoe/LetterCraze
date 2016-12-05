package controllers;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class TileToggleController extends MouseAdapter {
	
	boolean latch = false;
	
	JPanel panel;
	
	public TileToggleController(JPanel p) {
		this.panel = p;
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		
		Component button = e.getComponent();
		MouseEvent me = new MouseEvent(panel, 506, 1, 0, button.getX() + e.getX(), button.getY() + e.getY(), 0, false);		
		panel.getMouseMotionListeners()[0].mouseDragged(me);
		//return;
		
	}

}

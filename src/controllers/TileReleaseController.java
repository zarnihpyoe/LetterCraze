package controllers;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class TileReleaseController extends MouseAdapter {
	
	JPanel panel;
	
	
	public TileReleaseController(JPanel p){
		this.panel = p;
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		for (int i = 0; i < 36; i++){
			JToggleButton button = (JToggleButton) panel.getComponents()[i];
			button.setEnabled(true);
		}
	}


}

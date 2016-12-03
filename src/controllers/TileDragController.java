package controllers;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class TileDragController implements MouseMotionListener {

	JPanel panel;
	int current_check = 0;
	
	public TileDragController(JPanel p) {
		this.panel = p;
	}
	
	public void mouseMoved(MouseEvent arg0) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		//int current_check = 0;
		int x_rel = e.getX();
		int y_rel = e.getY();
		int i = this.getTile(x_rel, y_rel);		
		
		//valid placement needs extensive testing
		if (i != 0 && isValidPlacement(i-1, current_check)){
			JToggleButton selectedButton = (JToggleButton) panel.getComponent(i-1);
			selectedButton.setEnabled(false);
			current_check = i - 1;
		}
		
		
		//insert entity control here
		/*
		try {
			m.addElt(i)
		} catch (Exception exc){
		}
		*/	
	}
	
	
	//WARNING: MAY PRODUCE DEFECTS
	private boolean isValidPlacement(int i, int c) {
		
		int[] neighbors = {c-7, c-5, c+5, c+7, c-6, c-1, c+1, c+6};
		
		if (c == 0){
			return true;
		}
		for (int j = 0; j < 8; j++){
			if (i == neighbors[j]){
				return true;
			}
		}
		
		return false;
	}

	public int getTile(int x, int y){
		for (int i = 0; i < 36; i++){
			int x_len = 100 + 100*(i % 6);
			int y_len = 100 + 100*(i / 6);
			
			if (x < (x_len + 80) && x > (x_len+20) && y < (y_len + 80) && y > (y_len + 20)){
				return i + 1;
			}
		}		
		return 0;
	}

	
}

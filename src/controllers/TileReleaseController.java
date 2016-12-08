package controllers;
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import model.*;
import boundary.*;

public class TileReleaseController extends MouseAdapter {
	
	JPanel panel;
	JLayeredPane layerPane;
	JLabel[] arrows;
	Model model;
	Application app;
	
	
	public TileReleaseController(JPanel p, JLayeredPane lp, JLabel[] a, Model m, Application app){
		this.panel = p;
		this.layerPane = lp;
		this.arrows = a;
		this.model = m;
		this.app = app;
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
		for (int i = 0; i < 36; i++){
			JToggleButton button = (JToggleButton) panel.getComponents()[i];
			button.setEnabled(true);
		}
		
		int i;
		for (i = 0; i < 85; i++){
			layerPane.setLayer(arrows[i], 0);	
		}
		
		this.model.currentLevel.getBoard().removeSelectedWord();
		
	}
	


}

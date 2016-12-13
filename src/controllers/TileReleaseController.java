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
	
	Model model;
	Application app;
	TraceableBoardPanel tb;
	JPanel panel;
	JLayeredPane layerPane;
	AnimationPanel animationPanel;
	JLabel[] arrows;
	
	public TileReleaseController(Model m, Application a, TraceableBoardPanel tb){
		this.model = m;		
		this.app = a;
		this.tb = tb;
		this.panel = tb.getBackPanel();
		this.layerPane = tb.getLayeredPane();
		this.animationPanel = tb.getAnimationPanel();
		this.arrows = tb.getArrows();
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
		
		TileDragController.clearCurrentTile();
		
		RebuildController rc = new RebuildController(model, app, tb);
		rc.rebuildBoard();		
	}
	


}

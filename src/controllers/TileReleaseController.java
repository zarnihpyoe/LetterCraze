package controllers;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class TileReleaseController extends MouseAdapter {
	
	JPanel panel;
	JLayeredPane layerPane;
	JLabel[] arrows;
	
	
	public TileReleaseController(JPanel p, JLayeredPane lp, JLabel[] a){
		this.panel = p;
		this.layerPane = lp;
		this.arrows = a;
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		for (int i = 0; i < 36; i++){
			JToggleButton button = (JToggleButton) panel.getComponents()[i];
			button.setEnabled(true);
		}
		
		for (int i = 0; i < 85; i++){
			layerPane.setLayer(arrows[i], 0);
			
		}
		
		//INSERT ENTITY CONTROL HERE
		
	}


}

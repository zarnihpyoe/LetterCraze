package boundary;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import controllers.TileDragController;
import controllers.TileReleaseController;
import controllers.TileToggleController;

import java.awt.Color;

public class TraceableBoardPanel extends JPanel {

	JToggleButton[] buttons;


	/**
	 * Create the application.
	 */
	public TraceableBoardPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(0, 0, 800, 800);
		add(panel);
		panel.setLayout(null);
		
		buttons = new JToggleButton[36];
		for (int i = 0; i < 36; i++){
			buttons[i] = new JToggleButton("");
			int x_pos = 100 + 100 * (i % 6);
			int y_pos = 100 + 100 * (i / 6);
			buttons[i].setBounds(x_pos, y_pos, 100, 100);
			panel.add(buttons[i]);
		}
		
		panel.addMouseMotionListener(new TileDragController(panel));
		panel.addMouseListener(new TileReleaseController(panel));
		
		for (int i = 0; i < 36; i++){
			buttons[i].addMouseMotionListener(new TileToggleController(panel));
			buttons[i].addMouseListener(new TileReleaseController(panel));
		}	
	}
}

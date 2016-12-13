package boundary;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import controllers.TileDragController;
import controllers.TileReleaseController;
import controllers.TileToggleController;
import model.Board;
import model.Model;
import model.Tile;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

//check for when we are over a disabled tile
//check for doubled arrows

public class TraceableBoardPanel extends JPanel {

	JToggleButton[] buttons;
	JLabel[] arrows;
	Model m = new Model();
	JLayeredPane layeredPane;
	AnimationPanel animPanel;

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
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 420, 420);
		add(layeredPane);
		
		/*
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(0, 0, 800, 800);
		add(panel);
		panel.setLayout(null);
		*/
		
		animPanel = new AnimationPanel();
		animPanel.setOpaque(false);
		animPanel.setBounds(0, 0, 420, 420);
		layeredPane.setLayer(animPanel, 3);
		layeredPane.add(animPanel);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(0, 0, 800, 800);
		panel.setLayout(null);
		layeredPane.setLayer(panel, 1);
		layeredPane.add(panel);
		
		buttons = new JToggleButton[36];
		//run a fill up for first time controller (could return array of chars)
		for (int i = 0; i < 36; i++){
			buttons[i] = new JToggleButton("");
			int x_pos = 70 * (i % 6); //slice 100
			int y_pos = 70 * (i / 6); //slice 100
			buttons[i].setBounds(x_pos, y_pos, 70, 70); //
			panel.add(buttons[i]);
		}
		
		buttons[7].setText("T");
		
		arrows = new JLabel[85];
		for (int i = 0; i < 30; i++){
			arrows[i] = new JLabel("O");
			int x_pos = 60 + 70 * (i % 5); //
			int y_pos = 20 + 70 * (i / 5); //				
			arrows[i].setBounds(x_pos, y_pos, 32, 30);
			layeredPane.setLayer(arrows[i], 0);
			layeredPane.add(arrows[i]);
		}
		
		for (int i = 0; i < 55; i++){
			arrows[30 + i] = new JLabel("O");
			int x_pos = 25 + 35 * (i % 11); //
			int y_pos = 60 + 70 * (i / 11); //	
			arrows[30 + i].setBounds(x_pos, y_pos, 32, 30);
			layeredPane.setLayer(arrows[30 + i], 0);
			layeredPane.add(arrows[30 + i]);
			}
		
		panel.addMouseMotionListener(new TileDragController(panel, layeredPane, arrows, m));
		panel.addMouseListener(new TileReleaseController(panel, layeredPane, animPanel, arrows, m, this));
		
		for (int i = 0; i < 36; i++){
			buttons[i].addMouseMotionListener(new TileToggleController(panel));
			buttons[i].addMouseListener(new TileReleaseController(panel, layeredPane, animPanel, arrows, m, this));
		}
		
	}
	
	public void updateBoard(Board b){
		//Tile[][] t = m.getCurrentLevel().getBoard().getTiles();
		Tile[][] t = b.getTiles();
		
		for (int i = 0; i < 6; i++){
			for (int j = 0; j < 6; j++){
				int but = j + 6 * i;
				buttons[but].setText(t[i][j].getCharacter());				
			}
		}
	}
	
	public void clearButton(int x, int y){
		int but = 6 * y + x;
		buttons[but].setText("");
	}
	
	public AnimationPanel getAnimationPanel(){
		return this.animPanel;
	}
	
	public JLayeredPane getLayeredPane(){
		return this.layeredPane;
	}
	
	public void setLevel(Component c, int layer){
		layeredPane.setLayer(c, 3);
	}
		
}

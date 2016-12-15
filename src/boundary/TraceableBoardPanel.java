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
	
	Model m;
	Application a;
	JPanel backPanel;
	JToggleButton[] buttons;
	JLabel[] arrows;
	JLayeredPane layeredPane;
	AnimationPanel animPanel;

	/**
	 * Create the application.
	 */
	public TraceableBoardPanel(Model m, Application a) {
		this.m = m;
		this.a = a;
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
		
		
		backPanel = new JPanel();
		backPanel.setBackground(Color.MAGENTA);
		backPanel.setBounds(0, 0, 800, 800);
		backPanel.setLayout(null);
		layeredPane.setLayer(backPanel, 1);
		layeredPane.add(backPanel);
		
		buttons = new JToggleButton[36];
		//run a fill up for first time controller (could return array of chars)
		Tile[][] start_tiles = m.getCurrentLevel().getBoard().getTiles();
		for (int i = 0; i < 36; i++){
			if (start_tiles[i/6][i%6] != null){
				buttons[i] = new JToggleButton(start_tiles[i/6][i%6].getCharacter());
			} else { buttons[i] = new JToggleButton(""); }
			int x_pos = 70 * (i % 6); //slice 100
			int y_pos = 70 * (i / 6); //slice 100
			buttons[i].setBounds(x_pos, y_pos, 70, 70); //
			backPanel.add(buttons[i]);
		}
				
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
		
		backPanel.addMouseMotionListener(new TileDragController(m, this));
		backPanel.addMouseListener(new TileReleaseController(m, a, this));
		
		for (int i = 0; i < 36; i++){
			buttons[i].addMouseMotionListener(new TileToggleController(backPanel));
			buttons[i].addMouseListener(new TileReleaseController(m, a, this));
		}
		
	}
	
	public void updateBoard(){
		Board b = m.getCurrentLevel().getBoard();
		
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
	
	public JPanel getBackPanel(){
		return this.backPanel;
	}
	
	public JLabel[] getArrows(){
		return this.arrows;
	}
	
	public void setLevel(Component c, int layer){
		layeredPane.setLayer(c, 3);
	}
		
}

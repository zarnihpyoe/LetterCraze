package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.*;
import model.*;


public class SelectLightningLevelController extends MouseAdapter {
	Application app;
    Model model;
	
	public SelectLightningLevelController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		// Initiate new score board and board 
		ScoreBoard scoreBoard = new ScoreBoard(5, 7, 10);
		Tile[][] tiles = new Tile[6][6];
		Board board = new Board(tiles);
		
		// Initiate new Lightning builder and lightning view
		Lightning lightningLevel = new Lightning(board, scoreBoard, 100);
		
		// Assign lightning builder status to model
		this.model.assignLevel(lightningLevel);
		
		// Initiate new lightning view
		LightningPlayerPanel lightningView = new LightningPlayerPanel();
		
		// We want to call some method on current application that will switch to just created 
		// lightning view
		app.modifyFrameSize(100, 100, 750, 575);
		app.switchPanel(lightningView);
		
		
	}
}

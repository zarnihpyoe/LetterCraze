package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.*;
import model.*;


public class SelectPuzzleLevelController extends MouseAdapter {
	Application app;
    Model model;
	
	public SelectPuzzleLevelController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		// Initiate new score board and board 
		ScoreBoard scoreBoard = new ScoreBoard(5, 7, 10);
		Tile[][] tiles = new Tile[6][6];
		Board board = new Board(tiles);
		
		Puzzle puzzleLevel = new Puzzle(board, scoreBoard);
		
		this.model.assignLevel(puzzleLevel);
		
		PuzzlePlayerPanel puzzleView = new PuzzlePlayerPanel();
		
		app.modifyFrameSize(100, 100, 750, 575);
		app.switchPanel(puzzleView);
		
		
	}
}

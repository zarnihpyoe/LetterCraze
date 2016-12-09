package controllers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import boundary.*;
import model.*;

public class SelectPuzzleLevelController extends MouseAdapter {
	Application app;
    Model model;
    int level;
	
	public SelectPuzzleLevelController(Application a, Model m, int level) {
		this.app = a;
		this.model = m;
		this.level = level;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		// Initiate new score board and board 
		ScoreBoard scoreBoard = new ScoreBoard(5, 7, 10);
		Tile[][] tiles = new Tile[6][6];
		Board board = new Board(tiles);
		// Temporary number, to be removed after memento class will be added and substituted 
		// with word limit from memento class
		int wordLimit = 20;
				
		Puzzle puzzleLevel = new Puzzle(this.level, board, scoreBoard, wordLimit);
		
		this.model.assignLevel(puzzleLevel);
		
		PuzzlePlayerPanel puzzleView = new PuzzlePlayerPanel(app, model, level);
		
		app.modifyFrameSize(100, 100, 605, 555);
		app.switchPanel(puzzleView);
		
		
	}
}

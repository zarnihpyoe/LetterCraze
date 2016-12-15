package controllers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import boundary.*;
import model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SelectPuzzleLevelController extends MouseAdapter {
	Application app;
	Model model;
	int level;
    public String levelText;
	Scanner sc;

	public SelectPuzzleLevelController(Application a, Model m, int level) {
		this.app = a;
		this.model = m;
		this.level = level;
		levelText = "/levels/" + level + ".txt";
	}

	@Override
	public void mousePressed(MouseEvent me) {
		
		try {
			StringFileIterator(new File (".", levelText));
		} catch (FileNotFoundException e) {
			System.out.println("This file doesn't exist you fool.");
		}
		
		String[][] levelBoard = new String[6][6];
		
		next();
		
		String row1 = next(); //000000
		for(int i=0; i<6; i++){levelBoard[0][i] = Character.toString(row1.charAt(i));}
		String row2 = next(); //******
		for(int i=0; i<6; i++){levelBoard[1][i] = Character.toString(row2.charAt(i));}
		String row3 = next();
		for(int i=0; i<6; i++){levelBoard[2][i] = Character.toString(row3.charAt(i));}
		String row4 = next();
		for(int i=0; i<6; i++){levelBoard[3][i] = Character.toString(row4.charAt(i));}
		String row5 = next();	
		for(int i=0; i<6; i++){levelBoard[4][i] = Character.toString(row5.charAt(i));}
		String row6 = next();
		for(int i=0; i<6; i++){levelBoard[5][i] = Character.toString(row6.charAt(i));}
		
		int wordLimit = Integer.parseInt(next());
		int thresh1 = Integer.parseInt(next());
		int thresh2 = Integer.parseInt(next());
		int thresh3 = Integer.parseInt(next());
		
		// Initiate new score board and board
		ScoreBoard scoreBoard = new ScoreBoard(thresh1, thresh2, thresh3, level);
		/*
		 * Tile[][] tiles = new Tile[6][6]; for (int i = 0; i < 6; i++){ for
		 * (int j = 0; j < 6; j++){ tiles[i][j] = new Tile (i, j); } } Board
		 * board = new Board(tiles);
		 * 
		 * board.populateEmptyTiles();
		 * System.out.println(board.getTiles()[1][1].getCharacter());
		 * 
		*/

		Tile[][] tiles;
		tiles = new Tile[6][6];
		// initialize
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(levelBoard[i][j].equals("*")){
					tiles[i][j] = new Tile(i, j);
					tiles[i][j].setLetter(LetterBank.genRandLetter());
				} else {
					tiles[i][j] = null;
				}
			}
		}
	
		// link the tiles
		for (int i = 0; i < 5; i++) { // a little hack here
			for (int j = 0; j < 6; j++) {
				if(tiles[i+1][j] == null || tiles[i][j] == null){
				} else { 
					tiles[i][j].linkWith(tiles[i + 1][j]);
				}
			}
		}
		
		Board board = new Board(tiles);

		// Temporary number, to be removed after memento class will be added and
		// substituted
		// with word limit from memento class

		Puzzle puzzleLevel = new Puzzle(this.level, board, scoreBoard, wordLimit);

		this.model.assignLevel(puzzleLevel);

		PuzzlePlayerPanel puzzleView = new PuzzlePlayerPanel(app, model, level, wordLimit);

		app.modifyFrameSize(100, 100, 605, 555);
		app.switchPanel(puzzleView);

	}
	
	// The name of the file to open.
	
	public void StringFileIterator(File f) throws FileNotFoundException {
		sc = new Scanner(f);
	}

	public boolean hasNext() {
		if (sc == null) { return false; }
		return sc.hasNextLine();
	}

	public String next() throws NoSuchElementException {
		
		if (sc == null) {
			throw new NoSuchElementException ("End of file reached.");
		}

		String s = sc.nextLine();
		System.out.println(s);

		if (!sc.hasNextLine()) {
			sc.close();
			sc = null;
		}
		return s;
	}

	public void remove() {
		throw new UnsupportedOperationException("Unable to delete from StringFileIterator.");
	}
	
	public void populateBoard(Board b){
	}
}


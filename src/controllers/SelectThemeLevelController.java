package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import boundary.*;
import model.*;


public class SelectThemeLevelController extends MouseAdapter {
	Application app;
    Model model;
    int level;
    public String levelText;
	Scanner sc;
	
	public SelectThemeLevelController(Application a, Model m, int level) {
		this.app = a;
		this.model = m;
		this.level = level;
		levelText = "/levels/" + level + ".txt";
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		// Initiate new score board and board
		
		try {
			StringFileIterator(new File (".", levelText));
		} catch (FileNotFoundException e) {
			System.out.println("This file doesn't exist you fool.");
		}
		
		next();
		next();
		next();
		next();
		next();
		next();
		next();
		String theme = next();
		String word1 = next();
		String word2 = next();
		String word3 = next();
		
		ScoreBoard scoreBoard = new ScoreBoard(1, 2, 3);
		Tile[][] tiles = new Tile[6][6];
		Board board = new Board(tiles);
		ArrayList<String> wordList = new ArrayList<String>(3);
		wordList.add(word1);
		wordList.add(word2);
		wordList.add(word3);
		Theme themeLevel = new Theme(this.level, board, scoreBoard, theme, wordList);
		populateBoard(board);
		
		this.model.assignLevel(themeLevel);
		
		ThemePlayerPanel puzzleView = new ThemePlayerPanel(app, model, board, theme, wordList, level);
		
		app.modifyFrameSize(100, 100, 750, 575);
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

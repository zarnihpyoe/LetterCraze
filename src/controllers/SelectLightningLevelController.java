package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import boundary.*;
import model.*;


public class SelectLightningLevelController extends MouseAdapter {
	Application app;
	Model model;
	int level;
	public String levelText; //= "/levels/boardtest.txt";
	Scanner sc;

	public SelectLightningLevelController(Application a, Model m, int lvl) {
		this.app = a;
		this.model = m;
		this.level = lvl;
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
		int timer = Integer.parseInt(next());
		int thresh1 = Integer.parseInt(next());
		int thresh2 = Integer.parseInt(next());
		int thresh3 = Integer.parseInt(next());

		ScoreBoard scoreBoard = new ScoreBoard(thresh1, thresh2, thresh3);
		Tile[][] tiles = new Tile[6][6];
		Board board = new Board(tiles);
		populateBoard(board);

		// Initiate new Lightning builder and lightning view
		Lightning lightningLevel = new Lightning(this.level, board, scoreBoard, timer);

		// Assign lightning builder status to model
		this.model.assignLevel(lightningLevel);

		// Initiate new lightning view
		LightningPlayerPanel lightningView = new LightningPlayerPanel(app, model, board, timer, level);

		// We want to call some method on current application that will switch to just created 
		// lightning view
		app.modifyFrameSize(100, 100, 750, 575);
		app.switchPanel(lightningView);
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

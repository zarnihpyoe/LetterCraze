package model;

import java.util.ArrayList;

public abstract class Level {

	protected final int lvl;
	protected boolean isLocked;
	protected Board board;
	protected ScoreBoard scoreBoard;
	protected int numRemovedWords;
	protected ArrayList<LevelMemento> states;


	public Level(int lvl, Board board, ScoreBoard scoreBoard) {
		this.lvl = lvl;
		this.isLocked = lvl > 3;
		this.board = board;
		this.scoreBoard = scoreBoard;
		this.numRemovedWords = 0;
		this.states = new ArrayList<LevelMemento>();
	}

	public void unlock() {
		this.isLocked = false;
	}

	public abstract boolean removeWord();
	public abstract int updateScore();
	public abstract boolean isComplete(int constraint);
    
	/** Call this for removing a word and updating everything. */
	public boolean removeWordAndUpdate() {
		boolean isValid = removeWord();
		if(isValid) {
			updateScore();
			updateNumRemovedWords(1);
		}
		return isValid;
	}

	/*	public int updateStar() {
		return scoreBoard.updateStar();
	}*/

	public int updateNumRemovedWords(int delta) {
		return numRemovedWords += delta;
	}
	
	public void reset() {
		numRemovedWords = 0;
		board.cleanUp();
		board.populateEmptyTiles();
		scoreBoard.resetScore();
	}
	

	public int getLvl() { return lvl; }

	public boolean isLocked() { return isLocked; }

	public Board getBoard() { return board; }

	public ScoreBoard getScoreBoard() { return scoreBoard; }

	public int getNumRemovedWords() { return numRemovedWords; }
	
	public ArrayList<LevelMemento> getPreviousStates() { return states; }

}

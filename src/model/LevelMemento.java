package model;

import java.util.ArrayList;

public class LevelMemento {
	
	protected Board board;
	protected ScoreBoard scoreBoard;
	protected int numRemovedWords;
	
	public LevelMemento(Board board, ScoreBoard scoreBoard, int numRemovedWords) {
		this.board = board;
		this.scoreBoard = scoreBoard;
		this.numRemovedWords = numRemovedWords;
	}
	
	public LevelMemento(){}
	
	public Board getBoard() { return this.board; }
	public ScoreBoard getScoreBoard() { return this.scoreBoard; }
	public int getNumRemovedWords() { return this.numRemovedWords; }

	
	//public void buildMemento

}

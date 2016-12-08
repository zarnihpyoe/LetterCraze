package model;

import java.util.ArrayList;

public class Theme extends Level {

	private final String theme;
	private final ArrayList<String> wordList;
	private ArrayList<String> removedWordList; 
	
	public Theme(int lvl, Board b, ScoreBoard sb, String theme, ArrayList<String> wordList) {
		super(lvl, b, sb);
		this.theme = theme;
		this.wordList = wordList;
		this.removedWordList = new ArrayList<String>();
	}
	
	@Override
	public boolean removeWord() {
		boolean isValidWord = board.getSelectedTiles().isValidInTheme(wordList);
		if(isValidWord) {
			removedWordList.add(board.getSelectedTiles().getString());
			board.removeSelectedWord();
		}
		return isValidWord;
	}

	@Override
	public int updateScore() {
		return scoreBoard.updateScore(+1);
	}
	
	@Override
	public boolean isComplete(int numWords) {
		return numWords == 3;
	}
	
	@Override
	public void reset() {
		super.reset();
		this.board.cleanUp();
		//this.board.populateEmptyTiles();      //TODO: the method to populate the theme board
		this.scoreBoard.resetScore();
		this.removedWordList = new ArrayList<String>();
	}

	public String getTheme() { return theme; }

	public ArrayList<String> getWordList() { return wordList; }

}

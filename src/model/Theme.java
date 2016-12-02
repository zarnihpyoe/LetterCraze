package model;

import java.util.ArrayList;

public class Theme extends Level {

	private final String theme;
	private final ArrayList<String> wordList;
	
	public Theme(int lvl, Board b, ScoreBoard sb, String theme, ArrayList<String> wordList) {
		super(lvl, b, sb);
		this.theme = theme;
		this.wordList = wordList;
	}

	@Override
	public int updateScore() {
		return scoreBoard.updateScore(+1);
	}

	public String getTheme() {
		return theme;
	}

	public ArrayList<String> getWordList() {
		return wordList;
	}
	
}

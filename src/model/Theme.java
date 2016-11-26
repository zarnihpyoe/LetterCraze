package model;

import java.util.ArrayList;

public class Theme extends Level {

	String theme;
	ArrayList<String> wordList;
	
	public Theme(Board board, ScoreBoard scoreBoard, 
			String theme, ArrayList<String> wordList) {
		super(board, scoreBoard);
		this.theme = theme;
		this.wordList = wordList;
	}

	@Override
	public int updateScore() {
		return scoreBoard.updateScore(+1);
	}
	
}

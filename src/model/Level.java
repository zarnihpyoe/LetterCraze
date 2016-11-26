package model;

public abstract class Level {
	
	Board board;
	ScoreBoard scoreBoard;
	
	
	public Level(Board board, ScoreBoard scoreBoard) {
		this.board = board;
		this.scoreBoard = scoreBoard;
	}
	
	public abstract int updateScore();
	
	public int updateStar() {
		return scoreBoard.updateStar();
	}

}

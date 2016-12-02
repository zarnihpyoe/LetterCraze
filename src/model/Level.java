package model;

public abstract class Level {
	
	protected final int lvl;
	protected boolean isLocked;
	protected Board board;
	protected ScoreBoard scoreBoard;
	
	
	public Level(int lvl, Board board, ScoreBoard scoreBoard) {
		this.lvl = lvl;
		this.isLocked = lvl > 3;
		this.board = board;
		this.scoreBoard = scoreBoard;
	}
	
	public void unlock() {
		this.isLocked = false;
	}
	
	public abstract int updateScore();
	
	public int updateStar() {
		return scoreBoard.updateStar();
	}

	public int getLvl() {
		return lvl;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public Board getBoard() {
		return board;
	}

	public ScoreBoard getScoreBoard() {
		return scoreBoard;
	}
	
}

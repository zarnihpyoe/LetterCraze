package model;

public class Lightning extends Level {

	int time;
	
	public Lightning(int lvl, Board board, ScoreBoard scoreBoard, int time) {
		super(lvl, board, scoreBoard);
		this.time = time;
	}

	@Override
	public int updateScore() {
		return scoreBoard.updateScore(+1);
	}

	@Override
	public boolean iscomplete(int timeLeft) {
		return timeLeft == 0;
	}
	
}

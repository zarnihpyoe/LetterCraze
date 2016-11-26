package model;

public class Lightning extends Level {

	int time;
	
	public Lightning(Board board, ScoreBoard scoreBoard, int time) {
		super(board, scoreBoard);
		this.time = time;
	}

	@Override
	public int updateScore() {
		return scoreBoard.updateScore(+1);
	}
	
}

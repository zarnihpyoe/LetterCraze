package model;

public class Lightning extends Level {

	private int time;		// not sure about the implementation of time yet
	
	public Lightning(int lvl, Board board, ScoreBoard scoreBoard, int time) {
		super(lvl, board, scoreBoard);
		this.time = time;
	}

	@Override
	public boolean removeWord() {
		boolean isValidWord = board.getSelectedTiles().isValid();
		if(isValidWord) {
			board.removeSelectedWord();
			board.populateEmptyTiles();
		}
		return isValidWord;
	}

	@Override
	public int updateScore() {
		return scoreBoard.updateScore(+1);
	}
	
	public int getTime() {
		return this.time;
	}

	@Override
	public boolean isComplete(int timeLeft) {
		return timeLeft == 0;
	}
	
	@Override
	public void reset() {
		super.reset();
		this.board.cleanUp();
		this.board.populateEmptyTiles();
		this.scoreBoard.resetScore();
	}

	public int decrementTimer() {
		time = time - 1;
		return time;
	}
	
}

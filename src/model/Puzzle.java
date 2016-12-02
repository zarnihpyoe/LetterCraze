package model;

public class Puzzle extends Level {

	private final int wordLimit;
	
	public Puzzle(int lvl, Board board, ScoreBoard scoreBoard, int wordLimit) {
		super(lvl, board, scoreBoard);
		this.wordLimit = wordLimit;
	}

	@Override
	public int updateScore() {
		return scoreBoard.updateScore(
				board.selectedTiles.getPoints());
	}

	@Override
	public boolean iscomplete(int numWords) {
		return numWords == wordLimit;
	}

	public int getWordLimit() {
		return wordLimit;
	}

}

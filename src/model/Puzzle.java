package model;

public class Puzzle extends Level {

	private final int wordLimit;
	private int removedWordPts;
	
	public Puzzle(int lvl, Board board, ScoreBoard scoreBoard, int wordLimit) {
		super(lvl, board, scoreBoard);
		this.wordLimit = wordLimit;
	}

	@Override
	public boolean removeWord() {
		boolean isValidWord = board.getSelectedTiles().isValid();
		if(isValidWord) {
			removedWordPts = board.getSelectedTiles().getPoints();
			board.removeSelectedWord();
			board.populateEmptyTiles();
		}
		return isValidWord;
	}
	
	@Override
	public int updateScore() {
		return scoreBoard.updateScore(removedWordPts);
	}

	@Override
	public boolean isComplete(int numWords) {
		return numWords == wordLimit;
	}

	public int getWordLimit() { return wordLimit; }
	
	@Override
	public void reset() {
		super.reset();
		this.board.cleanUp();
		this.board.populateEmptyTiles();
		this.scoreBoard.resetScore();
		this.removedWordPts = 0;
	}

}

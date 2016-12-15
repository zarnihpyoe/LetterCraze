package model;

public class Puzzle extends Level {

	private final int wordLimit;
	private int currentMoveCount;
	private int removedWordPts;
	
	public Puzzle(int lvl, Board board, ScoreBoard scoreBoard, int wordLimit) {
		super(lvl, board, scoreBoard);
		this.wordLimit = wordLimit;
	}

	@Override
	public boolean removeWord() {
		boolean isValidWord  = board.getSelectedTiles().isValid();
		if(isValidWord) {
			removedWordPts = board.getSelectedTiles().getPoints();
			board.removeSelectedWord();
			board.populateEmptyTiles();
		}
		return isValidWord;
	}
	
	@Override
	public int updateScore() {
		removedWordPts = board.getSelectedTiles().getPoints();
		System.out.println(removedWordPts);
		return scoreBoard.updateScore(removedWordPts);
		
	}

	@Override
	public boolean isComplete(int numWords) {
		return numWords == wordLimit;
	}

	public int getWordLimit() { return wordLimit; }
	public int getCurrentMoveCount() { return currentMoveCount; }
	public int getRemovedWordPts() { return removedWordPts; }

	
	@Override
	public void reset() {
		super.reset();
		this.board.cleanUp();
		this.board.populateEmptyTiles();
		this.scoreBoard.resetScore();
		this.removedWordPts = 0;
	}
	
	public void buildFromMemento(PuzzleMemento pMemento){
		this.currentMoveCount = pMemento.getCurrentMoveCount();
		this.removedWordPts = pMemento.getRemovedWordPts();
		this.board = pMemento.getBoard();
		this.scoreBoard =  pMemento.getScoreBoard();
		this.numRemovedWords = pMemento.getNumRemovedWords();
	}


}

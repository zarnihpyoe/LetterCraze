package model;

public class PuzzleMemento extends LevelMemento{
	
	private int currentMoveCount;
	private int removedWordPts;
	
	public PuzzleMemento(Board board, ScoreBoard scoreBoard, int numRemovedWords, int wordLimit,
			int currentMoveCount, int removedWordPts) {
		
		super(board, scoreBoard, numRemovedWords);
		this.currentMoveCount = currentMoveCount;
		this.removedWordPts = removedWordPts;
	}
	
	public PuzzleMemento(){
		super();
	};
	
	public void buildFromPuzzle(Puzzle p, Board b){
		this.board = b;
		this.scoreBoard = p.getScoreBoard();
		this.numRemovedWords = p.getNumRemovedWords();
		this.currentMoveCount = p.getCurrentMoveCount();
		this.removedWordPts = p.getRemovedWordPts();
	}

	public int getCurrentMoveCount() { return currentMoveCount; }
	public int getRemovedWordPts() { return removedWordPts; }
	
	

}

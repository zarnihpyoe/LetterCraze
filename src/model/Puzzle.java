package model;

public class Puzzle extends Level {

	public Puzzle(Board board, ScoreBoard scoreBoard) {
		super(board, scoreBoard);
	}

	@Override
	public int updateScore() {
		return scoreBoard.updateScore(
				board.selectedTiles.getPoints());
	}

}

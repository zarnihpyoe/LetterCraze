package model;

public class Puzzle extends Level {

	public Puzzle(int lvl, Board board, ScoreBoard scoreBoard) {
		super(lvl, board, scoreBoard);
	}

	@Override
	public int updateScore() {
		return scoreBoard.updateScore(
				board.selectedTiles.getPoints());
	}

}

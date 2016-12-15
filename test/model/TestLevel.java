package model;

import junit.framework.TestCase;

public class TestLevel extends TestCase {
	
	
	@Override
	protected void setUp() {
	
	}

	@Override
	protected void tearDown() {
		
	}
	
	public Board createBoard() {
		Tile[][] tiles = new Tile[6][6];
		// initial 
		for(int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				tiles[i][j] = new Tile(i, j);
				tiles[i][j].setLetter(LetterBank.EMPTY);
			}
		}
		// link the tiles
		for(int i=0; i<5; i++) {		// a little hack here
			for (int j=0; j<6; j++) {
				tiles[i][j].linkWith(tiles[i+1][j]);
			}
		}
		return new Board(tiles);
	}
	
	public void testPuzzleLevel() {
		Board b = createBoard();
		ScoreBoard sb = new ScoreBoard(8, 10, 12, 10);
		Level puzzle = new Puzzle(1, b, sb, 50);
		
		assertEquals(1, puzzle.getLvl());
		// unlocked for level 1
		assertFalse(puzzle.isLocked());
		
		assertEquals(0, puzzle.getNumRemovedWords());
		puzzle.updateNumRemovedWords(1);
		assertEquals(1, puzzle.getNumRemovedWords());
		puzzle.updateNumRemovedWords(-1);
		assertEquals(0, puzzle.getNumRemovedWords());
		
		Tile t1 = b.tiles[0][0];
		Tile t2 = b.tiles[1][1];
		Tile t3 = b.tiles[0][2];

		t1.setLetter("D");
		t2.setLetter("O");
		t3.setLetter("G");
		// selecting DOG
		b.selectTile(t1).selectTile(t2).selectTile(t3);
		if(b.selectedTiles.isValid()) {
			puzzle.updateScore();		// call this before removeSelectedWord because we don't know the score after we removed the word
			b.removeSelectedWord();
		}
		assertEquals(9, puzzle.getScoreBoard().getScore());
		assertEquals(1, puzzle.getScoreBoard().getStars());
	}

}

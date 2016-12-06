package model;

import junit.framework.TestCase;

public class TestBoard extends TestCase {

	Tile[][] tiles;

	@Override
	protected void setUp() {
		tiles = new Tile[6][6];
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
	}

	@Override
	protected void tearDown() {

	}

	public void testPopulateEmptyTiles() {
		Board b = new Board(tiles);
		b.populateEmptyTiles();
		for(int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				assertFalse(tiles[i][j].isEmpty());
			}
		}

	}

	public void testHorizontalRemoveSelectedWord() {
		Board b = new Board(tiles);
		Tile t1 = b.tiles[0][0];
		Tile t2 = b.tiles[1][1];
		Tile t3 = b.tiles[0][2];

		t1.setLetter("D");
		t2.setLetter("O");
		t3.setLetter("G");

		// selecting "DOG"
		b.selectTile(t1).selectTile(t2).selectTile(t3);
		b.removeSelectedWord();
		assertTrue(t1.isEmpty());
		assertTrue(t2.isEmpty());
		assertTrue(t3.isEmpty());
	}

	public void testVerticalRemoveSelectedWord() {
		Board b = new Board(tiles);
		Tile t1 = b.tiles[0][0];
		Tile t2 = b.tiles[1][0];
		Tile t3 = b.tiles[2][0];
		Tile t4 = b.tiles[3][0];
		Tile t5 = b.tiles[4][0];
		Tile t6 = b.tiles[5][0];

		t1.setLetter("D");
		t2.setLetter("O");
		t3.setLetter("G");
		t4.setLetter("O");
		t5.setLetter("D");

		// selecting "GOD"
		b.selectTile(t3).selectTile(t2).selectTile(t1);
		b.removeSelectedWord();
		b.populateEmptyTiles();
		assertEquals("O", t1.getCharacter());
		assertEquals("D", t2.getCharacter());
		assertFalse(t3.isEmpty());
		assertFalse(t4.isEmpty());
		assertFalse(t5.isEmpty());
	}

}

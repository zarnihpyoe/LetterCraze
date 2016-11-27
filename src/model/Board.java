package model;

import java.util.ArrayList;

public class Board {
	Tile[][] tiles = new Tile[6][6];
	Word selectedTiles;
	
	public Board(Tile[][] tiles) {
		this.tiles = tiles;
		selectedTiles = new Word();
	}
	
	public Word selectTile(Tile tile) {
		return selectedTiles.add(tile);
	}
	
	public Word selectTiles(ArrayList<Tile> tiles) {
		return selectedTiles.addAll(tiles);
	}
	
	public Board applyGravity() {
		// Float up tiles
		for(int i=0; i<6; i++) {
			tiles[i][0].receiveFloatUpLetter();
		}
		return this;
	}
	
	/** Usually call after <code>applyGravity()</code> */
	public Board populateEmptyTiles() {
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				Tile tile = tiles[i][j];
				if(tile.isEmpty()) { tile.setRandLetter(); }
			}
		}
		return this;
	}
	
	
	
	
}

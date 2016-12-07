package model;

import java.util.ArrayList;

public class Board {
	protected Tile[][] tiles = new Tile[6][6];
	protected Word selectedTiles;
	
	public Board(Tile[][] tiles) {
		this.tiles = tiles;
		this.selectedTiles = new Word();
	}
	
	public Board selectTile(Tile tile) {
		selectedTiles.add(tile);
		return this;
	}
	
	public Board selectTiles(ArrayList<Tile> tiles) {
		selectedTiles.addAll(tiles);
		return this;
	}
	
	public Board removeSelectedWord() {
		for(Tile tile : selectedTiles.getSelectedTiles()) {
			tiles[tile.getX()] [tile.getY()].removeLetter();
		}
		selectedTiles.clear();
		applyGravity();
		return this;
	}
	
	protected Board applyGravity() {
		// Float up tiles
		for(int i=0; i<6; i++) {
			//tiles[i][0].receiveFloatUpLetter();
			tiles[i][0].colGravity();
		}
		return this;
	}
	
	/** Usually call after <code>removeSelectedWord()</code> */
	public Board populateEmptyTiles() {
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				Tile tile = tiles[i][j];
				if(tile.isEmpty()) { tile.setRandLetter(); }
			}
		}
		return this;
	}

	public Tile[][] getTiles() {
		return tiles;
	}

	public Word getSelectedTiles() {
		return selectedTiles;
	}
	
	
	
	
}

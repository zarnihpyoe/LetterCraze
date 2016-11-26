package model;

import java.util.ArrayList;

public class Board {
	Tile[] [] tiles = new Tile[6] [6];
	Word selectedTiles;
	
	public Board(Tile[] [] tiles) {
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
		// TODO : Float up tiles
		return this;
	}
	
	public Board populateEmptyTiles() {
		// TODO : Fill up the empty tiles with random letters
		return this;
	}
	
	
	
	
}

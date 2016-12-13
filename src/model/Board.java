package model;

import java.util.ArrayList;

public class Board {
	protected Tile[][] tiles = new Tile[6][6];
	protected Word selectedTiles;
	
	public Board(Tile[][] tiles) {
		this.tiles = tiles;
		this.selectedTiles = new Word();
	}
	
	public Board() {
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				tiles[i][j] = new Tile(i, j);
			}
		}
		this.selectedTiles = new Word();
	}
	
	public void disableTile(int row, int col) {
		tiles[row][col] = null;
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
	
	public void cleanUp() {
		for (int i=0; i < 6; i++) {
			for (int j=0; j < 6; j++) {
				tiles[i][j].removeLetter();;
			}
		}
		selectedTiles = new Word();
	}
	
	// doesn't work with custom boards.. need to fix!
	public boolean populateTilesForTheme(ArrayList<String> wordList) {
		int lettCnt = 0;
		for(String word : wordList) {
			lettCnt+=word.length();
		}
		if(lettCnt > 36) {return false;}			
		
		for(String word : wordList) {
			char[] charArray = word.toCharArray();
			int i = 0;
			int j = 0;
			for(char c : charArray) {
				tiles[i][j].setLetter(String.valueOf(c));
				if(j==5 && i%2 == 0 || j==0 && i%2 != 0) i++;		// if at the either end of the row, go to next tile below
				else if(i%2 == 0) j++;													// if at the even index row, go to next tile to the right
				else if(i%2 != 0) j--;													// if at the odd index row, go to next tile to the left
			}
		}
		return true;
	}
	
	
	public void linkTiles() {
		for(int j=0; j<6; j++) {
			Tile pre = tiles[0][j];
			for(int i=1; i<6; i++) {
				if(tiles[i][j] != null) {
					tiles[i][j].linkWith(pre);
					pre = tiles[i][j];
				}
			}
		}
	}
	
	
}

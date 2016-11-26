package model;

import java.util.ArrayList;

public class Word {
	ArrayList<Tile> selectedTiles;
	
	public Word() {
		selectedTiles = new ArrayList<>();
	}

	public Word add(Tile newTile) {
		selectedTiles.add(newTile);
		return this;
	}

	public Word addAll(ArrayList<Tile> newTiles) {
		selectedTiles.addAll(newTiles);
		return this;
	}

	public String getString() {
		String str = "";
		for(Tile tile : selectedTiles) {
			str += tile.getCharacter();
		}
		return str;
	}

	public boolean isValid() {
		return isValidLen() && isValidPos() && isValidWord();
	}

	public boolean isValidInTheme(ArrayList<String> wordList) {
		return isValidLen() && isInWordList(wordList);
	}

	public int getPoints() {
		// sanity check
		if(!isValid()) {return 0;}
		// count them
		int points = 0;
		for(Tile tile : selectedTiles) {
			points += tile.getLetter().getWeight(); 
		}
		return points;
	}

	private boolean isValidLen() {
		return selectedTiles.size() > 2;
	}

	private boolean isValidPos() {
		// TODO : Check the position of the tiles according to the order
		return false;
	}

	private boolean isValidWord() {
		String word = getString();
		// TODO : Check word with the dictionary
		return false;
	}

	private boolean isInWordList(ArrayList<String> wordList) {
		String word = getString();
		// TODO : Check word in the wordList
		return false;
	}

}

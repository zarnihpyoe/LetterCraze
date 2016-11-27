package model;

import java.util.ArrayList;

public class Word {
	private ArrayList<Tile> selectedTiles;
	
	public Word() {
		selectedTiles = new ArrayList<>();
	}

	public ArrayList<Tile> getSelectedTiles() {
		return selectedTiles;
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
		// Check the position of the tiles according to the order
		for(int i=1; i<selectedTiles.size(); i++) {
			Tile prev = selectedTiles.get(i-1);
			Tile curr = selectedTiles.get(i);
			if(!prev.isAdjacent(curr)) { return false; }
		}
		return true;
	}

	private boolean isValidWord() {
		String theWord = getString();
		// TODO : Check word with the dictionary
		return true;
	}

	private boolean isInWordList(ArrayList<String> wordList) {
		String theWord = getString();
		for (String word : wordList) {
			if(theWord.equalsIgnoreCase(word)) { return true; }
		}
		return false;
	}

}

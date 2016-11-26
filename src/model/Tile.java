package model;

public class Tile {
	private Letter letter;
	private final int x;
	private final int y;
	
	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Letter getLetter() { return letter; }

	public int getX() { return x; }

	public int getY() { return y; }

	public boolean setLetter(Letter letter) {
		this.letter = letter;
		return false;
	}

	public boolean setLetter(String character) {
		// TODO : Get Letter from LetterBank and set it to letter attribute
		return false;
	}
	
	public boolean setRandLetter() {
		// TODO : Get randomLetter from LetterBank and set it to letter attribute
		return false;
	}
	
	public boolean removeLetter() {
		letter = new Letter(" ", 0);
		return false;
	}
	
	public String getCharacter() {
		return letter.getCharacter();
	}
	
	public boolean isAdjacent(Tile otherTile) {
		// TODO : Check if otherTile is within +/- 1 of x and y
		return false;
	}
	
}

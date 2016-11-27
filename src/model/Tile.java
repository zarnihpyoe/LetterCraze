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

	public void setLetter(Letter letter) {
		this.letter = letter;
	}

	public void setLetter(String character) {
		letter = LetterBank.getInstance().getLetter(character);
	}
	
	public void setRandLetter() {
		letter = LetterBank.getInstance().genRandLetter();
	}
	
	public void removeLetter() {
		letter = new Letter(" ", 0);
	}
	
	public Letter extractLetter() {
		Letter oldLet = letter;
		removeLetter();
		return oldLet;
	}
	
	public String getCharacter() {
		return letter.getCharacter();
	}
	
	public boolean isAdjacent(Tile otherTile) {
		// Check if otherTile is within +/- 1 of x and y but not itself
		return Math.abs(x-otherTile.getX()) == 1 && y-otherTile.getY() == 0 ||	// left right cells
						Math.abs(y-otherTile.getY()) == 1 && x-otherTile.getX() == 0 ||	// top bottom cells
							(Math.abs(x-otherTile.getX()) == 1 && Math.abs(y-otherTile.getY()) == 1);	// diagonal cells
	}
	
}

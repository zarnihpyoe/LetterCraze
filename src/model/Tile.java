package model;

public class Tile {
	private Letter letter;
	private final int x;
	private final int y;

	private final Tile predecessor;
	private final Tile successor;

	public Tile(int x, int y, Tile predecessor, Tile successor) {
		this.x = x;
		this.y = y;
		this.predecessor = predecessor;
		this.successor = successor;
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
		letter = LetterBank.EMPTY;
	}

	public Letter extractLetter() {
		Letter oldLet = letter;
		removeLetter();
		return oldLet;
	}

	public boolean isEmpty() {
		return letter.isEqual(LetterBank.EMPTY);
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

	public boolean floatUpLetter() {
		if (isEmpty()) {
			if(predecessor == null) { return false; }							// no predecessor anymore
			if(!predecessor.floatUpLetter()) { return false; }		// no non-empty Tiles below
		}
		if(successor == null) { return false; }			// nothing above.. No such case but still..
		successor.setLetter(extractLetter());
		return true;
	}

	public void receiveFloatUpLetter() {
		if(predecessor == null) { return; }							// nothing we can do if there is no predecessor
		
		if (isEmpty()) { 
			if(!predecessor.floatUpLetter()) {return; }		// no non-empty Tiles below, so won't waste time to float up for its predecessors
		}
		predecessor.receiveFloatUpLetter();
	}

}

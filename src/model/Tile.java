package model;

public class Tile {
	private Letter letter;
	private final int x;
	private final int y;

	private Tile predecessor = null;
	private Tile successor = null;

	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void linkWith(Tile predecessor) {
		this.predecessor = predecessor;
		predecessor.successor = this;

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
	
	public int floatUp() throws Exception{
		int first = this.getX();
		
		if(isEmpty()) {
			if(predecessor == null) { throw new Exception(); }		// if at the bottom tile
			first = predecessor.floatUp();
		}
		successor.setLetter(extractLetter()); //extractLetter()
		this.setLetter(LetterBank.EMPTY);

		//return the int coordinate of the earliest one to move
		return first;
	}
	
	public int applyGravity() throws Exception{
		
		
		if (this != null && this.isEmpty()){
			//System.out.println(this.getX() + " " + predecessor.getX());
			return predecessor.floatUp();
		}
		
		
		throw new Exception();
	}
	
	/*
	public void colGravity() throws TraceException{
		if(predecessor == null) {
			return;
		}
		// now we know that this is not the last tile
		if(isEmpty()) {
			//throw some kind of update expression
			int first = predecessor.floatUp();
			throw new TraceException(first, this.getY(), this.getX());
		}
		predecessor.colGravity();
	}
	*/
	

/*
	public boolean floatUpLetter() {
		if (isEmpty()) {
			if(predecessor == null) { return false; }							// no predecessor anymore
			if(!predecessor.floatUpLetter()) { return false; }		// no non-empty Tiles below
		}
		if(successor == null) { return false; }			// nothing above.. 
		successor.setLetter(extractLetter());
		if(predecessor !=null) {
			predecessor.floatUpLetter();		// recursive call (tentative)
		}
		return true;
	}

/*
	public void receiveFloatUpLetter() {
		if(predecessor == null) { return; }							// nothing we can do if there is no predecessor

		if (isEmpty()) { 
			if(!predecessor.floatUpLetter()) {return; }		// no non-empty Tiles below, so won't waste time to float up for its predecessors
		}
		predecessor.receiveFloatUpLetter();
	}
*/

}

package model;

public class Letter {
	private final String character;
	private final int weight;
	
	public Letter(String character, int weight) {
		this.character = character;
		this.weight = weight;
	}

	public String getCharacter() { return character; }

	public int getWeight() { return weight; }

	public boolean isEqual(Letter letter) {
		// TODO : if the given letter is equal to this
		return false;
	}
	
}

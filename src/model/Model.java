package model;

public class Model {

	public Level currentLevel;
	
	public Model() {}
	
	// To assign new level to the field
	public void assignLevel(Level newLevel) {
		this.currentLevel = newLevel;
	}
	
	// To reset model to null 
	public void resetLevel() {
		this.currentLevel = null;
	}

	public Level getCurrentLevel() { return currentLevel; }
	
}

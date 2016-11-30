package model;

public class Model {

	private Level currentLevel;
	
	public Model() {
		this.currentLevel = null;
	}
	
	// To assign new level to the field
	public void assignLevel(Level newLevel) {
		this.currentLevel = newLevel;
	}
	
	// To reset model to null 
	public void resetLevel() {
		this.currentLevel = null;
	}
	
	
}

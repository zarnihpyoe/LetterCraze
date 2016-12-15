package model;

import java.util.ArrayList;

public class Model {

	public Level currentLevel;
	public ArrayList<LevelMemento> saves = new ArrayList<LevelMemento>();
	
	public Model() {}
	
	// To assign new level to the field
	public void assignLevel(Level newLevel) {
		this.currentLevel = newLevel;
	}
	
	public void addSave(LevelMemento lm){
		saves.add(lm);
	}
	
	public LevelMemento removeSave(){
		return saves.remove(saves.size()-1);
	}
	
	// To reset model to null 
	public void resetLevel() {
		this.currentLevel = null;
	}

	public Level getCurrentLevel() { return currentLevel; }
	
}

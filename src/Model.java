//this could be the model class for the builder
public class Model {
	
	//can have a levelbuilder, or null
	AbsLevelBuilder currentLevelBuilder;
	
	Model(){};
	
	public void openNewBuilder(AbsLevelBuilder targetBuilder){};
	
	public void clearCurrentBuilder(){};
}



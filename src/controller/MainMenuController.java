package controller;

public class MainMenuController {
	Model m;
	Application a;
	
	MainMenuController(Model m, Application a){
		this.m = m;
		this.a = a;
	}
	
	public void mousePressed(MouseEvent me){
		//first, make sure the button was pressed itself
		//then, revert the model's level builder object back to null;
		m.releaseCurrentBuilder();
		//finally, switch to the main menu panel
		a.switchPanels(new MainMenuPanel());
	}
}

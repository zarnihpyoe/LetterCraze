package controllers;

import boundary.Application;
import model.Model;


// NEEDS TO BE CALLED WHEREVER YOU WANT AN UNDO POINT
public class SaveCurrentStateController {
	Model m;
	Application a;
	
	SaveCurrentStateController(Model m, Application a){
		this.m = m;
		this.a = a;
	}
	
	public void saveState(){
		m.getCurrentLevel().getPreviousStates().add(m.getCurrentLevel());
	}

}

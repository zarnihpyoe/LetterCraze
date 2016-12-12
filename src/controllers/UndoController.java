package controllers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import boundary.Application;
import model.Level;
import model.Model;

public class UndoController extends MouseAdapter{
	Application app;
    Model model;
	
	public UndoController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		ArrayList<Level> states = model.getCurrentLevel().getPreviousStates();
		if (states.size() == 0){ return; }
		model.assignLevel(states.get(states.size() - 1));
		
		//refresh the boundaries
	}
}
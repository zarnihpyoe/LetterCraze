package controllers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.Application;
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
		
	}
}
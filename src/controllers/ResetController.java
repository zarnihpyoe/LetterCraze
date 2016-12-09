package controllers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import boundary.Application;
import model.Model;

public class ResetController extends MouseAdapter {
	Application app;
    Model model;
	
	public ResetController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		
	}
}

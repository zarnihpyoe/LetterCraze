package controllers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import boundary.Application;
import boundary.PuzzlePlayerPanel;
import model.Level;
import model.LevelMemento;
import model.Model;
import model.Puzzle;
import model.PuzzleMemento;

public class UndoController extends MouseAdapter{
	Application app;
    Model model;
	
	public UndoController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		
		if (model.getCurrentLevel() instanceof Puzzle){
			Puzzle p = (Puzzle) model.getCurrentLevel();
			//model.saves.get(0).getBoard().printBoard();
			PuzzleMemento pMemento = (PuzzleMemento) model.removeSave();
			pMemento.getBoard().printBoard();
			p.buildFromMemento(pMemento);
		}
		
		if (app.getCurrentPanel() instanceof PuzzlePlayerPanel){
			PuzzlePlayerPanel panel = (PuzzlePlayerPanel) app.getCurrentPanel();
			//panel.getBoard().updateBoard(model.getCurrentLevel().getBoard());
			panel.update();
		}
		
		//refresh the boundaries
	}
}
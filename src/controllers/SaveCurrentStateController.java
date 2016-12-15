package controllers;

import boundary.Application;
import model.Board;
import model.Level;
import model.Model;
import model.Puzzle;
import model.PuzzleMemento;


// NEEDS TO BE CALLED WHEREVER YOU WANT AN UNDO POINT
public class SaveCurrentStateController {
	Model m;
	Application a;
	Board b;
	
	SaveCurrentStateController(Model m, Application a, Board b){
		this.m = m;
		this.a = a;
		this.b = b;
	}
	
	public void saveState(){
		if(m.getCurrentLevel() instanceof Puzzle){
			Puzzle p = (Puzzle) m.getCurrentLevel();
			PuzzleMemento pMemento = new PuzzleMemento();
			pMemento.buildFromPuzzle(p, b);
			m.addSave(pMemento);
		}
	}

}

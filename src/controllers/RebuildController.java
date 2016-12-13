package controllers;

import java.util.ArrayList;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import boundary.AnimationPanel;
import boundary.Application;
import boundary.PuzzlePlayerPanel;
import boundary.TraceableBoardPanel;
import model.Board;
import model.LetterBank;
import model.Level;
import model.Lightning;
import model.Model;
import model.Puzzle;
import model.Theme;
import model.Tile;
import model.Word;

public class RebuildController {
	
	Model m;
	Application a;
	JLayeredPane layeredPane;
	AnimationPanel animationPanel;
	TraceableBoardPanel tb;
	Board b;
	//Application a;
	
	RebuildController(Model m, Application a, TraceableBoardPanel tb){
		this.m = m;
		this.a = a;
		this.tb = tb;
		this.layeredPane = tb.getLayeredPane();
		this.animationPanel = tb.getAnimationPanel();

	}
	
	public void rebuildBoard(){
		Board b = m.getCurrentLevel().getBoard();
		
		if (b.getSelectedTiles().isValid()){
			rebuildLevel();
			b.removeSelectedWord();
		}
		b.getSelectedTiles().clear();
		
		ArrayList<BoardAnimation> animations = new ArrayList<BoardAnimation>();
		ArrayList<BoardAnimation> refill_animations = new ArrayList<BoardAnimation>();
		
		b.printBoard();
		System.out.println();
		tb.updateBoard(b);
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++){
				try{
					int source = b.getTiles()[i][j].applyGravity();
					animations.add(new BoardAnimation(source, i, j, b));
				}
				catch (Exception e){}
				}
			}
		
		for (BoardAnimation a: animations){
			tb.clearButton(a.row, a.start_tile);
		}
		
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				if (b.getTiles()[i][j].populateEmptyTile()){
					refill_animations.add(new BoardAnimation(-1, i, j, b));
				}
			}
		}

		b.printBoard();
		System.out.println();

		
		int current_lowest = 5;
		for (BoardAnimation a: refill_animations){
			if (a.finish_tile < current_lowest){
				current_lowest = a.finish_tile;
			}
		}
		
		for (BoardAnimation a: refill_animations){
			a.adjustAnimation(current_lowest);
			animations.add(a);
		}
		
		AnimationPanel aPanel = animationPanel;
		for (BoardAnimation a: animations){
			a.buildAnimation(aPanel);
		}

		aPanel.runAnimations(tb, b);
	}
	
	public void rebuildLevel(){
		Level l = m.getCurrentLevel();
		l.updateNumRemovedWords(1);
		l.updateScore();
		
		if (a.getCurrentPanel() instanceof PuzzlePlayerPanel){
			((PuzzlePlayerPanel) a.getCurrentPanel()).update();
		}
			
	}
	
}


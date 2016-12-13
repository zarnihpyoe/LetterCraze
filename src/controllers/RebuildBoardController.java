package controllers;

import java.util.ArrayList;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import boundary.AnimationPanel;
import boundary.Application;
import boundary.TraceableBoardPanel;
import model.Board;
import model.LetterBank;
import model.Model;
import model.Tile;
import model.Word;

public class RebuildBoardController {
	
	Model m;
	JLayeredPane layeredPane;
	AnimationPanel animationPanel;
	TraceableBoardPanel tb;
	//Application a;
	
	RebuildBoardController(Model m, TraceableBoardPanel tb){
		this.m = m;
		this.tb = tb;
		this.layeredPane = tb.getLayeredPane();
		this.animationPanel = tb.getAnimationPanel();

	}
	
	public void rebuildBoard(){
		
		
		Tile[][] tiles;
		tiles = new Tile[6][6];
		// initialize 
		for(int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				tiles[i][j] = new Tile(i, j);
				tiles[i][j].setLetter("B");
			}
		}
		for (int k = 0; k < 6; k++){
			//tiles[4][k] = new Tile(0, k); 
			tiles[k][1].setLetter(LetterBank.EMPTY);
			tiles[4][k].setLetter(LetterBank.EMPTY);
			tiles[2][k].setLetter(LetterBank.EMPTY);

		}
		for (int k = 0; k < 6; k++){
			//tiles[4][k] = new Tile(0, k); 
			
		}
		// link the tiles
		for(int i=0; i<5; i++) {		// a little hack here
			for (int j=0; j<6; j++) {
				tiles[i][j].linkWith(tiles[i+1][j]);
			}
		}
		Board b = new Board(tiles);
		
		/*
		Board b = m.getCurrentLevel().getBoard();
		b.removeSelectedWord();
		//CHECK IF THE WORD IS VALID???
		*/
		
		//UPDATE THE BOARD
		//b.update();
		
		ArrayList<BoardAnimation> animations = new ArrayList<BoardAnimation>();
		ArrayList<BoardAnimation> refill_animations = new ArrayList<BoardAnimation>();
		
		b.printBoard();
		
		System.out.println();

		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++){
				try{
					int source = b.getTiles()[i][j].applyGravity();
					animations.add(new BoardAnimation(source, i, j, b));
				}
				catch (Exception e){	
				}
				//create new animation with i and j;
			}
		}
		
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				if (b.getTiles()[i][j].populateEmptyTile()){
					refill_animations.add(new BoardAnimation(-1, i, j, b));
				}
			}
		}

		b.printBoard();
		
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

		aPanel.runAnimations();
		//aPanel.clearAnimations();
		
		//UPDATE THE BOARD
		//b.update();
	}
}


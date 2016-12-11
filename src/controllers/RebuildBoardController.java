package controllers;

import java.util.ArrayList;

import boundary.AnimationPanel;
import boundary.Application;
import model.Board;
import model.LetterBank;
import model.Model;
import model.Tile;
import model.Word;

public class RebuildBoardController {
	
	Model m;
	//Application a;
	
	RebuildBoardController(Model m){
		this.m = m;
		//this.a = a;
	}
	
	public void rebuildBoardEntity(){
		
		Tile[][] tiles;
		tiles = new Tile[6][6];
		// initial 
		
		for(int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				tiles[i][j] = new Tile(i, j);
				tiles[i][j].setLetter("B");
			}
		}
		
		for (int k = 3; k < 6; k++){
			//tiles[4][k] = new Tile(0, k); 
			tiles[4][k].setLetter(LetterBank.EMPTY);
		}
		
		for (int k = 0; k < 4; k++){
			//tiles[4][k] = new Tile(0, k); 
			tiles[3][k].setLetter(LetterBank.EMPTY);
		}
		
		
		// link the tiles
		for(int i=0; i<5; i++) {		// a little hack here
			for (int j=0; j<6; j++) {
				tiles[i][j].linkWith(tiles[i+1][j]);
			}
		}
		Board b = new Board(tiles);
		
		
		
		ArrayList<BoardAnimation> animations = new ArrayList<BoardAnimation>();
		
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

		b.printBoard();
		System.out.println();
		
		AnimationPanel aPanel = new AnimationPanel(	);
		for (BoardAnimation a: animations){
			a.printAnimation();
			a.buildAnimation(aPanel);
			aPanel.runAnimations();
		}
	}
}


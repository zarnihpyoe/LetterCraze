package controllers;

import javax.swing.JLabel;
import javax.swing.JPanel;

import boundary.AnimationLabel;
import boundary.AnimationPanel;
import model.Board;
import model.Model;

public class BoardAnimation {
	
	int start_tile;
	int finish_tile;
	int row;
	String letter;
	Board board;
	
	
	BoardAnimation(int st, int ft, int r, Board b){
		this.start_tile = st;
		this.finish_tile = ft;
		this.row = r;
		this.board = b;
		this.letter = "";
	}

	public void printAnimation() {
		System.out.println("source: " + start_tile + " dest: " + finish_tile + " row: " + row);
	}

	public void buildAnimation(AnimationPanel panel) {
		letter = board.getTiles()[finish_tile][row].getCharacter();
		
		int x_pos = 32 + (row * 70);
		int start_pos = 20 + (start_tile * 70);
		int finish_pos = 20 + (finish_tile * 70);

		panel.addAnimation(x_pos, start_pos, finish_pos, letter);
		
	}

	public void adjustAnimation(int current_lowest) {
		start_tile = 6 + finish_tile - current_lowest;
		
	}

}

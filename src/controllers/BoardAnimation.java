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
	Board board;
	
	BoardAnimation(int st, int ft, int r, Board b){
		this.start_tile = st;
		this.finish_tile = ft;
		this.row = r;
		this.board = b;
	}

	public void printAnimation() {
		System.out.println("source: " + start_tile + " dest: " + finish_tile + " row: " + row);
	}

	public void buildAnimation(AnimationPanel panel) {
		
		int x_pos = 35 + (row * 70);
		int start_pos = 35 + (start_tile * 70);
		int finish_pos = 35 + (finish_tile * 70);

		panel.addAnimation(x_pos, start_pos, finish_pos);
		
	}

}

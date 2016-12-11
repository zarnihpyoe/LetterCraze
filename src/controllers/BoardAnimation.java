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
		//extend JLabel for some shenanigans
		//bring in model to find the string
		
		AnimationLabel object = new AnimationLabel();
		object.setText(board.getTiles()[start_tile][row].getCharacter());
		
		int x_pos = 35 + (row * 70);
		int start_pos = 35 + (start_tile * 70);
		int finish_pos = 35 + (finish_tile * 70);
		
		object.setCurrentY(start_pos);
		object.setFinalX(x_pos);
		object.setFinalY(finish_pos);
		object.setBounds(start_pos, x_pos, 30, 30);
		
		panel.addAnimation(object);
		
	}

}

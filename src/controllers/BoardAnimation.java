package controllers;

import javax.swing.JLabel;
import javax.swing.JPanel;
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

	public void buildAnimation(JPanel panel) {
		//extend JLabel for some shenanigans
		//bring in model to find the string
		JLabel object = new JLabel("");
		object.setText(board.getTiles()[start_tile][row].getCharacter());
		//bring in application to find the position
		object.setBounds(r);
		panel.add(object);
		
	}

}

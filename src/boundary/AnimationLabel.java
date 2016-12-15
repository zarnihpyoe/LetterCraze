package boundary;
import java.awt.Graphics;

import javax.swing.JLabel;

public class AnimationLabel extends JLabel{
	
	private int final_x;
	private int final_y;
	private int current_y;
	
	public AnimationLabel(){
		this.final_x = 0;
		this.final_y = 0;
		this.current_y = 0;
	}
	/*
	public void setText(String s){
		this.setText(s);
	}
	*/
	
	public int getFinalX(){
		return this.final_x;
	}
	public int getFinalY() {
		return this.final_y;
	}
	public int getCurrentY(){
		return this.current_y;
	}
	
	public void setValues(int a, int b, int c){
		this.final_x = a;
		this.final_y = c;
		this.current_y = b;
	}
	
	public void printLabel(){
		System.out.println("row: " + final_x + " target pos: " + final_y + " starting pos: " + current_y);
	}
	
	public void decrementCurrent(){
		this.current_y--;
	}
	
	public boolean reachedDestination(){
		return this.current_y == this.final_y;
	}

}

package boundary;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import controllers.BoardAnimation;

public class AnimationPanel extends JPanel {

	public ArrayList<AnimationLabel> animations;
	boolean check;

	public AnimationPanel() {
		setLayout(null);
		check = true;
		initialize();
	}

	public void initialize() {
		setLayout(null);
		animations = new ArrayList<AnimationLabel>();
	}

	public void addAnimation(int col, int start_row, int end_row, String letter) {
		AnimationLabel a = new AnimationLabel();
		a.setText(letter);
		a.setValues(col, start_row, end_row);
		a.setBounds(col, start_row, 30, 30);

		animations.add(a);
		add(a);
	}
	
	public void clearAnimations(){
		for (AnimationLabel a : animations) {
			remove(a);
		}
		repaint();
	}

	public void shiftComponents() {
		for (AnimationLabel a : animations) {
			if (a.getCurrentY() != a.getFinalY()){
				a.decrementCurrent();
				a.setBounds(a.getFinalX(), a.getCurrentY(), 30, 30);
			}
		}
	}
	
	public boolean checkIfFinished(){
		check = true;
		for (AnimationLabel a : animations) {
			check = check && (a.getCurrentY() == a.getFinalY());
		}
		return check;
	}

	public void runAnimations() {
		Timer timer = new Timer(10 , new MyTimerActionListener(this, check));
		
		timer.start();
		return;
	}

	class MyTimerActionListener implements ActionListener {
		AnimationPanel ap;
		
		MyTimerActionListener(AnimationPanel ap, boolean check){
			this.ap = ap;
		}
		
		public void actionPerformed(ActionEvent e) {
			Timer myTimer = (Timer) e.getSource();
			ap.shiftComponents();
			if (checkIfFinished()){
				myTimer.stop();
				ap.clearAnimations();
			}			
		}
		
	}
}

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
		JLabel label2 = new JLabel("jeffe");
		label2.setBounds(100, 100, 40, 40);
		add(label2);
		animations = new ArrayList<AnimationLabel>();
	}

	public void addAnimation(int col, int start_row, int end_row) {
		AnimationLabel a = new AnimationLabel();
		a.setText("B");
		a.setValues(col, start_row, end_row);
		a.setBounds(col, start_row, 30, 30);

		animations.add(a);
		add(a);
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
		
		if (!check) { timer.stop(); }
		timer.start();
		System.out.println("reached!");


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
			}
			System.out.println("going!");
			
		}
		
	}
}

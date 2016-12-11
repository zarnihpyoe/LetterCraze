package boundary;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import controllers.BoardAnimation;

public class AnimationPanel extends JPanel {

	ArrayList<AnimationLabel> animations;

	public AnimationPanel() {
		initialize();
	}

	public void initialize() {

	}

	public void addAnimation(AnimationLabel a) {
		animations.add(a);
		add(a);
	}

	@Override
	public void paintComponent(Graphics g) {
		for (AnimationLabel a : animations) {
			a.setBounds(a.getFinalX(), a.getCurrentY(), 30, 30);
		}
	}

	public void runAnimations() {
		boolean allArrived = false;
		while (!allArrived) {
			for (AnimationLabel a : animations) {
				if (a.getBounds().y < a.getFinalY()) {
					a.incrementCurrent();
				}
			}
			try {
				Thread.sleep(10);
			} catch (Exception exc) {
			}
			
			this.repaint();
			allArrived = true;
			for (AnimationLabel a : animations) {
				allArrived = allArrived && a.reachedDestination();
			}
		}
	}
}

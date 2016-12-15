package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;


import boundary.Application;
import boundary.LevelSelectPanel;
import boundary.LightningPlayerPanel;
import boundary.PuzzlePlayerPanel;
import boundary.ThemePlayerPanel;
import model.LevelMemento;
import model.Model;
import model.ScoreBoard;


public class ToMainMenuController extends MouseAdapter {
	Application app;
	Model model;

	public ToMainMenuController(Application a, Model m) {
		this.app = a;
		this.model = m;
	}

	public void mousePressed(MouseEvent me){

		LevelSelectPanel menuView = new LevelSelectPanel(this.app, this.model);
		model.resetLevel();

		app.modifyFrameSize(100, 100, 600, 500);
		app.switchPanel(menuView);

		SelectThemeLevelController.getWords().clear();
		updateMenuStars(menuView);
	}

	public void updateMenuStars(LevelSelectPanel menuView){

		//int stars = 0;
		//stars = model.saves.get(0).getScoreBoard().getHighScore(1);
		ScoreBoard board = new ScoreBoard(1,2,3,3);
		for (int i=0; i<15; i++){
			menuView.updateStars(i,board.getHighScore(i+1));
		}
	}


}

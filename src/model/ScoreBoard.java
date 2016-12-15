package model;

import java.util.ArrayList;
import java.util.HashMap;

public class ScoreBoard {
	private int stars;
	private int score;
	private final int scoreForFirstStar;
	private final int scoreForSecondStar;
	private final int scoreForThirdStar;
	private static HashMap<Integer, Integer> highScores = new HashMap<Integer, Integer>();
	private static int highScore = 0;
	private int level;

	public ScoreBoard(int scoreForFirstStar, int scoreForSecondStar, int scoreForThirdStar, int level) {
		this.stars = 0;
		this.score = 0;
		this.scoreForFirstStar = scoreForFirstStar;
		this.scoreForSecondStar = scoreForSecondStar;
		this.scoreForThirdStar = scoreForThirdStar;
		this.level = level;
	}

	public void fillBoard(){
		for(int i=0; i<15; i++){
			if(highScores.containsKey(i)){
				highScores.put(i,0);
			}
		}
	}

	public int updateScore(int delta) {
		score +=delta;
		updateStar();
		return score;
	}

	public int updateStar() {
		if(score >= scoreForThirdStar) { stars = 3; }
		else if(score >= scoreForSecondStar) { stars = 2; }
		else if(score >= scoreForFirstStar) { stars = 1; }
		else { stars = 0; }
		updateHighScores();
		return stars;
	}

	public void updateHighScores() {
		if (highScores.containsKey(level) == true && highScores.get(level) < stars) {
			highScores.put(level, stars);
		} else if (highScores.containsKey(level) == true && highScores.get(level) > stars) {
		} else {
			highScores.put(level, stars);
		}
	}

	public void resetScore() {
		stars = 0;
		score = 0;
	}

	public int getStars() { return stars; }

	public int getHighScore(int level) { if (highScores.containsKey(level)) {return highScores.get(level); } else return 0; }

	public int getScore() { return score; }

	public int getScoreForFirstStar() { return scoreForFirstStar; }

	public int getScoreForSecondStar() { return scoreForSecondStar; }

	public int getScoreForThirdStar() { return scoreForThirdStar; }
}

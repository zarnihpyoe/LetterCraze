package model;

public class ScoreBoard {
	private int stars;
	private int score;
	private final int scoreForFirstStar;
	private final int scoreForSecondStar;
	private final int scoreForThirdStar;
	
	
	public ScoreBoard(int scoreForFirstStar, int scoreForSecondStar, int scoreForThirdStar) {
		this.stars = 0;
		this.score = 0;
		this.scoreForFirstStar = scoreForFirstStar;
		this.scoreForSecondStar = scoreForSecondStar;
		this.scoreForThirdStar = scoreForThirdStar;
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
		return stars;
	}
	
	public void resetScore() {
		stars = 0;
		score = 0;
	}

	public int getStars() { return stars; }

	public int getScore() { return score; }

	public int getScoreForFirstStar() { return scoreForFirstStar; }

	public int getScoreForSecondStar() { return scoreForSecondStar; }

	public int getScoreForThirdStar() { return scoreForThirdStar; }
	
	
	
	
}

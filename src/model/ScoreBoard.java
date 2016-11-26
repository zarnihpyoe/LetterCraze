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
	
	public int updateScore(int delta) { return score +=delta; }
	
	public int updateStar() {
		if(score >= scoreForThirdStar) { stars = 3; }
		else if(score >= scoreForSecondStar) { stars = 2; }
		else if(score >= scoreForFirstStar) { stars = 1; }
		else { stars = 0; }
		return stars;
	}
}

package model;

import junit.framework.TestCase;

public class TestScoreBoard extends TestCase {

	ScoreBoard puzzleSB, lightningSB, themeSB;

	@Override
	protected void setUp() {
		puzzleSB = new ScoreBoard(150, 300, 450, 300);
		lightningSB = new ScoreBoard(10, 15, 20, 10);
		themeSB = new ScoreBoard(1, 2, 3, 15);
	}

	@Override
	protected void tearDown() {

	}

	public void testUpdateScore() {
		// test initial score
		assertEquals(0, puzzleSB.getScore());

		// increment score and test again
		puzzleSB.updateScore(8);
		assertEquals(8, puzzleSB.getScore());

		// decrement score and test again
		puzzleSB.updateScore(-8);
		assertEquals(0, puzzleSB.getScore());
	}
	
	public void testUpdateStar() {
		assertEquals(0, lightningSB.getStars());
		lightningSB.updateScore(10);
		assertEquals(1, lightningSB.getStars());
		lightningSB.updateScore(3);
		assertEquals(1, lightningSB.getStars());
		lightningSB.updateScore(5);
		assertEquals(2, lightningSB.getStars());
		lightningSB.updateScore(5);
		assertEquals(3, lightningSB.getStars());
		
	}

}

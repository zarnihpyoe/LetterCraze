package model;

import java.util.ArrayList;

import junit.framework.TestCase;

public class TestWord extends TestCase {

	Tile t1, t2, t3;
	Word word = new Word();

	@Override
	protected void setUp() {
		t1 = new Tile(0 ,0);
		t2 = new Tile(0, 1);
		t3 = new Tile(0, 2);
		//word.add(t1).add(t2).add(t3);
	}

	@Override
	protected void tearDown() {

	}

	public void testIsValid() {
		t1.setLetter("D");
		t2.setLetter("O");
		t3.setLetter("G");

		// valid position, valid length, valid word
		word.add(t1).add(t2).add(t3);
		assertTrue(word.isValid());
		assertEquals(9, word.getPoints());
		word.clear();

		// valid position, valid length, invalid word
		word.add(t2).add(t3).add(t1);
		assertFalse(word.isValid());
		word.clear();

		// for theme
		ArrayList<String> wordList = new ArrayList<String> ();
		wordList.add("class");
		wordList.add("inferface");
		wordList.add("god");

		// valid position, valid length, valid word
		word.add(t3).add(t2).add(t1);
		assertTrue(word.isValidInTheme(wordList));

		// valid position, valid length, invalid word
		word.add(t1).add(t2).add(t3);
		assertFalse(word.isValidInTheme(wordList));
	}
}

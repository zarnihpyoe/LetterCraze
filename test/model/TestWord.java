package model;

import junit.framework.TestCase;

public class TestWord extends TestCase {

	Word word = new Word();
	
	@Override
	protected void setUp() {
		Tile t1 = new Tile(0 ,0, null, null);
		t1.setLetter("d");
		Tile t2 = new Tile(0, 1, null, null);
		t2.setLetter("o");
		Tile t3 = new Tile(0, 2, null, null);
		t3.setLetter("g");
		word.add(t1).add(t2).add(t3);
	}

	@Override
	protected void tearDown() {
		
	}
	
	
/*	public void testIsValid() {
		assertTrue(word.isValid());
	}*/
}

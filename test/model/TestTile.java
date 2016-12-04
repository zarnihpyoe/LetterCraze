package model;

import junit.framework.TestCase;

public class TestTile extends TestCase {

	Tile t1, t2, tDiag, t3, t4;
	
	@Override
	protected void setUp() {
		t1 = new Tile(0, 0, t2, null);
		tDiag = new Tile(1, 1, null, null);
		t2 = new Tile(1, 0, t3, t1);
		t3 = new Tile(2, 0, null, t2);
		//t4 = new Tile(2, 0, null, null);
	}

	@Override
	protected void tearDown() {
		
	}
	
	public void testSetLetter() {
		t1.setLetter("D");
		assertEquals(t1.getCharacter(), "D");
		
		t2.setLetter(new Letter("Z", 6));
		assertEquals(t2.getCharacter(), "Z");
	}
	
	public void testRemoveAndExtractLetter() {
		testSetLetter();
		
		Letter l = t2.getLetter();
		t1.setLetter(t2.extractLetter());
		assertTrue(t1.getLetter().equals(l));
		assertTrue(t2.getLetter().equals(LetterBank.EMPTY));
		assertTrue(t2.isEmpty());
	}
	
	public void testAdjacency() {
		assertTrue(t2.isAdjacent(t1));
		assertTrue(t1.isAdjacent(t2));
		assertTrue(t1.isAdjacent(tDiag));
		assertFalse(t1.isAdjacent(t3));
		
	}
	
	public void testFloatUpLetter() {
		t1.setLetter(LetterBank.EMPTY);
		t2.setLetter("A");
		t3.setLetter(LetterBank.EMPTY);
		
		assertFalse(t1.floatUpLetter());
		assertTrue(t1.isEmpty());
		
		t2.floatUpLetter();
		assertEquals("A", t1.getCharacter());
		assertTrue(t2.isEmpty());
		
		assertFalse(t3.floatUpLetter());
		assertTrue(t2.isEmpty());
		assertTrue(t3.isEmpty());
		
		assertFalse(t1.floatUpLetter());
		assertEquals("A", t1.getCharacter());
	}
	
	public void testReceiveFloatUpLetter() {
		t1.setLetter(LetterBank.EMPTY);
		t2.setLetter("A");
		t3.setLetter(LetterBank.EMPTY);
		
		t3.receiveFloatUpLetter();
		assertTrue(t3.isEmpty());
		
		t2.receiveFloatUpLetter();
		assertEquals("A", t2.getCharacter());
		
		t1.receiveFloatUpLetter();
		//assertEquals("A", t1.getCharacter());
	}
	
}

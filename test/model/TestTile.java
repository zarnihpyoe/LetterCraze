package model;

import junit.framework.TestCase;

public class TestTile extends TestCase {

	Tile t1, t2, tDiag, t3, t4;
	
	@Override
	protected void setUp() {
		t1 = new Tile(0, 0);
		tDiag = new Tile(1, 1);
		t2 = new Tile(1, 0);
		t3 = new Tile(2, 0);
		t4 = new Tile(3, 0);
		
		t1.linkWith(t2);
		t2.linkWith(t3);
		t3.linkWith(t4);
	}

	@Override
	protected void tearDown() {
		
	}
	
	private void setUp1() {
		t1.setLetter("A");
		t2.setLetter("B");
		t3.setLetter("C");
		t4.setLetter("D");
	}
	
	private void setUp2() {
		t1.setLetter("A");
		t2.setLetter("B");
		t3.setLetter("C");
		t4.setLetter(LetterBank.EMPTY);		
	}
	
	private void setUp3() {
		t1.setLetter(LetterBank.EMPTY);
		t2.setLetter("A");
		t3.setLetter("B");
		t4.setLetter("C");
	}
	
	private void setUp4() {
		t1.setLetter(LetterBank.EMPTY);
		t2.setLetter("A");
		t3.setLetter(LetterBank.EMPTY);
		t4.setLetter("B");
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
	
	/*public void testFloatUpLetter() {
		t1.setLetter(LetterBank.EMPTY);
		t2.setLetter("A");
		t3.setLetter(LetterBank.EMPTY);
		t4.setLetter("D");
		
		assertFalse(t1.floatUpLetter());
		assertEquals("A", t1.getCharacter());
		
		t2.floatUpLetter();
		assertEquals("D", t1.getCharacter());
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
		assertEquals("A", t1.getCharacter());
		
		
	}*/
	
/*	
	public void testFloatUp() {
		setUp1();
		
		if(t1.isEmpty()) {t2.floatUp();}
		if(t2.isEmpty()) {t3.floatUp();}
		if(t3.isEmpty()) {t4.floatUp();}
		assertEquals("A", t1.getCharacter());
		assertEquals("B", t2.getCharacter());
		assertEquals("C", t3.getCharacter());
		assertEquals("D", t4.getCharacter());
		
		setUp2();
		if(t1.isEmpty()) {t2.floatUp();}
		if(t2.isEmpty()) {t3.floatUp();}
		if(t3.isEmpty()) {t4.floatUp();}
		assertEquals("A", t1.getCharacter());
		assertEquals("B", t2.getCharacter());
		assertEquals("C", t3.getCharacter());
		assertTrue(t4.isEmpty());
		
		setUp3();
		if(t1.isEmpty()) {t2.floatUp();}
		if(t2.isEmpty()) {t3.floatUp();}
		if(t3.isEmpty()) {t4.floatUp();}
		assertEquals("A", t1.getCharacter());
		assertEquals("B", t2.getCharacter());
		assertEquals("C", t3.getCharacter());
		assertTrue(t4.isEmpty());
		
		setUp4();
		if(t1.isEmpty()) {t2.floatUp();}
		if(t2.isEmpty()) {t3.floatUp();}
		if(t3.isEmpty()) {t4.floatUp();}
		assertEquals("A", t1.getCharacter());
		assertEquals("B", t2.getCharacter());
		assertTrue(t3.isEmpty());
		assertTrue(t4.isEmpty());
	}
*/
	
	public void testColGravity() {
		setUp1();
		t1.colGravity();
		assertEquals("A", t1.getCharacter());
		assertEquals("B", t2.getCharacter());
		assertEquals("C", t3.getCharacter());
		assertEquals("D", t4.getCharacter());
		
		setUp2();
		t1.colGravity();
		assertEquals("A", t1.getCharacter());
		assertEquals("B", t2.getCharacter());
		assertEquals("C", t3.getCharacter());
		assertTrue(t4.isEmpty());
		
		setUp3();
		t1.colGravity();
		assertEquals("A", t1.getCharacter());
		assertEquals("B", t2.getCharacter());
		assertEquals("C", t3.getCharacter());
		assertTrue(t4.isEmpty());

		setUp4();
		t1.colGravity();
		assertEquals("A", t1.getCharacter());
		assertEquals("B", t2.getCharacter());
		assertTrue(t3.isEmpty());
		assertTrue(t4.isEmpty());
		
	}
	
	
}

package model;

import junit.framework.TestCase;

public class TestLetterBank extends TestCase {
	
	@Override
	protected void setUp() {
		
	}

	@Override
	protected void tearDown() {
		
	}
	
	public void testGetLetter() {
		Letter e = new Letter("Z", 8);
		Letter r = LetterBank.getInstance().getLetter("Z");
		assertEquals(e.getCharacter(), r.getCharacter());
		assertEquals(e.getWeight(), r.getWeight());
		assertTrue(e.isEqual(r));
	}
	
	public void testEmptyLetter() {
		Letter l = LetterBank.EMPTY;
		assertEquals("", l.getCharacter());
	}

}

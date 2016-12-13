package model;

import junit.framework.TestCase;

public class TestParseJsonLevel extends TestCase {
	
	@Override
	protected void setUp() {
		
	}

	@Override
	protected void tearDown() {
		
	}
	
	public void testParseLevel() {
		Level level = ParseJsonLevel.parseLevel(1);
		assertEquals(1, level.getLvl());
	}
	
}

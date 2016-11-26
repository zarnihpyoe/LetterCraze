package model;

import java.util.HashMap;

public class LetterBank {
	// using singleton
	private static LetterBank letterBank;
	private HashMap<String, Letter> letters = new HashMap<>();
	private final String[] chars;
	
	private LetterBank() {
		letters.put("E", new Letter("E", 1));
		letters.put("T", new Letter("T", 1));
		letters.put("A", new Letter("A", 2));
		letters.put("O", new Letter("O", 2));
		letters.put("I", new Letter("I", 2));
		letters.put("N", new Letter("N", 2));
		letters.put("S", new Letter("S", 2));
		letters.put("H", new Letter("H", 2));
		letters.put("R", new Letter("R", 2));
		letters.put("D", new Letter("D", 3));
		letters.put("L", new Letter("L", 3));
		letters.put("C", new Letter("C", 3));
		letters.put("U", new Letter("U", 3));
		letters.put("M", new Letter("M", 3));
		letters.put("W", new Letter("W", 3));
		letters.put("F", new Letter("F", 4));
		letters.put("G", new Letter("G", 4));
		letters.put("Y", new Letter("Y", 4));
		letters.put("P", new Letter("P", 4));
		letters.put("B", new Letter("B", 4));
		letters.put("V", new Letter("V", 5));
		letters.put("K", new Letter("K", 5));
		letters.put("J", new Letter("J", 7));
		letters.put("X", new Letter("X", 7));
		letters.put("Qu", new Letter("Qu", 8));
		letters.put("Z", new Letter("Z", 8));
		
		chars = letters.keySet().toArray(new String[letters.size()]);
	}
	
	public static LetterBank getInstance() {
		if(letterBank==null) {
			letterBank = new LetterBank();
		}
		return letterBank;
	}
	
	public Letter getLetter(String str) {
		return letters.getOrDefault(str, null);
	}
	
	public Letter genRandLetter() {
		int rand = 0;
		// TODO : generate random number 0 to 26 and set it to rand
		return letters.get(chars[rand]);
	}
	
	

}

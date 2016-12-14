package model;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Random;

public class LetterBank {
	// using singleton
	private static LetterBank letterBank;
	private static HashMap<String, Letter> letters = new HashMap<>();
	//private final String[] chars;
	private static TreeMap<Double, String> tree = new TreeMap<Double, String>();
	private static double weight = 0;
	private static Random random = new Random();
	//private static HashMap<String, Double> letterList;

	public static final Letter EMPTY = new Letter("", 0);

	static {
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

		addToTree(12.7, "E");
		addToTree(9.06, "R");
		addToTree(8.17, "A");
		addToTree(7.51, "O");
		addToTree(6.97, "I");
		addToTree(6.75, "N");
		addToTree(6.33, "S");
		addToTree(6.09, "H");
		addToTree(5.99, "R");
		addToTree(4.25, "D");
		addToTree(4.03, "L");
		addToTree(2.78, "C");
		addToTree(2.76, "U");
		addToTree(2.41, "M");
		addToTree(2.36, "W");
		addToTree(2.23, "F");
		addToTree(2.02, "G");
		addToTree(1.97, "Y");
		addToTree(1.93, "P");
		addToTree(1.49, "B");
		addToTree(0.98, "V");
		addToTree(0.77, "K");
		addToTree(0.15, "J");
		addToTree(0.15, "X");
		addToTree(0.10, "Qu");
		addToTree(0.07, "Z");
		//chars = letters.keySet().toArray(new String[letters.size()]);
	}

	public static void addToTree(Double freq, String s){
		tree.put(freq + weight, s);
		weight = weight + freq;
	}


	public static LetterBank getInstance() {
		if(letterBank==null) {
			letterBank = new LetterBank();
		}
		return letterBank;
	}

	public Letter getLetter(String str) {
		return letters.get(str);
	}


	public static Letter genRandLetter() {
		double rand = random.nextDouble() * weight;
		if (rand < weight && rand > 0){
			return letters.get(tree.ceilingEntry(rand).getValue());	
		} else { return letters.get(1); }
	}

	public int pointValue(String s){
		return letters.get(s).getWeight();
	}
}

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
		Letter e = new Letter("E", 1);
		letters.put("E", e);
		Letter t = new Letter("T", 1);
		letters.put("T", t);
		Letter a = new Letter("A", 2);
		letters.put("A", a);
		Letter o = new Letter("O", 2);
		letters.put("O", o);
		Letter i =  new Letter("I", 2);
		letters.put("I", i);
		Letter n =  new Letter("N", 2);
		letters.put("N", n);
		Letter s = new Letter("S", 2);
		letters.put("S", s);
		Letter h =  new Letter("H", 2);
		letters.put("H", h);
		Letter r = new Letter("R", 2);
		letters.put("R", r);
		Letter d = new Letter("D", 3);
		letters.put("D", d);
		Letter l = new Letter("L", 3);
		letters.put("L", l);
		Letter c = new Letter("C", 3);
		letters.put("C", c);
		Letter u = new Letter("U", 3);
		letters.put("U", u);
		Letter m = new Letter("M", 3);
		letters.put("M", m);
		Letter w = new Letter("W", 3);
		letters.put("W", w);
		Letter f =  new Letter("F", 4);
		letters.put("F", f);
		Letter g =  new Letter("G", 4);
		letters.put("G", g);
		Letter y = new Letter("Y", 4);
		letters.put("Y", y);
		Letter p = new Letter("P", 4);
		letters.put("P", p);
		Letter b =  new Letter("B", 4);
		letters.put("B", b);
		Letter v = new Letter("V", 5);
		letters.put("V", v);
		Letter k = new Letter("K", 5);
		letters.put("K", k);
		Letter j = new Letter("J", 7);
		letters.put("J", j);
		Letter x = new Letter("X", 7);
		letters.put("X", x);
		Letter qu = new Letter("Qu", 8);
		letters.put("Qu", qu);
		Letter z = new Letter("Z", 8);
		letters.put("Z", z);

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
		addToTree(0.10, "Q");
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

	public static int pointValue(String s){
		System.out.println("The letter is" + s);
		return letters.get(s).getWeight();
	}
}

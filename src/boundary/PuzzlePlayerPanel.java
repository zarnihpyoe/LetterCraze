package boundary;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import controllers.ResetController;
import controllers.ToMainMenuController;
import model.Board;
import model.LetterBank;
import model.Model;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JToggleButton;
import javax.swing.ImageIcon;

public class PuzzlePlayerPanel extends JPanel {

	private Application a;
	private Model m;
	private Board b;
	private int wordLimit;
	int level;
	int score = 0;

	private JButton btnMainMenu;
	private JButton btnReset;
	private ArrayList<JToggleButton> btnList = new ArrayList<JToggleButton>();

	public PuzzlePlayerPanel(Application a, Model m, Board b, int wordLimit, int level){
		this.a = a;
		this.m = m;
		this.b = b;
		this.wordLimit = wordLimit;
		this.level = level;
		initialize();
	}

	public void initialize() {
		initializeViews();
		initializeControllers();
	}
	
	//===================================================

	public void initializeViews() {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 11, 434, 361);
		add(panel);

		btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		btnMainMenu.setBounds(231, 11, 193, 35);
		panel.add(btnMainMenu);

		JLabel label = new JLabel("LEVEL " + level);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		label.setBounds(10, 11, 114, 35);
		panel.add(label);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 57, 293, 294);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 6, 0, 0));

		int q = 0;
		while(q<36){
			if(b.tiles != null){
				btnList.add(new JToggleButton(LetterBank.genRandLetter().getCharacter()));
				btnList.get(q).setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
				panel_1.add(btnList.get(q));
				q=q+1;
			}
		}

		JLabel label_1 = new JLabel("POINTS:");
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_1.setBounds(313, 292, 82, 26);
		panel.add(label_1);

		JButton button_1 = new JButton("UNDO");
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button_1.setBounds(313, 149, 111, 35);
		panel.add(button_1);

		btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnReset.setBounds(313, 195, 111, 35);
		panel.add(btnReset);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(313, 57, 111, 35);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_3);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_4);

		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_5);

		JButton btnRemoveWord = new JButton("REMOVE WORD");
		btnRemoveWord.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		btnRemoveWord.setBounds(313, 103, 111, 35);
		panel.add(btnRemoveWord);

		JLabel label_2 = new JLabel(Integer.toString(score));
		label_2.setBounds(313, 315, 111, 35);
		panel.add(label_2);
		label_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));

		JLabel lblMovesLeft = new JLabel("MOVES LEFT:");
		lblMovesLeft.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblMovesLeft.setBounds(313, 241, 111, 26);
		panel.add(lblMovesLeft);

		JLabel label_6 = new JLabel(Integer.toString(wordLimit));
		label_6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_6.setBounds(313, 260, 82, 26);
		panel.add(label_6);
	}

	private void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
		btnReset.addMouseListener(new ResetController(this.a, this.m));
	}

}

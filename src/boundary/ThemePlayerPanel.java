package boundary;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.ResetController;
import controllers.ToMainMenuController;
import controllers.UndoController;
import model.Model;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class ThemePlayerPanel extends JPanel {

	private Application a;
	private Model m;
	private int lvl;
	private JButton btnMainMenu;
	TraceableBoardPanel board;
	private JButton resetButton;
	private JButton undoButton;
	private ArrayList<String> words;
	
	private JLabel star_1;
	private JLabel star_2;
	private JLabel star_3;
	JLabel word1;
	JLabel word2;
	JLabel word3;
	private String theme;
	
	public ThemePlayerPanel(Application a, Model m, int lvl, String theme, ArrayList<String> words){
		this.a = a;
		this.m = m;
		this.lvl = lvl;
		this.theme = theme;
		this.words = words;
		initialize();
	}
	
	public void initialize(){
		initializeView();
		initializeControllers();
	}
	
	public int getLevel(){
		return lvl;
	}
	
	public void initializeView() {
		setLayout(null);
		int x_align = 485;

		
		JLabel label = new JLabel("LEVEL " + lvl);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		label.setBounds(10, 11, 114, 35);
		add(label);
		
		board = new TraceableBoardPanel(m, a);
		board.setBounds(10, 60, 420, 420);
		add(board);
		
		btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		btnMainMenu.setBounds(x_align-30, 11, 193, 35);
		add(btnMainMenu);

		undoButton = new JButton("UNDO");
		undoButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		undoButton.setBounds(455, 145, 111, 35);
		add(undoButton);

		resetButton = new JButton("RESET");
		resetButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		resetButton.setBounds(455, 190, 111, 35);
		add(resetButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(x_align, 57, 111, 35);
		add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		star_1 = new JLabel("");
		star_1.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		star_1.setHorizontalAlignment(SwingConstants.CENTER);
		star_1.setVisible(false);
		panel_3.add(star_1);

		star_2 = new JLabel("");
		star_2.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		star_2.setHorizontalAlignment(SwingConstants.CENTER);
		star_2.setVisible(false);
		panel_3.add(star_2);

		star_3 = new JLabel("");
		star_3.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		star_3.setHorizontalAlignment(SwingConstants.CENTER);
		star_3.setVisible(false);
		panel_3.add(star_3);
		
		JButton btnRemoveWord = new JButton("REMOVE WORD");
		btnRemoveWord.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		btnRemoveWord.setBounds(x_align, 103, 111, 35);
		add(btnRemoveWord);
		
		JLabel label_1 = new JLabel("THEME:");
		label_1.setBounds(x_align+20, 260, 82, 26);
		add(label_1);
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(x_align, 306, 111, 55);
		add(textArea);
		textArea.setText(theme);
		textArea.setRows(2);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		
		JLabel label_2 = new JLabel("WORDS FOUND:");
		label_2.setBounds(x_align+15, 380, 111, 14);
		add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(x_align, 402, 111, 70);
		add(panel_2);
		panel_2.setLayout(new GridLayout(3, 0, 0, 0));
		
		word1 = new JLabel(words.get(0));
		word1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(word1);
		word1.setVisible(false);
		
		word2 = new JLabel(words.get(1));
		word2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(word2);
		word2.setVisible(false);
		
		word3 = new JLabel(words.get(2));
		word3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(word3);
		word3.setVisible(false);
	}
	
	private void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
		resetButton.addMouseListener(new ResetController(a, m));
		undoButton.addMouseListener(new UndoController(a, m));
	}
	
	public void update(){
		updateStars();
		updateBoard();
	}
	
	public void updateBoard(){
		board.updateBoard();
	}
	
	public void updateStars(){
		int star_count = m.getCurrentLevel().getScoreBoard().getStars();
		System.out.println("checking");
		if (star_count == 1){
			star_1.setVisible(true);
			star_2.setVisible(false);
			star_3.setVisible(false);
			word1.setVisible(true);
		}
		else if (star_count == 2){
			star_1.setVisible(true);
			star_2.setVisible(true);
			star_3.setVisible(false);
			word2.setVisible(true);
		}
		else if (star_count == 3){
			star_1.setVisible(true);
			star_2.setVisible(true);
			star_3.setVisible(true);
			word3.setVisible(true);
		}
		else {
			star_1.setVisible(false);
			star_2.setVisible(false);
			star_3.setVisible(false);
		}
	}
	
	public TraceableBoardPanel getBoard(){
		return this.board;
	}
}

package boundary;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import controllers.ToMainMenuController;
import model.Model;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;

public class PuzzlePlayerPanel extends JPanel {
	
	private Application a;
	private Model m;
	private int lvl;
	private JLabel moves;
	private JLabel score;
	private JButton btnMainMenu;
	
	public PuzzlePlayerPanel(Application a, Model m, int lvl){
		this.a = a;
		this.m = m;
		this.lvl = lvl;
		initialize();
	}
	
	public void initialize() {
		initializeViews();
		initializeControllers();
	}
	
	public void initializeViews() {
		setLayout(null);

		/*
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 11, 434, 361);
		add(panel);
		*/
		
		btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		btnMainMenu.setBounds(380, 11, 193, 35);
		add(btnMainMenu);

		JLabel label = new JLabel("LEVEL " + lvl);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		label.setBounds(10, 11, 114, 35);
		add(label);
		
		TraceableBoardPanel board = new TraceableBoardPanel(m, a);
		board.setBounds(10, 60, 420, 420);
		add(board);

		JLabel label_1 = new JLabel("POINTS:");
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_1.setBounds(455, 332, 82, 26);
		add(label_1);

		JButton button_1 = new JButton("UNDO");
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button_1.setBounds(455, 145, 111, 35);
		add(button_1);

		JButton button_2 = new JButton("RESET");
		button_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button_2.setBounds(455, 190, 111, 35);
		add(button_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(455, 75, 111, 35);
		add(panel_2);
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
		
		/*
		JButton btnRemoveWord = new JButton("REMOVE WORD");
		btnRemoveWord.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		btnRemoveWord.setBounds(413, 103, 111, 35);
		add(btnRemoveWord);
		*/
		
		score = new JLabel("0");
		score.setBounds(455, 365, 111, 35);
		add(score);
		score.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));

		JLabel lblMovesLeft = new JLabel("MOVES LEFT:");
		lblMovesLeft.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblMovesLeft.setBounds(455, 271, 111, 26);
		add(lblMovesLeft);

		moves = new JLabel("52");
		moves.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		moves.setBounds(455, 290, 82, 26);
		add(moves);
		
	}
	
	
	private void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
	}
	
	public void update(){
		score.setText(Integer.toString(m.getCurrentLevel().getScoreBoard().getScore()));
		moves.setText(Integer.toString(52 - m.getCurrentLevel().getNumRemovedWords()));
	}
	

}

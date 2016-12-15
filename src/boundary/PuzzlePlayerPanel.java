package boundary;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import controllers.ResetController;
import controllers.ToMainMenuController;
import controllers.UndoController;
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
	TraceableBoardPanel board;
	private JLabel moves;
	private JLabel score;
	private JButton btnMainMenu;
	private JButton resetButton;
	private JButton undoButton;
	
	private JLabel star_1;
	private JLabel star_2;
	private JLabel star_3;
	private int wordLimit;
	
	public PuzzlePlayerPanel(Application a, Model m, int lvl, int wordLimit){
		this.a = a;
		this.m = m;
		this.lvl = lvl;
		this.wordLimit = wordLimit;
		initialize();
	}
	
	public void initialize() {
		initializeViews();
		initializeControllers();
	}
	
	public int getLevel(){
		return lvl;
	}
	
	public void initializeViews() {
		setLayout(null);

		btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		btnMainMenu.setBounds(380, 11, 193, 35);
		add(btnMainMenu);

		JLabel label = new JLabel("LEVEL " + lvl);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		label.setBounds(10, 11, 114, 35);
		add(label);
		
		board = new TraceableBoardPanel(m, a);
		board.setBounds(10, 60, 420, 420);
		add(board);

		JLabel label_1 = new JLabel("POINTS:");
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_1.setBounds(455, 332, 82, 26);
		add(label_1);

		undoButton = new JButton("UNDO");
		undoButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		undoButton.setBounds(455, 145, 111, 35);
		add(undoButton);

		resetButton = new JButton("RESET");
		resetButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		resetButton.setBounds(455, 190, 111, 35);
		add(resetButton);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(455, 75, 111, 35);
		add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));

		star_1 = new JLabel("");
		star_1.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		star_1.setHorizontalAlignment(SwingConstants.CENTER);
		star_1.setVisible(false);
		panel_2.add(star_1);

		star_2 = new JLabel("");
		star_2.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		star_2.setHorizontalAlignment(SwingConstants.CENTER);
		star_2.setVisible(false);
		panel_2.add(star_2);

		star_3 = new JLabel("");
		star_3.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		star_3.setHorizontalAlignment(SwingConstants.CENTER);
		star_3.setVisible(false);
		panel_2.add(star_3);
		
		score = new JLabel("0");
		score.setBounds(455, 365, 111, 35);
		add(score);
		score.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));

		JLabel lblMovesLeft = new JLabel("MOVES LEFT:");
		lblMovesLeft.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblMovesLeft.setBounds(455, 271, 111, 26);
		add(lblMovesLeft);

		moves = new JLabel(Integer.toString(wordLimit));
		moves.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		moves.setBounds(455, 290, 82, 26);
		add(moves);
		
	}
	
	
	private void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
		resetButton.addMouseListener(new ResetController(a, m));
		undoButton.addMouseListener(new UndoController(a, m));
	}
	
	public void update(){
		score.setText(Integer.toString(m.getCurrentLevel().getScoreBoard().getScore()));
		moves.setText(Integer.toString(wordLimit - m.getCurrentLevel().getNumRemovedWords()));
		updateStars();
		updateBoard();
		
	}
	
	public void updateBoard(){
		board.updateBoard();
	}
	
	public void updateStars(){
		int star_count = m.getCurrentLevel().getScoreBoard().getStars();
		if (star_count == 1){
			star_1.setVisible(true);
			star_2.setVisible(false);
			star_3.setVisible(false);
		}
		else if (star_count == 2){
			star_1.setVisible(true);
			star_2.setVisible(true);
			star_3.setVisible(false);
		}
		else if (star_count == 3){
			star_1.setVisible(true);
			star_2.setVisible(true);
			star_3.setVisible(true);
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

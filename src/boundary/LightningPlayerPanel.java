package boundary;

import javax.swing.JPanel;

import controllers.TimerController;
import controllers.ToMainMenuController;
import model.Lightning;
import model.Model;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.ImageIcon;

public class LightningPlayerPanel extends JPanel {

	private Application a;
	private Model m;
	private int lvl;
	private JLabel timer;
	private int time;
	TraceableBoardPanel board;
	private JLabel score;
	private JButton btnMainMenu;
	private JButton resetButton;
	private JButton undoButton;
	private JLabel star_1;
	private JLabel star_2;
	private JLabel star_3;
	
	public LightningPlayerPanel(Application a, Model m, int lvl, int time){
		this.a = a;
		this.m = m;
		this.lvl = lvl;
		this.time = time;
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
		int x_align = 455;
		
		board = new TraceableBoardPanel(m, a);
		board.setBounds(10, 60, 420, 420);
		add(board);
		
		JLabel label = new JLabel("LEVEL " + lvl);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		label.setBounds(10, 11, 114, 35);
		add(label);
		
		TraceableBoardPanel board = new TraceableBoardPanel(m, a);
		board.setBounds(10, 60, 420, 420);
		add(board);
		
		score = new JLabel("0");
		score.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		score.setBounds(x_align, 278, 111, 35);
		add(score);
		
		JLabel label_2 = new JLabel("POINTS:");
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_2.setBounds(x_align, 256, 82, 26);
		add(label_2);
		
		btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		btnMainMenu.setBounds(x_align, 11, 193, 35);
		add(btnMainMenu);
		
		timer = new JLabel();
		timer.setForeground(Color.RED);
		timer.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		timer.setBackground(Color.WHITE);
		timer.setBounds(x_align, 324, 94, 26);
		add(timer);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(x_align, 57, 111, 35);
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
		
		JButton btnRemoveWord = new JButton("REMOVE WORD");
		btnRemoveWord.setBounds(x_align, 103, 111, 35);
		add(btnRemoveWord);
		btnRemoveWord.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		
		JButton button_1 = new JButton("UNDO");
		button_1.setBounds(x_align, 149, 111, 35);
		add(button_1);
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		
		JButton button = new JButton("RESET");
		button.setBounds(x_align, 195, 111, 35);
		add(button);
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));

	}

	public void update(){
		score.setText(Integer.toString(m.getCurrentLevel().getScoreBoard().getScore()));
		updateStars();
		updateBoard();
	}
	
	private void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
		TimerController timer = new TimerController(this.a, this, (Lightning) this.m.currentLevel);
		timer.runTimer();
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
	
	public void updateBoard(){
		board.updateBoard();
	}
	
	public void setTime(int time_val){
		String string_time = Integer.toString(time_val);
		this.timer.setText(string_time);
	}

}

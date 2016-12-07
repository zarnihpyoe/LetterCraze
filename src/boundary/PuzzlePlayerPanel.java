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
	
	private JButton btnMainMenu;
	
	public PuzzlePlayerPanel(Application a, Model m){
		this.a = a;
		this.m = m;
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
		btnMainMenu.setBounds(331, 11, 193, 35);
		add(btnMainMenu);

		JLabel label = new JLabel("LEVEL 1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		label.setBounds(10, 11, 114, 35);
		add(label);
		
		TraceableBoardPanel board = new TraceableBoardPanel();
		board.setBounds(10, 60, 350, 350);
		add(board);

		JLabel label_1 = new JLabel("POINTS:");
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_1.setBounds(385, 332, 82, 26);
		add(label_1);

		JButton button_1 = new JButton("UNDO");
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button_1.setBounds(385, 145, 111, 35);
		add(button_1);

		JButton button_2 = new JButton("RESET");
		button_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button_2.setBounds(385, 190, 111, 35);
		add(button_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(385, 75, 111, 35);
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
		
		JLabel label_2 = new JLabel("1337");
		label_2.setBounds(385, 365, 111, 35);
		add(label_2);
		label_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));

		JLabel lblMovesLeft = new JLabel("MOVES LEFT:");
		lblMovesLeft.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblMovesLeft.setBounds(385, 271, 111, 26);
		add(lblMovesLeft);

		JLabel label_6 = new JLabel("52");
		label_6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_6.setBounds(385, 290, 82, 26);
		add(label_6);
		
	}
	
	
	private void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
	}
	

}

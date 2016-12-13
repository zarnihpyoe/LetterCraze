package boundary;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.ToMainMenuController;
import model.Model;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class ThemePlayerPanel extends JPanel {

	private Application a;
	private Model m;
	private int lvl;
	private JButton btnMainMenu;
	
	public ThemePlayerPanel(Application a, Model m, int lvl){
		this.a = a;
		this.m = m;
		this.lvl = lvl;
		initialize();
	}
	
	public void initialize(){
		initializeView();
		initializeControllers();
	}
	
	public void initializeView() {
		setLayout(null);
		int x_align = 485;

		
		JLabel label = new JLabel("LEVEL " + lvl);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		label.setBounds(10, 11, 114, 35);
		add(label);
		
		TraceableBoardPanel board = new TraceableBoardPanel(m, a);
		board.setBounds(10, 60, 420, 420);
		add(board);
		
		btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		btnMainMenu.setBounds(x_align-30, 11, 193, 35);
		add(btnMainMenu);
		
		JButton button = new JButton("RESET");
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button.setBounds(x_align, 195, 111, 35);
		add(button);
		
		JButton button_1 = new JButton("UNDO");
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button_1.setBounds(x_align, 149, 111, 35);
		add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(x_align, 57, 111, 35);
		add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(ThemePlayerPanel.class.getResource("/resources/STAR.png")));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(ThemePlayerPanel.class.getResource("/resources/STAR.png")));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(ThemePlayerPanel.class.getResource("/resources/STAR.png")));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_8);
		
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
		textArea.setText("SCREAM      NOISES");
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
		
		JLabel label_3 = new JLabel("AAAAAA");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("AAAAAAAAA");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("AAAAAAAAA");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_5);

	}
	
	private void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
	}

}

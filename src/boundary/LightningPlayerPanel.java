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
	
	private JButton btnMainMenu;
	
	public LightningPlayerPanel(Application a, Model m, int lvl){
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
		int x_align = 455;
		
		JLabel label = new JLabel("LEVEL " + lvl);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		label.setBounds(10, 11, 114, 35);
		add(label);
		
		TraceableBoardPanel board = new TraceableBoardPanel();
		board.setBounds(10, 60, 420, 420);
		add(board);
		
		JLabel label_1 = new JLabel("1337");
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		label_1.setBounds(x_align, 278, 111, 35);
		add(label_1);
		
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
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(LightningPlayerPanel.class.getResource("/resources/STAR.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(LightningPlayerPanel.class.getResource("/resources/STAR.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(LightningPlayerPanel.class.getResource("/resources/STAR.png")));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_6);
		
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

	private void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
		
		TimerController timer = new TimerController(this.a, this, (Lightning) this.m.currentLevel);
		timer.runTimer();
	}
	
	public void setTime(int time_val){
		String string_time = Integer.toString(time_val);
		this.timer.setText(string_time);
	}

}

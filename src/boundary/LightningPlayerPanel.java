package boundary;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import controllers.ToMainMenuController;
import model.Board;
import model.LetterBank;
import model.Model;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.ImageIcon;
public class LightningPlayerPanel extends JPanel {

	private Application a;
	private Model m;
	private Board b;
	private int timer;
	int level;
	
	private JButton btnMainMenu;
	private ArrayList<JToggleButton> btnList = new ArrayList<JToggleButton>();
	
	public LightningPlayerPanel(Application a, Model m, Board b, int timer, int level){
		this.a = a;
		this.m = m;
		this.b = b;
		this.timer = timer;
		this.level = level;
		initialize();
	}
	
	public void initialize(){
		initializeView();
		initializeControllers();
	}
	
	public void initializeView() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 11, 434, 362);
		add(panel);
		
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
		
		JLabel label_1 = new JLabel("0");
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		label_1.setBounds(313, 278, 111, 35);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("POINTS:");
		label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_2.setBounds(313, 256, 82, 26);
		panel.add(label_2);
		
		btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		btnMainMenu.setBounds(231, 11, 193, 35);
		panel.add(btnMainMenu);
		
		JLabel label_3 = new JLabel(Integer.toString(timer));
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(313, 324, 94, 26);
		panel.add(label_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(313, 57, 111, 35);
		panel.add(panel_2);
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
		btnRemoveWord.setBounds(313, 103, 111, 35);
		panel.add(btnRemoveWord);
		btnRemoveWord.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		
		JButton button_1 = new JButton("UNDO");
		button_1.setBounds(313, 149, 111, 35);
		panel.add(button_1);
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		
		JButton button = new JButton("RESET");
		button.setBounds(313, 195, 111, 35);
		panel.add(button);
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));

	}

	private void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
	}

}
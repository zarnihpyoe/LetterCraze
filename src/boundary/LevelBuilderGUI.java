package boundary;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;

public class LevelBuilderGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelBuilderGUI window = new LevelBuilderGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LevelBuilderGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 601, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Puzzle");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnNewButton.setBounds(200, 147, 200, 50);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(null);
		
		JLabel lblMainMenu = new JLabel("MAIN MENU");
		lblMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblMainMenu.setBounds(150, 25, 300, 100);
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblMainMenu);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLightning = new JButton("Lightning");
		btnLightning.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnLightning.setBounds(200, 210, 200, 50);
		frame.getContentPane().add(btnLightning);
		
		JButton btnTheme = new JButton("Theme");
		btnTheme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTheme.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnTheme.setBounds(200, 273, 200, 50);
		frame.getContentPane().add(btnTheme);
		
		JButton btnDeleteLevel = new JButton("Delete Level");
		btnDeleteLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeleteLevel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnDeleteLevel.setBounds(371, 391, 200, 50);
		frame.getContentPane().add(btnDeleteLevel);
	}
}

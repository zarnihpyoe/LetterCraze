package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JProgressBar;
import java.awt.Color;

public class LevelSelect extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelSelect frame = new LevelSelect();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LevelSelect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 504, 341);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("MAIN MENU");
		label.setBounds(10, 11, 259, 46);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 34));
		panel.add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 61, 469, 258);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{285, 150, 0};
		gbl_panel_1.rowHeights = new int[]{53, 0, 53, 0, 53, 0, 53, 0, 53, 0, 53, 0, 53, 0, 53, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton button = new JButton("Level 1: Puzzle");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panel_1.add(button, gbc_button);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		panel_1.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_3);
		
		JButton button_1 = new JButton("Level 2: Lightning");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 1;
		panel_1.add(button_1, gbc_button_1);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 1;
		panel_1.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_6);
		
		JButton button_2 = new JButton("Level 3: Theme");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 2;
		panel_1.add(button_2, gbc_button_2);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 2;
		panel_1.add(panel_4, gbc_panel_4);
		panel_4.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label_7 = new JLabel("");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(label_9);
		
		JButton button_3 = new JButton("Level 4: Puzzle");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 0;
		gbc_button_3.gridy = 3;
		panel_1.add(button_3, gbc_button_3);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.gridx = 1;
		gbc_panel_5.gridy = 3;
		panel_1.add(panel_5, gbc_panel_5);
		panel_5.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label_10 = new JLabel("");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(label_12);
		
		JButton button_4 = new JButton("Level 5: LOCKED");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 4;
		panel_1.add(button_4, gbc_button_4);
		
		JPanel panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.insets = new Insets(0, 0, 5, 0);
		gbc_panel_6.gridx = 1;
		gbc_panel_6.gridy = 4;
		panel_1.add(panel_6, gbc_panel_6);
		panel_6.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label_13 = new JLabel("");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(label_15);
		
		JButton button_5 = new JButton("Level 6: Theme");
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 0;
		gbc_button_5.gridy = 5;
		panel_1.add(button_5, gbc_button_5);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(1);
		progressBar.setMaximum(3);
		progressBar.setForeground(Color.YELLOW);
		progressBar.setBackground(Color.GRAY);
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar.gridx = 1;
		gbc_progressBar.gridy = 5;
		panel_1.add(progressBar, gbc_progressBar);
		
		JButton button_6 = new JButton("Level 7: Puzzle");
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 0;
		gbc_button_6.gridy = 6;
		panel_1.add(button_6, gbc_button_6);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(1);
		progressBar_1.setMaximum(3);
		progressBar_1.setForeground(Color.YELLOW);
		progressBar_1.setBackground(Color.GRAY);
		GridBagConstraints gbc_progressBar_1 = new GridBagConstraints();
		gbc_progressBar_1.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar_1.gridx = 1;
		gbc_progressBar_1.gridy = 6;
		panel_1.add(progressBar_1, gbc_progressBar_1);
		
		JButton button_7 = new JButton("Level 8: Lightning");
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 0;
		gbc_button_7.gridy = 7;
		panel_1.add(button_7, gbc_button_7);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(1);
		progressBar_2.setMaximum(3);
		progressBar_2.setForeground(Color.YELLOW);
		progressBar_2.setBackground(Color.GRAY);
		GridBagConstraints gbc_progressBar_2 = new GridBagConstraints();
		gbc_progressBar_2.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar_2.gridx = 1;
		gbc_progressBar_2.gridy = 7;
		panel_1.add(progressBar_2, gbc_progressBar_2);
		
		JButton button_8 = new JButton("Level 9: Theme");
		button_8.setHorizontalAlignment(SwingConstants.LEFT);
		button_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 0;
		gbc_button_8.gridy = 8;
		panel_1.add(button_8, gbc_button_8);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setValue(1);
		progressBar_3.setMaximum(3);
		progressBar_3.setForeground(Color.YELLOW);
		progressBar_3.setBackground(Color.GRAY);
		GridBagConstraints gbc_progressBar_3 = new GridBagConstraints();
		gbc_progressBar_3.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar_3.gridx = 1;
		gbc_progressBar_3.gridy = 8;
		panel_1.add(progressBar_3, gbc_progressBar_3);
		
		JButton button_9 = new JButton("Level 10: Puzzle");
		button_9.setHorizontalAlignment(SwingConstants.LEFT);
		button_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 0;
		gbc_button_9.gridy = 9;
		panel_1.add(button_9, gbc_button_9);
		
		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setValue(1);
		progressBar_4.setMaximum(3);
		progressBar_4.setForeground(Color.YELLOW);
		progressBar_4.setBackground(Color.GRAY);
		GridBagConstraints gbc_progressBar_4 = new GridBagConstraints();
		gbc_progressBar_4.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar_4.gridx = 1;
		gbc_progressBar_4.gridy = 9;
		panel_1.add(progressBar_4, gbc_progressBar_4);
		
		JButton button_10 = new JButton("Level 11: Lightning");
		button_10.setHorizontalAlignment(SwingConstants.LEFT);
		button_10.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.BOTH;
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 0;
		gbc_button_10.gridy = 10;
		panel_1.add(button_10, gbc_button_10);
		
		JProgressBar progressBar_5 = new JProgressBar();
		progressBar_5.setValue(1);
		progressBar_5.setMaximum(3);
		progressBar_5.setForeground(Color.YELLOW);
		progressBar_5.setBackground(Color.GRAY);
		GridBagConstraints gbc_progressBar_5 = new GridBagConstraints();
		gbc_progressBar_5.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar_5.gridx = 1;
		gbc_progressBar_5.gridy = 10;
		panel_1.add(progressBar_5, gbc_progressBar_5);
		
		JButton button_11 = new JButton("Level 12: Theme");
		button_11.setHorizontalAlignment(SwingConstants.LEFT);
		button_11.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.BOTH;
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 0;
		gbc_button_11.gridy = 11;
		panel_1.add(button_11, gbc_button_11);
		
		JProgressBar progressBar_6 = new JProgressBar();
		progressBar_6.setValue(1);
		progressBar_6.setMaximum(3);
		progressBar_6.setForeground(Color.YELLOW);
		progressBar_6.setBackground(Color.GRAY);
		GridBagConstraints gbc_progressBar_6 = new GridBagConstraints();
		gbc_progressBar_6.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar_6.gridx = 1;
		gbc_progressBar_6.gridy = 11;
		panel_1.add(progressBar_6, gbc_progressBar_6);
		
		JButton button_12 = new JButton("Level 13: Puzzle");
		button_12.setHorizontalAlignment(SwingConstants.LEFT);
		button_12.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.fill = GridBagConstraints.BOTH;
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 0;
		gbc_button_12.gridy = 12;
		panel_1.add(button_12, gbc_button_12);
		
		JProgressBar progressBar_7 = new JProgressBar();
		progressBar_7.setValue(1);
		progressBar_7.setMaximum(3);
		progressBar_7.setForeground(Color.YELLOW);
		progressBar_7.setBackground(Color.GRAY);
		GridBagConstraints gbc_progressBar_7 = new GridBagConstraints();
		gbc_progressBar_7.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar_7.gridx = 1;
		gbc_progressBar_7.gridy = 12;
		panel_1.add(progressBar_7, gbc_progressBar_7);
		
		JButton button_13 = new JButton("Level 14: Lightning");
		button_13.setHorizontalAlignment(SwingConstants.LEFT);
		button_13.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.BOTH;
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 0;
		gbc_button_13.gridy = 13;
		panel_1.add(button_13, gbc_button_13);
		
		JProgressBar progressBar_8 = new JProgressBar();
		progressBar_8.setValue(1);
		progressBar_8.setMaximum(3);
		progressBar_8.setForeground(Color.YELLOW);
		progressBar_8.setBackground(Color.GRAY);
		GridBagConstraints gbc_progressBar_8 = new GridBagConstraints();
		gbc_progressBar_8.insets = new Insets(0, 0, 5, 0);
		gbc_progressBar_8.gridx = 1;
		gbc_progressBar_8.gridy = 13;
		panel_1.add(progressBar_8, gbc_progressBar_8);
		
		JButton button_14 = new JButton("Level 15: Theme");
		button_14.setHorizontalAlignment(SwingConstants.LEFT);
		button_14.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.fill = GridBagConstraints.BOTH;
		gbc_button_14.insets = new Insets(0, 0, 0, 5);
		gbc_button_14.gridx = 0;
		gbc_button_14.gridy = 14;
		panel_1.add(button_14, gbc_button_14);
		
		JProgressBar progressBar_9 = new JProgressBar();
		progressBar_9.setValue(1);
		progressBar_9.setMaximum(3);
		progressBar_9.setForeground(Color.YELLOW);
		progressBar_9.setBackground(Color.GRAY);
		GridBagConstraints gbc_progressBar_9 = new GridBagConstraints();
		gbc_progressBar_9.gridx = 1;
		gbc_progressBar_9.gridy = 14;
		panel_1.add(progressBar_9, gbc_progressBar_9);
	}

}

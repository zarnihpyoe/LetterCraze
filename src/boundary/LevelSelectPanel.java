package boundary;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import controllers.*;
import model.Model;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class LevelSelectPanel extends JPanel {

	private JButton button;

	private Application a;
	private Model m;
	private ArrayList<JButton> buttonList;

	public LevelSelectPanel(Application a, Model m) {
		initialize(a, m);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Application a, Model m) {
		this.a = a;
		this.m = m;
		initializeViews();
		initializeControllers();
	}
	/**
	 * Create the panel.
	 */
	public void initializeViews() {

		buttonList = new ArrayList<JButton>();

		setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 584, 782);
		add(panel);

		JLabel label = new JLabel("MAIN MENU");
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 34));
		label.setBounds(10, 11, 259, 46);
		panel.add(label);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 68, 554, 433);
		panel.add(scrollPane);

		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {241, 100, 0};
		gbl_panel_1.rowHeights = new int[]{43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		button = new JButton("Level 1: Puzzle");
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
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_2.rowHeights = new int[]{43, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);

		JLabel label_46 = new JLabel("0");
		label_46.setHorizontalAlignment(SwingConstants.CENTER);
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_46 = new GridBagConstraints();
		gbc_label_46.insets = new Insets(0, 0, 0, 5);
		gbc_label_46.gridx = 0;
		gbc_label_46.gridy = 0;
		panel_2.add(label_46, gbc_label_46);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.BOTH;
		gbc_label_1.insets = new Insets(0, 0, 0, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 0;
		panel_2.add(label_1, gbc_label_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 0, 5);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 0;
		panel_2.add(label_2, gbc_label_2);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.fill = GridBagConstraints.BOTH;
		gbc_label_3.gridx = 3;
		gbc_label_3.gridy = 0;
		panel_2.add(label_3, gbc_label_3);

		JButton button_1 = new JButton("Level 2: LOCKED");
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
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_3.rowHeights = new int[]{43, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);

		JLabel label_49 = new JLabel("0");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_49 = new GridBagConstraints();
		gbc_label_49.insets = new Insets(0, 0, 0, 5);
		gbc_label_49.gridx = 0;
		gbc_label_49.gridy = 0;
		panel_3.add(label_49, gbc_label_49);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.fill = GridBagConstraints.BOTH;
		gbc_label_4.insets = new Insets(0, 0, 0, 5);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 0;
		panel_3.add(label_4, gbc_label_4);

		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.fill = GridBagConstraints.BOTH;
		gbc_label_5.insets = new Insets(0, 0, 0, 5);
		gbc_label_5.gridx = 2;
		gbc_label_5.gridy = 0;
		panel_3.add(label_5, gbc_label_5);

		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.fill = GridBagConstraints.BOTH;
		gbc_label_6.gridx = 3;
		gbc_label_6.gridy = 0;
		panel_3.add(label_6, gbc_label_6);

		JButton button_2 = new JButton("Level 3: LOCKED");
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
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_4.rowHeights = new int[]{43, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);

		JLabel label_58 = new JLabel("0");
		label_58.setHorizontalAlignment(SwingConstants.CENTER);
		label_58.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_58 = new GridBagConstraints();
		gbc_label_58.insets = new Insets(0, 0, 0, 5);
		gbc_label_58.gridx = 0;
		gbc_label_58.gridy = 0;
		panel_4.add(label_58, gbc_label_58);

		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.fill = GridBagConstraints.BOTH;
		gbc_label_7.insets = new Insets(0, 0, 0, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 0;
		panel_4.add(label_7, gbc_label_7);

		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.fill = GridBagConstraints.BOTH;
		gbc_label_8.insets = new Insets(0, 0, 0, 5);
		gbc_label_8.gridx = 2;
		gbc_label_8.gridy = 0;
		panel_4.add(label_8, gbc_label_8);

		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.fill = GridBagConstraints.BOTH;
		gbc_label_9.gridx = 3;
		gbc_label_9.gridy = 0;
		panel_4.add(label_9, gbc_label_9);

		JButton button_3 = new JButton("Level 4: LOCKED");
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
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_5.rowHeights = new int[]{43, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);

		JLabel label_50 = new JLabel("0");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_50 = new GridBagConstraints();
		gbc_label_50.insets = new Insets(0, 0, 0, 5);
		gbc_label_50.gridx = 0;
		gbc_label_50.gridy = 0;
		panel_5.add(label_50, gbc_label_50);

		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.fill = GridBagConstraints.BOTH;
		gbc_label_10.insets = new Insets(0, 0, 0, 5);
		gbc_label_10.gridx = 1;
		gbc_label_10.gridy = 0;
		panel_5.add(label_10, gbc_label_10);

		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.fill = GridBagConstraints.BOTH;
		gbc_label_11.insets = new Insets(0, 0, 0, 5);
		gbc_label_11.gridx = 2;
		gbc_label_11.gridy = 0;
		panel_5.add(label_11, gbc_label_11);

		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.fill = GridBagConstraints.BOTH;
		gbc_label_12.gridx = 3;
		gbc_label_12.gridy = 0;
		panel_5.add(label_12, gbc_label_12);

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
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_6.rowHeights = new int[]{43, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);

		JLabel label_51 = new JLabel("0");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_51 = new GridBagConstraints();
		gbc_label_51.insets = new Insets(0, 0, 0, 5);
		gbc_label_51.gridx = 0;
		gbc_label_51.gridy = 0;
		panel_6.add(label_51, gbc_label_51);

		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.fill = GridBagConstraints.BOTH;
		gbc_label_13.insets = new Insets(0, 0, 0, 5);
		gbc_label_13.gridx = 1;
		gbc_label_13.gridy = 0;
		panel_6.add(label_13, gbc_label_13);

		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.fill = GridBagConstraints.BOTH;
		gbc_label_14.insets = new Insets(0, 0, 0, 5);
		gbc_label_14.gridx = 2;
		gbc_label_14.gridy = 0;
		panel_6.add(label_14, gbc_label_14);

		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.fill = GridBagConstraints.BOTH;
		gbc_label_15.gridx = 3;
		gbc_label_15.gridy = 0;
		panel_6.add(label_15, gbc_label_15);

		JButton button_5 = new JButton("Level 6: LOCKED");
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 0;
		gbc_button_5.gridy = 5;
		panel_1.add(button_5, gbc_button_5);

		JPanel panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.insets = new Insets(0, 0, 5, 0);
		gbc_panel_7.gridx = 1;
		gbc_panel_7.gridy = 5;
		panel_1.add(panel_7, gbc_panel_7);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_7.rowHeights = new int[]{43, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);

		JLabel label_59 = new JLabel("0");
		label_59.setHorizontalAlignment(SwingConstants.CENTER);
		label_59.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_59 = new GridBagConstraints();
		gbc_label_59.insets = new Insets(0, 0, 0, 5);
		gbc_label_59.gridx = 0;
		gbc_label_59.gridy = 0;
		panel_7.add(label_59, gbc_label_59);

		JLabel label_16 = new JLabel("");
		label_16.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.fill = GridBagConstraints.BOTH;
		gbc_label_16.insets = new Insets(0, 0, 0, 5);
		gbc_label_16.gridx = 1;
		gbc_label_16.gridy = 0;
		panel_7.add(label_16, gbc_label_16);

		JLabel label_17 = new JLabel("");
		label_17.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.fill = GridBagConstraints.BOTH;
		gbc_label_17.insets = new Insets(0, 0, 0, 5);
		gbc_label_17.gridx = 2;
		gbc_label_17.gridy = 0;
		panel_7.add(label_17, gbc_label_17);

		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.fill = GridBagConstraints.BOTH;
		gbc_label_18.gridx = 3;
		gbc_label_18.gridy = 0;
		panel_7.add(label_18, gbc_label_18);

		JButton button_6 = new JButton("Level 7: LOCKED");
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 0;
		gbc_button_6.gridy = 6;
		panel_1.add(button_6, gbc_button_6);

		JPanel panel_8 = new JPanel();
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.insets = new Insets(0, 0, 5, 0);
		gbc_panel_8.gridx = 1;
		gbc_panel_8.gridy = 6;
		panel_1.add(panel_8, gbc_panel_8);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_8.rowHeights = new int[]{43, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);

		JLabel label_52 = new JLabel("0");
		label_52.setHorizontalAlignment(SwingConstants.CENTER);
		label_52.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_52 = new GridBagConstraints();
		gbc_label_52.insets = new Insets(0, 0, 0, 5);
		gbc_label_52.gridx = 0;
		gbc_label_52.gridy = 0;
		panel_8.add(label_52, gbc_label_52);

		JLabel label_19 = new JLabel("");
		label_19.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.fill = GridBagConstraints.BOTH;
		gbc_label_19.insets = new Insets(0, 0, 0, 5);
		gbc_label_19.gridx = 1;
		gbc_label_19.gridy = 0;
		panel_8.add(label_19, gbc_label_19);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_20 = new GridBagConstraints();
		gbc_label_20.fill = GridBagConstraints.BOTH;
		gbc_label_20.insets = new Insets(0, 0, 0, 5);
		gbc_label_20.gridx = 2;
		gbc_label_20.gridy = 0;
		panel_8.add(label_20, gbc_label_20);

		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.fill = GridBagConstraints.BOTH;
		gbc_label_21.gridx = 3;
		gbc_label_21.gridy = 0;
		panel_8.add(label_21, gbc_label_21);

		JButton button_7 = new JButton("Level 8: LOCKED");
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 0;
		gbc_button_7.gridy = 7;
		panel_1.add(button_7, gbc_button_7);

		JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.insets = new Insets(0, 0, 5, 0);
		gbc_panel_9.gridx = 1;
		gbc_panel_9.gridy = 7;
		panel_1.add(panel_9, gbc_panel_9);
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_9.rowHeights = new int[]{43, 0};
		gbl_panel_9.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);

		JLabel label_53 = new JLabel("0");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_53 = new GridBagConstraints();
		gbc_label_53.insets = new Insets(0, 0, 0, 5);
		gbc_label_53.gridx = 0;
		gbc_label_53.gridy = 0;
		panel_9.add(label_53, gbc_label_53);

		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_22 = new GridBagConstraints();
		gbc_label_22.fill = GridBagConstraints.BOTH;
		gbc_label_22.insets = new Insets(0, 0, 0, 5);
		gbc_label_22.gridx = 1;
		gbc_label_22.gridy = 0;
		panel_9.add(label_22, gbc_label_22);

		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.fill = GridBagConstraints.BOTH;
		gbc_label_23.insets = new Insets(0, 0, 0, 5);
		gbc_label_23.gridx = 2;
		gbc_label_23.gridy = 0;
		panel_9.add(label_23, gbc_label_23);

		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.fill = GridBagConstraints.BOTH;
		gbc_label_24.gridx = 3;
		gbc_label_24.gridy = 0;
		panel_9.add(label_24, gbc_label_24);

		JButton button_8 = new JButton("Level 9: LOCKED");
		button_8.setHorizontalAlignment(SwingConstants.LEFT);
		button_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 0;
		gbc_button_8.gridy = 8;
		panel_1.add(button_8, gbc_button_8);

		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10.gridx = 1;
		gbc_panel_10.gridy = 8;
		panel_1.add(panel_10, gbc_panel_10);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_10.rowHeights = new int[]{43, 0};
		gbl_panel_10.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);

		JLabel label_62 = new JLabel("0");
		label_62.setHorizontalAlignment(SwingConstants.CENTER);
		label_62.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_62 = new GridBagConstraints();
		gbc_label_62.insets = new Insets(0, 0, 0, 5);
		gbc_label_62.gridx = 0;
		gbc_label_62.gridy = 0;
		panel_10.add(label_62, gbc_label_62);

		JLabel label_25 = new JLabel("");
		label_25.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_25 = new GridBagConstraints();
		gbc_label_25.fill = GridBagConstraints.BOTH;
		gbc_label_25.insets = new Insets(0, 0, 0, 5);
		gbc_label_25.gridx = 1;
		gbc_label_25.gridy = 0;
		panel_10.add(label_25, gbc_label_25);

		JLabel label_26 = new JLabel("");
		label_26.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_26 = new GridBagConstraints();
		gbc_label_26.fill = GridBagConstraints.BOTH;
		gbc_label_26.insets = new Insets(0, 0, 0, 5);
		gbc_label_26.gridx = 2;
		gbc_label_26.gridy = 0;
		panel_10.add(label_26, gbc_label_26);

		JLabel label_27 = new JLabel("");
		label_27.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_27 = new GridBagConstraints();
		gbc_label_27.fill = GridBagConstraints.BOTH;
		gbc_label_27.gridx = 3;
		gbc_label_27.gridy = 0;
		panel_10.add(label_27, gbc_label_27);

		JButton button_9 = new JButton("Level 10: LOCKED");
		button_9.setHorizontalAlignment(SwingConstants.LEFT);
		button_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 0;
		gbc_button_9.gridy = 9;
		panel_1.add(button_9, gbc_button_9);

		JPanel panel_11 = new JPanel();
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11.gridx = 1;
		gbc_panel_11.gridy = 9;
		panel_1.add(panel_11, gbc_panel_11);
		GridBagLayout gbl_panel_11 = new GridBagLayout();
		gbl_panel_11.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_11.rowHeights = new int[]{43, 0};
		gbl_panel_11.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_11.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_11.setLayout(gbl_panel_11);

		JLabel label_54 = new JLabel("0");
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_54 = new GridBagConstraints();
		gbc_label_54.insets = new Insets(0, 0, 0, 5);
		gbc_label_54.gridx = 0;
		gbc_label_54.gridy = 0;
		panel_11.add(label_54, gbc_label_54);

		JLabel label_28 = new JLabel("");
		label_28.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.fill = GridBagConstraints.BOTH;
		gbc_label_28.insets = new Insets(0, 0, 0, 5);
		gbc_label_28.gridx = 1;
		gbc_label_28.gridy = 0;
		panel_11.add(label_28, gbc_label_28);

		JLabel label_29 = new JLabel("");
		label_29.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_29 = new GridBagConstraints();
		gbc_label_29.fill = GridBagConstraints.BOTH;
		gbc_label_29.insets = new Insets(0, 0, 0, 5);
		gbc_label_29.gridx = 2;
		gbc_label_29.gridy = 0;
		panel_11.add(label_29, gbc_label_29);

		JLabel label_30 = new JLabel("");
		label_30.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.fill = GridBagConstraints.BOTH;
		gbc_label_30.gridx = 3;
		gbc_label_30.gridy = 0;
		panel_11.add(label_30, gbc_label_30);

		JButton button_10 = new JButton("Level 11: LOCKED");
		button_10.setHorizontalAlignment(SwingConstants.LEFT);
		button_10.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.BOTH;
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 0;
		gbc_button_10.gridy = 10;
		panel_1.add(button_10, gbc_button_10);

		JPanel panel_12 = new JPanel();
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.insets = new Insets(0, 0, 5, 0);
		gbc_panel_12.gridx = 1;
		gbc_panel_12.gridy = 10;
		panel_1.add(panel_12, gbc_panel_12);
		GridBagLayout gbl_panel_12 = new GridBagLayout();
		gbl_panel_12.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_12.rowHeights = new int[]{43, 0};
		gbl_panel_12.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_12.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_12.setLayout(gbl_panel_12);

		JLabel label_55 = new JLabel("0");
		label_55.setHorizontalAlignment(SwingConstants.CENTER);
		label_55.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_55 = new GridBagConstraints();
		gbc_label_55.insets = new Insets(0, 0, 0, 5);
		gbc_label_55.gridx = 0;
		gbc_label_55.gridy = 0;
		panel_12.add(label_55, gbc_label_55);

		JLabel label_31 = new JLabel("");
		label_31.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_31 = new GridBagConstraints();
		gbc_label_31.fill = GridBagConstraints.BOTH;
		gbc_label_31.insets = new Insets(0, 0, 0, 5);
		gbc_label_31.gridx = 1;
		gbc_label_31.gridy = 0;
		panel_12.add(label_31, gbc_label_31);

		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_32 = new GridBagConstraints();
		gbc_label_32.fill = GridBagConstraints.BOTH;
		gbc_label_32.insets = new Insets(0, 0, 0, 5);
		gbc_label_32.gridx = 2;
		gbc_label_32.gridy = 0;
		panel_12.add(label_32, gbc_label_32);

		JLabel label_33 = new JLabel("");
		label_33.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_33 = new GridBagConstraints();
		gbc_label_33.fill = GridBagConstraints.BOTH;
		gbc_label_33.gridx = 3;
		gbc_label_33.gridy = 0;
		panel_12.add(label_33, gbc_label_33);

		JButton button_11 = new JButton("Level 12: LOCKED");
		button_11.setHorizontalAlignment(SwingConstants.LEFT);
		button_11.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.BOTH;
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 0;
		gbc_button_11.gridy = 11;
		panel_1.add(button_11, gbc_button_11);

		JPanel panel_13 = new JPanel();
		GridBagConstraints gbc_panel_13 = new GridBagConstraints();
		gbc_panel_13.fill = GridBagConstraints.BOTH;
		gbc_panel_13.insets = new Insets(0, 0, 5, 0);
		gbc_panel_13.gridx = 1;
		gbc_panel_13.gridy = 11;
		panel_1.add(panel_13, gbc_panel_13);
		GridBagLayout gbl_panel_13 = new GridBagLayout();
		gbl_panel_13.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_13.rowHeights = new int[]{43, 0};
		gbl_panel_13.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_13.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_13.setLayout(gbl_panel_13);

		JLabel label_61 = new JLabel("0");
		label_61.setHorizontalAlignment(SwingConstants.CENTER);
		label_61.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_61 = new GridBagConstraints();
		gbc_label_61.insets = new Insets(0, 0, 0, 5);
		gbc_label_61.gridx = 0;
		gbc_label_61.gridy = 0;
		panel_13.add(label_61, gbc_label_61);

		JLabel label_34 = new JLabel("");
		label_34.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_34 = new GridBagConstraints();
		gbc_label_34.fill = GridBagConstraints.BOTH;
		gbc_label_34.insets = new Insets(0, 0, 0, 5);
		gbc_label_34.gridx = 1;
		gbc_label_34.gridy = 0;
		panel_13.add(label_34, gbc_label_34);

		JLabel label_35 = new JLabel("");
		label_35.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_35 = new GridBagConstraints();
		gbc_label_35.fill = GridBagConstraints.BOTH;
		gbc_label_35.insets = new Insets(0, 0, 0, 5);
		gbc_label_35.gridx = 2;
		gbc_label_35.gridy = 0;
		panel_13.add(label_35, gbc_label_35);

		JLabel label_36 = new JLabel("");
		label_36.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_36 = new GridBagConstraints();
		gbc_label_36.fill = GridBagConstraints.BOTH;
		gbc_label_36.gridx = 3;
		gbc_label_36.gridy = 0;
		panel_13.add(label_36, gbc_label_36);

		JButton button_12 = new JButton("Level 13: LOCKED");
		button_12.setHorizontalAlignment(SwingConstants.LEFT);
		button_12.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.fill = GridBagConstraints.BOTH;
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 0;
		gbc_button_12.gridy = 12;
		panel_1.add(button_12, gbc_button_12);

		JPanel panel_14 = new JPanel();
		GridBagConstraints gbc_panel_14 = new GridBagConstraints();
		gbc_panel_14.fill = GridBagConstraints.BOTH;
		gbc_panel_14.insets = new Insets(0, 0, 5, 0);
		gbc_panel_14.gridx = 1;
		gbc_panel_14.gridy = 12;
		panel_1.add(panel_14, gbc_panel_14);
		GridBagLayout gbl_panel_14 = new GridBagLayout();
		gbl_panel_14.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_14.rowHeights = new int[]{43, 0};
		gbl_panel_14.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_14.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_14.setLayout(gbl_panel_14);

		JLabel label_56 = new JLabel("0");
		label_56.setHorizontalAlignment(SwingConstants.CENTER);
		label_56.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_56 = new GridBagConstraints();
		gbc_label_56.insets = new Insets(0, 0, 0, 5);
		gbc_label_56.gridx = 0;
		gbc_label_56.gridy = 0;
		panel_14.add(label_56, gbc_label_56);

		JLabel label_37 = new JLabel("");
		label_37.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_37 = new GridBagConstraints();
		gbc_label_37.fill = GridBagConstraints.BOTH;
		gbc_label_37.insets = new Insets(0, 0, 0, 5);
		gbc_label_37.gridx = 1;
		gbc_label_37.gridy = 0;
		panel_14.add(label_37, gbc_label_37);

		JLabel label_38 = new JLabel("");
		label_38.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_38 = new GridBagConstraints();
		gbc_label_38.fill = GridBagConstraints.BOTH;
		gbc_label_38.insets = new Insets(0, 0, 0, 5);
		gbc_label_38.gridx = 2;
		gbc_label_38.gridy = 0;
		panel_14.add(label_38, gbc_label_38);

		JLabel label_39 = new JLabel("");
		label_39.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_39 = new GridBagConstraints();
		gbc_label_39.fill = GridBagConstraints.BOTH;
		gbc_label_39.gridx = 3;
		gbc_label_39.gridy = 0;
		panel_14.add(label_39, gbc_label_39);

		JButton button_13 = new JButton("Level 14: LOCKED");
		button_13.setHorizontalAlignment(SwingConstants.LEFT);
		button_13.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.BOTH;
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 0;
		gbc_button_13.gridy = 13;
		panel_1.add(button_13, gbc_button_13);

		JPanel panel_15 = new JPanel();
		GridBagConstraints gbc_panel_15 = new GridBagConstraints();
		gbc_panel_15.fill = GridBagConstraints.BOTH;
		gbc_panel_15.insets = new Insets(0, 0, 5, 0);
		gbc_panel_15.gridx = 1;
		gbc_panel_15.gridy = 13;
		panel_1.add(panel_15, gbc_panel_15);
		GridBagLayout gbl_panel_15 = new GridBagLayout();
		gbl_panel_15.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_15.rowHeights = new int[]{43, 0};
		gbl_panel_15.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_15.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_15.setLayout(gbl_panel_15);

		JLabel label_57 = new JLabel("0");
		label_57.setHorizontalAlignment(SwingConstants.CENTER);
		label_57.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_57 = new GridBagConstraints();
		gbc_label_57.insets = new Insets(0, 0, 0, 5);
		gbc_label_57.gridx = 0;
		gbc_label_57.gridy = 0;
		panel_15.add(label_57, gbc_label_57);

		JLabel label_40 = new JLabel("");
		label_40.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_40.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_40 = new GridBagConstraints();
		gbc_label_40.fill = GridBagConstraints.BOTH;
		gbc_label_40.insets = new Insets(0, 0, 0, 5);
		gbc_label_40.gridx = 1;
		gbc_label_40.gridy = 0;
		panel_15.add(label_40, gbc_label_40);

		JLabel label_41 = new JLabel("");
		label_41.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_41.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_41 = new GridBagConstraints();
		gbc_label_41.fill = GridBagConstraints.BOTH;
		gbc_label_41.insets = new Insets(0, 0, 0, 5);
		gbc_label_41.gridx = 2;
		gbc_label_41.gridy = 0;
		panel_15.add(label_41, gbc_label_41);

		JLabel label_42 = new JLabel("");
		label_42.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_42.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_42 = new GridBagConstraints();
		gbc_label_42.fill = GridBagConstraints.BOTH;
		gbc_label_42.gridx = 3;
		gbc_label_42.gridy = 0;
		panel_15.add(label_42, gbc_label_42);

		JButton button_14 = new JButton("Level 15: LOCKED");
		button_14.setHorizontalAlignment(SwingConstants.LEFT);
		button_14.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.fill = GridBagConstraints.BOTH;
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 0;
		gbc_button_14.gridy = 14;
		panel_1.add(button_14, gbc_button_14);

		JPanel panel_16 = new JPanel();
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.insets = new Insets(0, 0, 5, 0);
		gbc_panel_16.gridx = 1;
		gbc_panel_16.gridy = 14;
		panel_1.add(panel_16, gbc_panel_16);
		GridBagLayout gbl_panel_16 = new GridBagLayout();
		gbl_panel_16.columnWidths = new int[] {50, 50, 50, 50, 0};
		gbl_panel_16.rowHeights = new int[]{43, 0};
		gbl_panel_16.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_16.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_16.setLayout(gbl_panel_16);

		JLabel label_60 = new JLabel("0");
		label_60.setHorizontalAlignment(SwingConstants.CENTER);
		label_60.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_label_60 = new GridBagConstraints();
		gbc_label_60.insets = new Insets(0, 0, 0, 5);
		gbc_label_60.gridx = 0;
		gbc_label_60.gridy = 0;
		panel_16.add(label_60, gbc_label_60);

		JLabel label_43 = new JLabel("");
		label_43.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_43.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_43 = new GridBagConstraints();
		gbc_label_43.fill = GridBagConstraints.BOTH;
		gbc_label_43.insets = new Insets(0, 0, 0, 5);
		gbc_label_43.gridx = 1;
		gbc_label_43.gridy = 0;
		panel_16.add(label_43, gbc_label_43);

		JLabel label_44 = new JLabel("");
		label_44.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_44 = new GridBagConstraints();
		gbc_label_44.fill = GridBagConstraints.BOTH;
		gbc_label_44.insets = new Insets(0, 0, 0, 5);
		gbc_label_44.gridx = 2;
		gbc_label_44.gridy = 0;
		panel_16.add(label_44, gbc_label_44);

		JLabel label_45 = new JLabel("");
		label_45.setIcon(new ImageIcon(LevelSelectPanel.class.getResource("/resources/STAR.png")));
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_45 = new GridBagConstraints();
		gbc_label_45.fill = GridBagConstraints.BOTH;
		gbc_label_45.gridx = 3;
		gbc_label_45.gridy = 0;
		panel_16.add(label_45, gbc_label_45);

		JLabel label_47 = new JLabel("");
		GridBagConstraints gbc_label_47 = new GridBagConstraints();
		gbc_label_47.fill = GridBagConstraints.BOTH;
		gbc_label_47.insets = new Insets(0, 0, 0, 5);
		gbc_label_47.gridx = 0;
		gbc_label_47.gridy = 15;
		panel_1.add(label_47, gbc_label_47);

		JLabel label_48 = new JLabel("");
		GridBagConstraints gbc_label_48 = new GridBagConstraints();
		gbc_label_48.fill = GridBagConstraints.BOTH;
		gbc_label_48.gridx = 1;
		gbc_label_48.gridy = 15;
		panel_1.add(label_48, gbc_label_48);

		label_1.setVisible(false);
		label_2.setVisible(false);
		label_3.setVisible(false);
		label_4.setVisible(false);
		label_5.setVisible(false);
		label_6.setVisible(false);
		label_7.setVisible(false);
		label_8.setVisible(false);
		label_9.setVisible(false);
		label_10.setVisible(false);
		label_11.setVisible(false);
		label_12.setVisible(false);
		label_13.setVisible(false);
		label_14.setVisible(false);
		label_15.setVisible(false);
		label_16.setVisible(false);
		label_17.setVisible(false);
		label_18.setVisible(false);
		label_19.setVisible(false);
		label_20.setVisible(false);
		label_21.setVisible(false);
		label_22.setVisible(false);
		label_23.setVisible(false);
		label_24.setVisible(false);
		label_25.setVisible(false);
		label_26.setVisible(false);
		label_27.setVisible(false);
		label_28.setVisible(false);
		label_29.setVisible(false);
		label_30.setVisible(false);
		label_31.setVisible(false);
		label_32.setVisible(false);
		label_33.setVisible(false);
		label_34.setVisible(false);
		label_35.setVisible(false);
		label_36.setVisible(false);
		label_37.setVisible(false);
		label_38.setVisible(false);
		label_39.setVisible(false);
		label_40.setVisible(false);
		label_41.setVisible(false);
		label_42.setVisible(false);
		label_43.setVisible(false);
		label_44.setVisible(false);
		label_45.setVisible(false);
		//lol this is the worst

		buttonList.add(0, button);
		buttonList.add(1, button_1);
		buttonList.add(2, button_2);
		buttonList.add(3, button_3);
		buttonList.add(4, button_4);
		buttonList.add(5, button_5);
		buttonList.add(6, button_6);
		buttonList.add(7, button_7);
		buttonList.add(8, button_8);
		buttonList.add(9, button_9);
		buttonList.add(10, button_10);
		buttonList.add(11, button_11);
		buttonList.add(12, button_12);
		buttonList.add(13, button_13);
		buttonList.add(14, button_14);
	}
	private void initializeControllers(){
		for(int i=0; i<15; i++){
			int j = i+1;
			if(j==1||j==4||j==7||j==10||j==13){
				buttonList.get(i).addMouseListener(new SelectPuzzleLevelController(this.a, this.m, j));
			} else if(j==2||j==5||j==8||j==11||j==14){
				buttonList.get(i).addMouseListener(new SelectLightningLevelController(this.a, this.m, j));
			} else {
				buttonList.get(i).addMouseListener(new SelectThemeLevelController(this.a, this.m, j));
			}
		}
	}
}
package boundary;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;

public class PuzzleBuilderGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PuzzleBuilderGUI window = new PuzzleBuilderGUI();
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
	public PuzzleBuilderGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPuzzle = new JLabel("Puzzle");
		lblPuzzle.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblPuzzle.setBounds(25, 13, 107, 36);
		frame.getContentPane().add(lblPuzzle);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnMainMenu.setBounds(545, 13, 175, 52);
		frame.getContentPane().add(btnMainMenu);
		
		JLabel lblLabel = new JLabel("Level:");
		lblLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblLabel.setBounds(500, 115, 70, 28);
		frame.getContentPane().add(lblLabel);
		
		textField = new JTextField();
		textField.setBounds(570, 118, 100, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(657, 226, 46, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(657, 255, 46, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(657, 284, 46, 22);
		frame.getContentPane().add(textField_3);
		
		JToggleButton toggleButton = new JToggleButton("");
		toggleButton.setBounds(25, 62, 70, 70);
		frame.getContentPane().add(toggleButton);
		
		JToggleButton toggleButton_1 = new JToggleButton("");
		toggleButton_1.setBounds(95, 62, 70, 70);
		frame.getContentPane().add(toggleButton_1);
		
		JToggleButton toggleButton_2 = new JToggleButton("");
		toggleButton_2.setBounds(165, 62, 70, 70);
		frame.getContentPane().add(toggleButton_2);
		
		JToggleButton toggleButton_3 = new JToggleButton("");
		toggleButton_3.setBounds(165, 131, 70, 70);
		frame.getContentPane().add(toggleButton_3);
		
		JToggleButton toggleButton_4 = new JToggleButton("");
		toggleButton_4.setBounds(95, 131, 70, 70);
		frame.getContentPane().add(toggleButton_4);
		
		JToggleButton toggleButton_5 = new JToggleButton("");
		toggleButton_5.setBounds(25, 131, 70, 70);
		frame.getContentPane().add(toggleButton_5);
		
		JToggleButton toggleButton_6 = new JToggleButton("");
		toggleButton_6.setBounds(25, 200, 70, 70);
		frame.getContentPane().add(toggleButton_6);
		
		JToggleButton toggleButton_7 = new JToggleButton("");
		toggleButton_7.setBounds(95, 200, 70, 70);
		frame.getContentPane().add(toggleButton_7);
		
		JToggleButton toggleButton_8 = new JToggleButton("");
		toggleButton_8.setBounds(165, 200, 70, 70);
		frame.getContentPane().add(toggleButton_8);
		
		JToggleButton toggleButton_9 = new JToggleButton("");
		toggleButton_9.setBounds(235, 200, 70, 70);
		frame.getContentPane().add(toggleButton_9);
		
		JToggleButton toggleButton_10 = new JToggleButton("");
		toggleButton_10.setBounds(305, 200, 70, 70);
		frame.getContentPane().add(toggleButton_10);
		
		JToggleButton toggleButton_11 = new JToggleButton("");
		toggleButton_11.setBounds(375, 200, 70, 70);
		frame.getContentPane().add(toggleButton_11);
		
		JToggleButton toggleButton_12 = new JToggleButton("");
		toggleButton_12.setBounds(375, 131, 70, 70);
		frame.getContentPane().add(toggleButton_12);
		
		JToggleButton toggleButton_13 = new JToggleButton("");
		toggleButton_13.setBounds(305, 131, 70, 70);
		frame.getContentPane().add(toggleButton_13);
		
		JToggleButton toggleButton_14 = new JToggleButton("");
		toggleButton_14.setBounds(235, 131, 70, 70);
		frame.getContentPane().add(toggleButton_14);
		
		JToggleButton toggleButton_15 = new JToggleButton("");
		toggleButton_15.setBounds(235, 62, 70, 70);
		frame.getContentPane().add(toggleButton_15);
		
		JToggleButton toggleButton_16 = new JToggleButton("");
		toggleButton_16.setBounds(305, 62, 70, 70);
		frame.getContentPane().add(toggleButton_16);
		
		JToggleButton toggleButton_17 = new JToggleButton("");
		toggleButton_17.setBounds(375, 62, 70, 70);
		frame.getContentPane().add(toggleButton_17);
		
		JToggleButton toggleButton_18 = new JToggleButton("");
		toggleButton_18.setBounds(375, 269, 70, 70);
		frame.getContentPane().add(toggleButton_18);
		
		JToggleButton toggleButton_19 = new JToggleButton("");
		toggleButton_19.setBounds(305, 269, 70, 70);
		frame.getContentPane().add(toggleButton_19);
		
		JToggleButton toggleButton_20 = new JToggleButton("");
		toggleButton_20.setBounds(165, 269, 70, 70);
		frame.getContentPane().add(toggleButton_20);
		
		JToggleButton toggleButton_21 = new JToggleButton("");
		toggleButton_21.setBounds(235, 269, 70, 70);
		frame.getContentPane().add(toggleButton_21);
		
		JToggleButton toggleButton_22 = new JToggleButton("");
		toggleButton_22.setBounds(235, 339, 70, 70);
		frame.getContentPane().add(toggleButton_22);
		
		JToggleButton toggleButton_23 = new JToggleButton("");
		toggleButton_23.setBounds(95, 339, 70, 70);
		frame.getContentPane().add(toggleButton_23);
		
		JToggleButton toggleButton_24 = new JToggleButton("");
		toggleButton_24.setBounds(165, 339, 70, 70);
		frame.getContentPane().add(toggleButton_24);
		
		JToggleButton toggleButton_25 = new JToggleButton("");
		toggleButton_25.setBounds(95, 269, 70, 70);
		frame.getContentPane().add(toggleButton_25);
		
		JToggleButton toggleButton_26 = new JToggleButton("");
		toggleButton_26.setBounds(25, 269, 70, 70);
		frame.getContentPane().add(toggleButton_26);
		
		JToggleButton toggleButton_27 = new JToggleButton("");
		toggleButton_27.setBounds(25, 408, 70, 70);
		frame.getContentPane().add(toggleButton_27);
		
		JToggleButton toggleButton_28 = new JToggleButton("");
		toggleButton_28.setBounds(25, 339, 70, 70);
		frame.getContentPane().add(toggleButton_28);
		
		JToggleButton toggleButton_29 = new JToggleButton("");
		toggleButton_29.setBounds(95, 408, 70, 70);
		frame.getContentPane().add(toggleButton_29);
		
		JToggleButton toggleButton_30 = new JToggleButton("");
		toggleButton_30.setBounds(165, 408, 70, 70);
		frame.getContentPane().add(toggleButton_30);
		
		JToggleButton toggleButton_31 = new JToggleButton("");
		toggleButton_31.setBounds(235, 408, 70, 70);
		frame.getContentPane().add(toggleButton_31);
		
		JToggleButton toggleButton_32 = new JToggleButton("");
		toggleButton_32.setBounds(375, 339, 70, 70);
		frame.getContentPane().add(toggleButton_32);
		
		JToggleButton toggleButton_33 = new JToggleButton("");
		toggleButton_33.setBounds(305, 339, 70, 70);
		frame.getContentPane().add(toggleButton_33);
		
		JToggleButton toggleButton_34 = new JToggleButton("");
		toggleButton_34.setBounds(305, 408, 70, 70);
		frame.getContentPane().add(toggleButton_34);
		
		JToggleButton toggleButton_35 = new JToggleButton("");
		toggleButton_35.setBounds(375, 408, 70, 70);
		frame.getContentPane().add(toggleButton_35);
		
		JButton button = new JButton("Preview");
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		button.setBounds(533, 393, 130, 36);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Save");
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		button_1.setBounds(539, 442, 118, 36);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		lblNewLabel.setBounds(615, 229, 16, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label.setBounds(615, 258, 16, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label_1.setBounds(587, 258, 16, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(615, 323, 16, -17);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label_3.setBounds(615, 287, 16, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label_4.setBounds(587, 287, 16, 16);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label_5.setBounds(559, 287, 16, 16);
		frame.getContentPane().add(label_5);
	}
}

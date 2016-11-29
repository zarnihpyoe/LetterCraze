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

public class LightningBuilderGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LightningBuilderGUI window = new LightningBuilderGUI();
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
	public LightningBuilderGUI() {
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
		
		JLabel lblPuzzle = new JLabel("Lightning");
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
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnSave.setBounds(534, 440, 118, 36);
		frame.getContentPane().add(btnSave);
		
		textField_1 = new JTextField();
		textField_1.setBounds(658, 232, 46, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(658, 261, 46, 22);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(658, 290, 46, 22);
		frame.getContentPane().add(textField_3);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblTime.setBounds(500, 156, 70, 28);
		frame.getContentPane().add(lblTime);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(570, 159, 100, 25);
		frame.getContentPane().add(textField_4);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setBounds(25, 60, 70, 70);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JToggleButton toggleButton = new JToggleButton("");
		toggleButton.setBounds(95, 60, 70, 70);
		frame.getContentPane().add(toggleButton);
		
		JToggleButton toggleButton_1 = new JToggleButton("");
		toggleButton_1.setBounds(235, 60, 70, 70);
		frame.getContentPane().add(toggleButton_1);
		
		JToggleButton toggleButton_2 = new JToggleButton("");
		toggleButton_2.setBounds(165, 60, 70, 70);
		frame.getContentPane().add(toggleButton_2);
		
		JToggleButton toggleButton_3 = new JToggleButton("");
		toggleButton_3.setBounds(375, 60, 70, 70);
		frame.getContentPane().add(toggleButton_3);
		
		JToggleButton toggleButton_4 = new JToggleButton("");
		toggleButton_4.setBounds(305, 60, 70, 70);
		frame.getContentPane().add(toggleButton_4);
		
		JToggleButton toggleButton_5 = new JToggleButton("");
		toggleButton_5.setBounds(25, 129, 70, 70);
		frame.getContentPane().add(toggleButton_5);
		
		JToggleButton toggleButton_6 = new JToggleButton("");
		toggleButton_6.setBounds(95, 129, 70, 70);
		frame.getContentPane().add(toggleButton_6);
		
		JToggleButton toggleButton_7 = new JToggleButton("");
		toggleButton_7.setBounds(165, 129, 70, 70);
		frame.getContentPane().add(toggleButton_7);
		
		JToggleButton toggleButton_8 = new JToggleButton("");
		toggleButton_8.setBounds(235, 129, 70, 70);
		frame.getContentPane().add(toggleButton_8);
		
		JToggleButton toggleButton_9 = new JToggleButton("");
		toggleButton_9.setBounds(305, 129, 70, 70);
		frame.getContentPane().add(toggleButton_9);
		
		JToggleButton toggleButton_10 = new JToggleButton("");
		toggleButton_10.setBounds(375, 129, 70, 70);
		frame.getContentPane().add(toggleButton_10);
		
		JToggleButton toggleButton_11 = new JToggleButton("");
		toggleButton_11.setBounds(25, 198, 70, 70);
		frame.getContentPane().add(toggleButton_11);
		
		JToggleButton toggleButton_12 = new JToggleButton("");
		toggleButton_12.setBounds(25, 267, 70, 70);
		frame.getContentPane().add(toggleButton_12);
		
		JToggleButton toggleButton_13 = new JToggleButton("");
		toggleButton_13.setBounds(95, 267, 70, 70);
		frame.getContentPane().add(toggleButton_13);
		
		JToggleButton toggleButton_14 = new JToggleButton("");
		toggleButton_14.setBounds(165, 267, 70, 70);
		frame.getContentPane().add(toggleButton_14);
		
		JToggleButton toggleButton_15 = new JToggleButton("");
		toggleButton_15.setBounds(165, 198, 70, 70);
		frame.getContentPane().add(toggleButton_15);
		
		JToggleButton toggleButton_16 = new JToggleButton("");
		toggleButton_16.setBounds(95, 198, 70, 70);
		frame.getContentPane().add(toggleButton_16);
		
		JToggleButton toggleButton_17 = new JToggleButton("");
		toggleButton_17.setBounds(235, 198, 70, 70);
		frame.getContentPane().add(toggleButton_17);
		
		JToggleButton toggleButton_18 = new JToggleButton("");
		toggleButton_18.setBounds(235, 267, 70, 70);
		frame.getContentPane().add(toggleButton_18);
		
		JToggleButton toggleButton_19 = new JToggleButton("");
		toggleButton_19.setBounds(305, 267, 70, 70);
		frame.getContentPane().add(toggleButton_19);
		
		JToggleButton toggleButton_20 = new JToggleButton("");
		toggleButton_20.setBounds(305, 198, 70, 70);
		frame.getContentPane().add(toggleButton_20);
		
		JToggleButton toggleButton_21 = new JToggleButton("");
		toggleButton_21.setBounds(375, 198, 70, 70);
		frame.getContentPane().add(toggleButton_21);
		
		JToggleButton toggleButton_22 = new JToggleButton("");
		toggleButton_22.setBounds(375, 267, 70, 70);
		frame.getContentPane().add(toggleButton_22);
		
		JToggleButton toggleButton_23 = new JToggleButton("");
		toggleButton_23.setBounds(25, 337, 70, 70);
		frame.getContentPane().add(toggleButton_23);
		
		JToggleButton toggleButton_24 = new JToggleButton("");
		toggleButton_24.setBounds(25, 406, 70, 70);
		frame.getContentPane().add(toggleButton_24);
		
		JToggleButton toggleButton_25 = new JToggleButton("");
		toggleButton_25.setBounds(95, 406, 70, 70);
		frame.getContentPane().add(toggleButton_25);
		
		JToggleButton toggleButton_26 = new JToggleButton("");
		toggleButton_26.setBounds(165, 406, 70, 70);
		frame.getContentPane().add(toggleButton_26);
		
		JToggleButton toggleButton_27 = new JToggleButton("");
		toggleButton_27.setBounds(165, 337, 70, 70);
		frame.getContentPane().add(toggleButton_27);
		
		JToggleButton toggleButton_28 = new JToggleButton("");
		toggleButton_28.setBounds(95, 337, 70, 70);
		frame.getContentPane().add(toggleButton_28);
		
		JToggleButton toggleButton_29 = new JToggleButton("");
		toggleButton_29.setBounds(235, 337, 70, 70);
		frame.getContentPane().add(toggleButton_29);
		
		JToggleButton toggleButton_30 = new JToggleButton("");
		toggleButton_30.setBounds(235, 406, 70, 70);
		frame.getContentPane().add(toggleButton_30);
		
		JToggleButton toggleButton_31 = new JToggleButton("");
		toggleButton_31.setBounds(305, 406, 70, 70);
		frame.getContentPane().add(toggleButton_31);
		
		JToggleButton toggleButton_32 = new JToggleButton("");
		toggleButton_32.setBounds(305, 337, 70, 70);
		frame.getContentPane().add(toggleButton_32);
		
		JToggleButton toggleButton_33 = new JToggleButton("");
		toggleButton_33.setBounds(375, 337, 70, 70);
		frame.getContentPane().add(toggleButton_33);
		
		JToggleButton toggleButton_34 = new JToggleButton("");
		toggleButton_34.setBounds(375, 406, 70, 70);
		frame.getContentPane().add(toggleButton_34);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPreview.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		btnPreview.setBounds(528, 391, 130, 36);
		frame.getContentPane().add(btnPreview);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label.setBounds(616, 235, 16, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label_1.setBounds(616, 264, 16, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label_2.setBounds(588, 264, 16, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label_3.setBounds(616, 293, 16, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label_4.setBounds(588, 293, 16, 16);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\Remy Kaldawy\\Pictures\\star (1).png"));
		label_5.setBounds(560, 293, 16, 16);
		frame.getContentPane().add(label_5);
	}
}

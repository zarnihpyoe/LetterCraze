package boundary;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class PreviewWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreviewWindow window = new PreviewWindow();
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
	public PreviewWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 525, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton toggleButton = new JToggleButton("");
		toggleButton.setBounds(40, 13, 70, 70);
		frame.getContentPane().add(toggleButton);
		
		JToggleButton toggleButton_1 = new JToggleButton("");
		toggleButton_1.setBounds(110, 82, 70, 70);
		frame.getContentPane().add(toggleButton_1);
		
		JToggleButton toggleButton_2 = new JToggleButton("");
		toggleButton_2.setBounds(40, 82, 70, 70);
		frame.getContentPane().add(toggleButton_2);
		
		JToggleButton toggleButton_3 = new JToggleButton("");
		toggleButton_3.setBounds(40, 151, 70, 70);
		frame.getContentPane().add(toggleButton_3);
		
		JToggleButton toggleButton_4 = new JToggleButton("");
		toggleButton_4.setBounds(110, 151, 70, 70);
		frame.getContentPane().add(toggleButton_4);
		
		JToggleButton toggleButton_5 = new JToggleButton("");
		toggleButton_5.setBounds(110, 220, 70, 70);
		frame.getContentPane().add(toggleButton_5);
		
		JToggleButton toggleButton_6 = new JToggleButton("");
		toggleButton_6.setBounds(40, 220, 70, 70);
		frame.getContentPane().add(toggleButton_6);
		
		JToggleButton toggleButton_7 = new JToggleButton("");
		toggleButton_7.setBounds(40, 290, 70, 70);
		frame.getContentPane().add(toggleButton_7);
		
		JToggleButton toggleButton_8 = new JToggleButton("");
		toggleButton_8.setBounds(40, 359, 70, 70);
		frame.getContentPane().add(toggleButton_8);
		
		JToggleButton toggleButton_9 = new JToggleButton("");
		toggleButton_9.setBounds(110, 359, 70, 70);
		frame.getContentPane().add(toggleButton_9);
		
		JToggleButton toggleButton_10 = new JToggleButton("");
		toggleButton_10.setBounds(110, 290, 70, 70);
		frame.getContentPane().add(toggleButton_10);
		
		JToggleButton toggleButton_11 = new JToggleButton("");
		toggleButton_11.setBounds(180, 290, 70, 70);
		frame.getContentPane().add(toggleButton_11);
		
		JToggleButton toggleButton_12 = new JToggleButton("");
		toggleButton_12.setBounds(180, 359, 70, 70);
		frame.getContentPane().add(toggleButton_12);
		
		JToggleButton toggleButton_13 = new JToggleButton("");
		toggleButton_13.setBounds(250, 359, 70, 70);
		frame.getContentPane().add(toggleButton_13);
		
		JToggleButton toggleButton_14 = new JToggleButton("");
		toggleButton_14.setBounds(250, 290, 70, 70);
		frame.getContentPane().add(toggleButton_14);
		
		JToggleButton toggleButton_15 = new JToggleButton("");
		toggleButton_15.setBounds(320, 290, 70, 70);
		frame.getContentPane().add(toggleButton_15);
		
		JToggleButton toggleButton_16 = new JToggleButton("");
		toggleButton_16.setBounds(320, 359, 70, 70);
		frame.getContentPane().add(toggleButton_16);
		
		JToggleButton toggleButton_17 = new JToggleButton("");
		toggleButton_17.setBounds(390, 359, 70, 70);
		frame.getContentPane().add(toggleButton_17);
		
		JToggleButton toggleButton_18 = new JToggleButton("");
		toggleButton_18.setBounds(390, 290, 70, 70);
		frame.getContentPane().add(toggleButton_18);
		
		JToggleButton toggleButton_19 = new JToggleButton("");
		toggleButton_19.setBounds(180, 220, 70, 70);
		frame.getContentPane().add(toggleButton_19);
		
		JToggleButton toggleButton_20 = new JToggleButton("");
		toggleButton_20.setBounds(110, 13, 70, 70);
		frame.getContentPane().add(toggleButton_20);
		
		JToggleButton toggleButton_21 = new JToggleButton("");
		toggleButton_21.setBounds(180, 151, 70, 70);
		frame.getContentPane().add(toggleButton_21);
		
		JToggleButton toggleButton_22 = new JToggleButton("");
		toggleButton_22.setBounds(250, 220, 70, 70);
		frame.getContentPane().add(toggleButton_22);
		
		JToggleButton toggleButton_23 = new JToggleButton("");
		toggleButton_23.setBounds(250, 151, 70, 70);
		frame.getContentPane().add(toggleButton_23);
		
		JToggleButton toggleButton_24 = new JToggleButton("");
		toggleButton_24.setBounds(180, 82, 70, 70);
		frame.getContentPane().add(toggleButton_24);
		
		JToggleButton toggleButton_25 = new JToggleButton("");
		toggleButton_25.setBounds(320, 220, 70, 70);
		frame.getContentPane().add(toggleButton_25);
		
		JToggleButton toggleButton_26 = new JToggleButton("");
		toggleButton_26.setBounds(390, 220, 70, 70);
		frame.getContentPane().add(toggleButton_26);
		
		JToggleButton toggleButton_27 = new JToggleButton("");
		toggleButton_27.setBounds(320, 151, 70, 70);
		frame.getContentPane().add(toggleButton_27);
		
		JToggleButton toggleButton_28 = new JToggleButton("");
		toggleButton_28.setBounds(250, 82, 70, 70);
		frame.getContentPane().add(toggleButton_28);
		
		JToggleButton toggleButton_29 = new JToggleButton("");
		toggleButton_29.setBounds(180, 13, 70, 70);
		frame.getContentPane().add(toggleButton_29);
		
		JToggleButton toggleButton_30 = new JToggleButton("");
		toggleButton_30.setBounds(250, 13, 70, 70);
		frame.getContentPane().add(toggleButton_30);
		
		JToggleButton toggleButton_31 = new JToggleButton("");
		toggleButton_31.setBounds(320, 13, 70, 70);
		frame.getContentPane().add(toggleButton_31);
		
		JToggleButton toggleButton_32 = new JToggleButton("");
		toggleButton_32.setBounds(320, 82, 70, 70);
		frame.getContentPane().add(toggleButton_32);
		
		JToggleButton toggleButton_33 = new JToggleButton("");
		toggleButton_33.setBounds(390, 82, 70, 70);
		frame.getContentPane().add(toggleButton_33);
		
		JToggleButton toggleButton_34 = new JToggleButton("");
		toggleButton_34.setBounds(390, 151, 70, 70);
		frame.getContentPane().add(toggleButton_34);
		
		JToggleButton toggleButton_35 = new JToggleButton("");
		toggleButton_35.setBounds(390, 13, 70, 70);
		frame.getContentPane().add(toggleButton_35);
	}

}

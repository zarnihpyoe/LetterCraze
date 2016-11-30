package boundary;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PlayerSplashPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public PlayerSplashPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PlayerSplashPanel.class.getResource("/resources/player splash.png")));
		lblNewLabel.setBounds(10, 11, 580, 528);
		add(lblNewLabel);

	}
}

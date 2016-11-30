package boundary;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class BuilderSplashPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BuilderSplashPanel() {
		setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(BuilderSplashPanel.class.getResource("/resources/builder splash.png")));
		label.setBounds(10, 11, 580, 528);
		add(label);

	}

}

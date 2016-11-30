package boundary;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Model;
import java.util.Timer;
import java.util.TimerTask;

public class Application {
	JFrame frame;
	Model m;
	
	
	Application(Model m){
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.m = m;
	}
	
	public void switchPanel (JPanel panel){
		frame.setContentPane(panel);
		frame.revalidate();
	}
	
	public boolean modifyFrameSize(int x, int y, int width, int height){
		try{
			frame.setBounds(x, y, width, height);
		}
		catch (Exception e){
			return false;
		}
		return true;		
	}
	
	public JPanel getCurrentPanel(){
		return (JPanel) this.frame.getContentPane();
	}
	
	
	public static void main (String []args) {		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Model m = new Model();
				Timer timer = new Timer();
				
				try {
					final Application window = new Application(m);
					BuilderSplashPanel splashView = new BuilderSplashPanel();
					window.switchPanel(splashView);
					window.modifyFrameSize(100, 100, 718, 445);
					
					
					timer.schedule(new TimerTask() {
						  @Override
						  public void run() {
							  window.frame.setVisible(true);
						  }
						}, 3000);
					window.frame.setVisible(false);
					
					LevelSelectPanel menuView = new LevelSelectPanel();
					window.switchPanel(menuView);
					window.modifyFrameSize(100, 100, 600, 500);
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	

}

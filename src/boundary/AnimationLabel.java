package boundary;
import javax.swing.JLabel;

public class AnimationLabel extends JLabel{
	
	private int final_x;
	private int final_y;
	
	AnimationLabel(){
		this.final_x = 0;
		this.final_y = 0;
	}
	
	public void setText(String s){
		this.setText(s);
	}
	
	public void setFinalX(int x){
		this.final_x = x;
	}
	
	public void setFinalY(int y){
		this.final_y = y;
	}
}

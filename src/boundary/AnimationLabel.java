package boundary;
import javax.swing.JLabel;

public class AnimationLabel extends JLabel{
	
	private int final_x;
	private int final_y;
	private int current_y;
	
	public AnimationLabel(){
		this.final_x = 0;
		this.final_y = 0;
		this.current_y = 0;
	}
	
	public void setText(String s){
		this.setText(s);
	}
	
	public int getFinalX(){
		return this.final_x;
	}
	
	public void setFinalX(int x){
		this.final_x = x;
	}
	
	
	public int getFinalY(){
		return this.final_y;
	}
	
	public void setFinalY(int y){
		this.final_y = y;
	}

	
	public int getCurrentY() {
		return current_y;
	}

	public void setCurrentY(int current) {
		this.current_y = current;
	}
	
	public void incrementCurrent(){
		this.current_y++;
	}
	
	public boolean reachedDestination(){
		return this.current_y == this.final_y;
	}
}

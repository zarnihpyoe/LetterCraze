package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import boundary.Application;
import boundary.LightningPlayerPanel;
import model.Lightning;

public class TimerController {
	Application a;
	LightningPlayerPanel lPanel;
	Lightning level;
	int time_remaining;
	
	public TimerController(Application a, LightningPlayerPanel lPanel, Lightning level){
		this.a = a;
		this.lPanel = lPanel;
		this.level = level;
		this.time_remaining = this.startTimer();
	}
	
	public int startTimer(){ 
		int start_time = level.getTime(); 
		lPanel.setTime(start_time);
		return start_time;
		}
	
	public void runTimer(){

		Timer timer = new Timer(1000, new TimerListener(lPanel, level));

		    timer.start();
		    if (time_remaining == 0){
		    	timer.stop();
		    	}	    
		    }
	}
	
		class TimerListener implements ActionListener {
			
			LightningPlayerPanel lPanel;
			Lightning l;
			int time;
			
			TimerListener(LightningPlayerPanel lPanel, Lightning l){
				this.lPanel = lPanel;
				this.l = l;
			}
			
			public void actionPerformed(ActionEvent e) {
				time = l.decrementTimer();
			    lPanel.setTime(time);
			    if (time == 0){
			    	((Timer)e.getSource()).stop();
			    }
			}
	  }

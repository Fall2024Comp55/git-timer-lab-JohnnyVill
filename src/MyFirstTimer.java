import java.awt.event.ActionEvent;

import javax.swing.Timer;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class MyFirstTimer extends GraphicsProgram {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private int numTimes = 0;
	private Timer someTimerVar = new Timer(1000, this);

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		someTimerVar.setInitialDelay(3000);
		someTimerVar.start();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		myLabel.setLabel("times called? " + numTimes);
		numTimes += 1;
		myLabel.move(5,0);
		if(numTimes == 11) {
			someTimerVar.stop();
		}
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}
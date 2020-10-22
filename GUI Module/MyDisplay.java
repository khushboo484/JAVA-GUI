package guiModule;

import processing.core.PApplet;

/**
 * This class creates a big happy face.
 *
 */

public class MyDisplay extends PApplet{

	public void setup() {
		
		size(400,400);
		background(240,167,52);
	}
	
	public void draw() {
		fill(255, 255, 0);             // yellow
		ellipse(200, 200 , 300, 300);
		fill(0, 0, 0);                 // black
		ellipse(140, 130, 30, 50);
		ellipse(250, 130, 30, 50);
		noFill();
		arc(200, 260, 80, 80, 0, PI);
	}
	
}

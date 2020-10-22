package guiModule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet{
	PImage img;
	
	public void setup() {
		// Add setup code for MyPApplet
		size(400, 400);
		background(255);
		stroke(0);
		img = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
		img.resize(0, height);
		image(img, 0, 0);
	}
	
	public void draw() {
		// Add drawing code for MyPApplet
		int[]  color = sunColorSec(second());         //calculate color code for sun
		fill(color[0], color[1], color[2]);           // set sun color 
		ellipse(width/4, height/5, width/4, height/5); // draw sun
	}
	
	public int[] sunColorSec(float seconds) {
		int[] rgb = new int[3];
		//Scale the brightness of the yellow based on the seconds. i.e. 30 sec is black and 0 sec is bright yellow
		float diffFrom30 = Math.abs(30 - seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255 * ratio);
		rgb[1] = (int)(255 * ratio);
		rgb[2] = 0;
		
		return rgb;
		
	}
	
}

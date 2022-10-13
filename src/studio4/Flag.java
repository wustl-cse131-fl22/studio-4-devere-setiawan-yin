package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		

		StdDraw.setPenColor(60,1,5);
		StdDraw.filledRectangle(0.5, 0.75, 0.5, 0.25);
		StdDraw.setPenColor(252,148,3);
		StdDraw.filledRectangle(0.5, 0.25, 0.5, 0.25);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledCircle(0.6, 0.5, 0.3);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle(0.65, 0.6, 0.15);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);
	
	}
}
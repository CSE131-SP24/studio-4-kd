package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.rectangle(0.5,0.5,0.4,0.24);
		double[] xs = {.1,.1,.3};
		double[] ys = {.5,.26,.26};
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledPolygon(xs, ys);
		
		
		StdDraw.setPenColor(210,130,250);
		double[] xs2 = {.15,.5,.85};
		double[] ys2 = {.74,.55,.74};
		StdDraw.filledPolygon(xs2, ys2);
	
		double [] xs3={.6,.9,.9};
		double []ys3= {.5,.68,.36};
		StdDraw.filledPolygon(xs3, ys3);
		
		StdDraw.setPenColor(143,170,121);
		StdDraw.filledCircle(.2, .4, 0.02);
		StdDraw.filledCircle(.25, .34, 0.02);
		StdDraw.setPenColor(255,215,0);
		StdDraw.filledCircle(0.5,0.65,.04);
		StdDraw.filledCircle(0.8, .5, 0.04);
		
		StdDraw.setPenColor(48,25,32);
		double[] xs2 = {.15,.5,.3};
		double[] ys2 = {.74,.55,.74};
		StdDraw.filledPolygon(xs2, ys2);
	}
}
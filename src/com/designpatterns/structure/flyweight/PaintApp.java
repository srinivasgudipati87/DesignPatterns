package com.designpatterns.structure.flyweight;

public class PaintApp {
	
	public void render(int numberOfShapes) {
		Shapes[] shapes = new Shapes[numberOfShapes + 1];

		for (int i = 0; i < shapes.length; i++) {
			if (i % 2 == 0) {
				shapes[i] = new Circle();
				((Circle) shapes[i]).setRadius(i);
				((Circle) shapes[i]).setLineColor("red");
				((Circle) shapes[i]).setFillcolor("white");
				shapes[i].draw();
			}else {
				shapes[i] = new Rectangle();
				((Rectangle) shapes[i]).setLength(i);
				((Rectangle) shapes[i]).setBreadth(i);
				((Rectangle) shapes[i]).setFillStyle("Own");
				shapes[i].draw();
				
				
			}
		}
	}
}

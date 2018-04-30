package com.designpatterns.structure.flyweight;

public class Circle implements Shapes {

	private String label;
	private int radius;
	private String fillcolor;
	private String lineColor;
	
	
	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public String getFillcolor() {
		return fillcolor;
	}


	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}


	public String getLineColor() {
		return lineColor;
	}


	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}


	public Circle() {
		label="circle";
	}


	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a \t"+label+"\twith Radius\t"+radius+"\tfillcolor\t"+fillcolor+"\tlineColor\t"+lineColor);

	}

}

package com.designpatterns.structure.flyweight;

public class Rectangle implements Shapes {
	
	private String label;
	private int length;
	private int breadth;
	private String fillStyle;
	
	
	
	public Rectangle() {
	this.label="rectangle";
		// TODO Auto-generated constructor stub
	}



	public String getLabel() {
		return label;
	}



	public void setLabel(String label) {
		this.label = label;
	}



	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getBreadth() {
		return breadth;
	}



	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}



	public String getFillStyle() {
		return fillStyle;
	}



	public void setFillStyle(String fillStyle) {
		this.fillStyle = fillStyle;
	}



	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a \t" + label + "\twith Lenght \t" + length + "\tbreadth\t" + breadth + "\tStyle \t"
				+ fillStyle);

	}

}

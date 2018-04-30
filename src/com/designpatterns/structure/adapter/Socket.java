package com.designpatterns.structure.adapter;

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
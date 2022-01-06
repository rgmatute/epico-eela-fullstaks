package com.github.rgmatute91.entity;

public class Agujero {
	
	private double radio;
	
	public Agujero(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public boolean encajar (Circle circle) {
		boolean radio;
		radio = (this.getRadio() >= circle.getRadius());
		return radio;
	}

}

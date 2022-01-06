package com.github.rgmatute91.entity.motor;

public class MotorComun extends Motor {

	@Override
	public void encender() {
		System.out.println("encendiendo el motor común.");
		
	}

	@Override
	public void acelerar() {
		System.out.println("acelerando el motor común.");
		
	}

	@Override
	public void apagar() {
		System.out.println("apagando el motor común.");
		
	}

}

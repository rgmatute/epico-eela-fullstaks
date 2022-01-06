package com.github.rgmatute91.entity.motor;

public class MotorEconomico extends Motor {

	@Override
	public void encender() {
		System.out.println("encendiendo el motor economico.");
		
	}

	@Override
	public void acelerar() {
		System.out.println("acelerando el motor economico.");
		
	}

	@Override
	public void apagar() {
		System.out.println("apagando el motor economico.");
		
	}

}

package com.github.rgmatute91.patrones;

import com.github.rgmatute91.entity.motor.Motor;
import com.github.rgmatute91.entity.motor.MotorElectrico;

public class MotorElectricoAdapter extends Motor {
	
	private MotorElectrico motorElectrico;
	
	
	public MotorElectricoAdapter() {
		System.out.println("El motor electrico se adapto a los otros motores.");
		this.motorElectrico = new MotorElectrico();
	}

	@Override
	public void encender() {
		System.out.println("El motor electrico esta adaptado y se encendio.");
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		System.out.println("El motor electrico esta adaptado y se esta acelerando.");
		this.motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		System.out.println("El motor electrico esta adaptado y se apago.");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
	}

}

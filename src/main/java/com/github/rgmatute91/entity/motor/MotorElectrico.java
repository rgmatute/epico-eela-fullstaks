package com.github.rgmatute91.entity.motor;

public class MotorElectrico {

	private boolean conectado;
	
	public MotorElectrico() {
		System.out.println("Motor electrico creado.");
		this.conectado = false;
	}
	
	public void conectar() {
		System.out.println("COnectando motor electrico.");
		this.conectado = true;
	}
	
	public void activar() {
		if(this.conectado) {
			System.out.println("El motor electrico ya esta conectado...");
		}else {
			System.out.println("El motor electrico NO esta conectado.");
		}
	}
	
	public void moverMasRapido() {
		if(this.conectado) {
			System.out.println("Moviendo mas rapido el motor electrico , aumentado el voltaje....");
		}else {
			System.out.println("No es posible moverlo mas rapido el motor electrico , por que esta desconectado.");
		}
	}
	
	public void detener() {
		if(this.conectado) {
			System.out.println("EL motor electrico se esta deteniendo...");
		}else {
			System.out.println("EL motor electrico no se puede detener por que esta desconectado");
		}
	}
	
	public void desconectar() {
		System.out.println("Desconectandop el motor electrico...");
		this.conectado = false;
	}
	
	
}

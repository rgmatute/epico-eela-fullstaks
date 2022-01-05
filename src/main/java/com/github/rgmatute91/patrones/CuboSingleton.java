package com.github.rgmatute91.patrones;

public class CuboSingleton {
	
	private static CuboSingleton instancia;
	private String valor;
	
	private CuboSingleton(String valor) {
		this.valor = valor;
	}
	
	public static CuboSingleton obtenerInstancia(String valor) {
		
		if(instancia == null) {
			instancia = new CuboSingleton(valor);
		}
		
		return instancia;
	}
	
	public String getValor() {
		return this.valor;
	}
	

}

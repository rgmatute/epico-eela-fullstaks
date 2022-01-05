package com.github.rgmatute91;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.rgmatute91.patrones.CocheSingleton;
import com.github.rgmatute91.patrones.CuboSingleton;

@SpringBootApplication
public class HolaMundoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(HolaMundoApplication.class, args);
		
		
		/*
		CuboSingleton cubo1 = CuboSingleton.obtenerInstancia("INSTANCIA-1");
		CuboSingleton cubo2 = CuboSingleton.obtenerInstancia("INSTANCIA-2");
		CuboSingleton cubo3 = CuboSingleton.obtenerInstancia("INSTANCIA-3");
		CuboSingleton cubo4 = CuboSingleton.obtenerInstancia("INSTANCIA-4");
		CuboSingleton cubo5 = CuboSingleton.obtenerInstancia("INSTANCIA-5");
		CuboSingleton cubo6 = CuboSingleton.obtenerInstancia("INSTANCIA-6");
		CuboSingleton cubo7 = CuboSingleton.obtenerInstancia("INSTANCIA-7");
		CuboSingleton cubo8 = CuboSingleton.obtenerInstancia("INSTANCIA-8");
		CuboSingleton cubo9 = CuboSingleton.obtenerInstancia("INSTANCIA-9");
		CuboSingleton cubo10 = CuboSingleton.obtenerInstancia("INSTANCIA-10");
		CuboSingleton cubo11 = CuboSingleton.obtenerInstancia("INSTANCIA-11");
		CuboSingleton cubo12 = CuboSingleton.obtenerInstancia("INSTANCIA-12");
		CuboSingleton cubo13 = CuboSingleton.obtenerInstancia("INSTANCIA-13");
		CuboSingleton cubo14 = CuboSingleton.obtenerInstancia("INSTANCIA-14");
		
		
		System.out.println(cubo1.getValor());
		System.out.println(cubo2.getValor());
		System.out.println(cubo3.getValor());
		System.out.println(cubo4.getValor());
		System.out.println(cubo5.getValor());
		System.out.println(cubo6.getValor());
		System.out.println(cubo7.getValor());
		System.out.println(cubo8.getValor());
		System.out.println(cubo9.getValor());
		System.out.println(cubo10.getValor());
		System.out.println(cubo11.getValor());
		System.out.println(cubo12.getValor());
		System.out.println(cubo13.getValor());
		System.out.println(cubo14.getValor());
		*/
		
		/*
		CocheSingleton car1 = CocheSingleton.getInstance("HONDA");
		CocheSingleton car2 = CocheSingleton.getInstance("AUDI");
		
		System.out.println(car1.value);
		System.out.println(car2.value);
		*/
	}

}

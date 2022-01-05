package com.github.rgmatute91;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.rgmatute91.service.CocheSingleton;

@SpringBootApplication
public class HolaMundoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(HolaMundoApplication.class, args);
		
		CocheSingleton car1 = CocheSingleton.getInstance("HONDA");
		CocheSingleton car2 = CocheSingleton.getInstance("AUDI");
		
		System.out.println(car1.value);
		System.out.println(car2.value);
	}

}

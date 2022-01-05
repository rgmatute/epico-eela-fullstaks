package com.github.rgmatute91.service;

public class CocheSingleton {
	
	private static CocheSingleton instance;
	public String value;
	
	private CocheSingleton(String value) {
		this.value = value;
	}
	
	public static CocheSingleton getInstance(String value) {
		if (instance == null) {
            instance = new CocheSingleton(value);
        }
		return instance;
	}

}

package com.github.rgmatute91.entity.lombok;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class User {

	private String usuario;

	private String nombre;

	private String apellidos;

	private String contrasenia;

	@NonNull
	private String correo;

	private String foto;
	
	
}

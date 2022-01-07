package com.github.rgmatute91.Utils;

import java.util.ArrayList;
import java.util.List;

import com.github.rgmatute91.web.rest.vm.UserVM;

public class ListUtils {
	
	private static List<UserVM> lista;
	
	
	public static Boolean agregarUsuario(UserVM userVM) {
		
		if(lista == null) {
			lista = new ArrayList<>();
		}
		try {
			lista.add(userVM);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	
	public static UserVM buscarUsuario(String email) {
		
		UserVM usuario = null;
		
		if(lista != null) {
			for(UserVM user : lista) {
				if(user.getEmail().equals(email)) {
					usuario = user;
					break;
				}
			}
		}
		
		return usuario;
	}
	
	public static List<UserVM> listarUsuarios(){
		
		if(lista == null) {
			return new ArrayList<>();
		}
		
		return lista;
	}
	
	
	

}

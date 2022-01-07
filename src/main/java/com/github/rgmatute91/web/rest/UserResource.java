package com.github.rgmatute91.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.rgmatute91.Utils.ListUtils;
import com.github.rgmatute91.web.rest.vm.UserVM;

@RestController
@RequestMapping("/api")
public class UserResource {

	@GetMapping("/users")
	public List<UserVM> listarUsuarios() {
		return ListUtils.listarUsuarios();
	}

	@PostMapping("/users")
	public UserVM guardarUsuario(@RequestBody UserVM userVM) throws Exception {

		if (userVM.getEmail() == null) {
			throw new Exception("EL correo no esta definido.");
		}

		ListUtils.agregarUsuario(userVM);

		return userVM;
	}

	@GetMapping("/users/{correo}")
	public UserVM buscarUsuario(@PathVariable(name = "correo") String email) {
		return ListUtils.buscarUsuario(email);
	}

}

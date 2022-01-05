package com.github.rgmatute91.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.rgmatute91.web.rest.vm.ResponseVM;

@RestController
public class MiPrimerServicioRest {
	
	@GetMapping("/users")
	Object holaMundo() {
		ResponseVM response = new ResponseVM();
		response.setMessage("Hola mundo");
		
		return response;
	}
	
	@GetMapping("/users/{username}")
	Object getUserName(@PathVariable String username ) {
		ResponseVM response = new ResponseVM();
		response.setUsername(username);
		response.setMessage("Hola - " + username);
		
		return response;
	}
	
	@PostMapping("/users")
	Object setUsername(@RequestBody ResponseVM body ) {
		body.setMessage("Bien recibi, la información de: " + body.getUsername());
		return body;
	}
	

}

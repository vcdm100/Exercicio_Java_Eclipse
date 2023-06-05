package com.api.API.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("pessoas") // Ela define a rota que chame essa Controller
public class PessoaController implements OlaInterface {
	@GetMapping()
	public String getNome(@RequestParam(value = "nome") String nome) {
		return nome; //http://localhost:8080/pessoas?nome=Victor
	}
	
	public String getOla() {
		return "Olà";
	}
}

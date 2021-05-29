package br.com.alura.forum.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.FormLogin;

@RestController
@RequestMapping
public class AutenticacaoController {

	@PostMapping("/auth")
	public ResponseEntity<?> auth(@RequestBody @Valid FormLogin login){
		System.out.println(login.getEmail());
		System.out.println(login.getSenha());
		return ResponseEntity.ok().build();
	}
}

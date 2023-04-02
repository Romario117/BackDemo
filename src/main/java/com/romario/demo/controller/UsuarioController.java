package com.romario.demo.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romario.demo.dto.LoginDTO;
import com.romario.demo.entities.UsuarioEntity;
import com.romario.demo.response.LoginMessage;
import com.romario.demo.service.UsuarioService;

@RequestMapping(value = "/api/v1/")
@CrossOrigin("*")
@RestController
public class UsuarioController {

	 @Autowired
	    private UsuarioService usuarioService;

	    @GetMapping(path = "usuarios")
	    public ResponseEntity<List<UsuarioEntity>> getUsuarios() throws ParseException {
	        return new ResponseEntity<>(usuarioService.getUsuariosList(), HttpStatus.ACCEPTED);
	    }
	    
	    @PostMapping(path = "login")
	    public ResponseEntity<?> login(@RequestBody LoginDTO login){
	    	LoginMessage login1 = usuarioService.login(login);
	    	return ResponseEntity.ok(login1);
	    }
	    
}

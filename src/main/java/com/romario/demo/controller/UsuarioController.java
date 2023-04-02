package com.romario.demo.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romario.demo.entities.UsuarioEntity;
import com.romario.demo.service.UsuarioService;

@RequestMapping(value = "/api/v1/")
@CrossOrigin("*")
@RestController
public class UsuarioController {

	 @Autowired
	    private UsuarioService usuarioService;

	    @GetMapping("usuarios")
	    public ResponseEntity<List<UsuarioEntity>> getUsuarios() throws ParseException {
	        return new ResponseEntity<>(usuarioService.getUsuariosList(), HttpStatus.ACCEPTED);
	    }
}

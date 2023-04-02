package com.romario.demo.service;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romario.demo.entities.UsuarioEntity;
import com.romario.demo.repository.UsuarioRepo;

@Service
public class UsuarioService {

	 @Autowired
	    private UsuarioRepo usuarioRepo;
	 
	    public List<UsuarioEntity> getUsuariosList() throws ParseException {
	        List<UsuarioEntity> usuariosList;
	       usuariosList   = usuarioRepo.getDataJson();
	        return usuariosList;
	    }
}

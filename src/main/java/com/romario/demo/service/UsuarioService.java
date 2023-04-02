package com.romario.demo.service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romario.demo.dto.LoginDTO;
import com.romario.demo.entities.UsuarioEntity;
import com.romario.demo.repository.UsuarioRepo;
import com.romario.demo.response.LoginMessage;

@Service
public class UsuarioService {

	 @Autowired
	    private UsuarioRepo usuarioRepo;
	 
	    public List<UsuarioEntity> getUsuariosList() throws ParseException {
	        List<UsuarioEntity> usuariosList;
	       usuariosList   = usuarioRepo.getDataJson();
	        return usuariosList;
	    }
	    
	    public LoginMessage login(LoginDTO dto) {
	    	UsuarioEntity entity = usuarioRepo.findByUsername(dto.getUsername());
	    	if (entity != null) {
				Optional<UsuarioEntity> usuario = usuarioRepo.findByUsernameAndPassword(dto.getUsername(),dto.getPassword());
				if (usuario.isPresent()) {
					return new LoginMessage("Exitoso", true);
				}else {
					return new LoginMessage("Inicio de sesion fallido", false);
				}
	    	}else {
	    		return new LoginMessage("Usuario no encontrado", false);
	    	}
	    }
}

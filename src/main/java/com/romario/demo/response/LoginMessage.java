package com.romario.demo.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginMessage {

	String mensaje;
	Boolean estatus;
	
	public LoginMessage(String mensaje, Boolean estatus) {
		super();
		this.mensaje = mensaje;
		this.estatus = estatus;
	}
	
	
	
}

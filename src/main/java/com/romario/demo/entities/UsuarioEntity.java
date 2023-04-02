package com.romario.demo.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioEntity {

    private Integer id;
    private String clave;

    private String tipo;
    private String nombre;
    private String username;
    private String apellidoP;
    private String apellidoM;
    private String password;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date fechaInicio;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date fechaFin;
    private String tiempo;
    private String status;

    public UsuarioEntity(){}
    public UsuarioEntity(Integer id, String clave, String tipo, String nombre, String username, String apellidoP, String apellidoM, String password, Date fechaInicio, Date fechaFin, String tiempo, String status) {
        this.id = id;
        this.clave = clave;
        this.tipo = tipo;
        this.nombre = nombre;
        this.username = username;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.password = password;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tiempo = tiempo;
        this.status = status;
    }
}

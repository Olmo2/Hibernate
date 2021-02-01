package com.olmo.hibernate;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable

class AlumnoId implements Serializable {

	

	public AlumnoId(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	String nombre;

	String apellidos;
	
}

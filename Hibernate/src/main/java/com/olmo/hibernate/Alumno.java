package com.olmo.hibernate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name = "alumnos")

public class Alumno {

	@EmbeddedId
	AlumnoId id;
	int edad;
	
	public Alumno(AlumnoId id, int edad) {
		super();
		this.id = id;
		this.edad = edad;
	}
	
	
	
}
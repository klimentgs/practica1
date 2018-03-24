package edu.usmp.vehiculo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Person implements Serializable{

	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	@Size(min=1, max=30)
	private String nombre;
	@NotNull
	@Size(min=1, max=30)
	private String vehiculo;
	@NotNull
	@Size(min=1, max=30)
	private Integer recorrido;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Integer getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(Integer recorrido) {
		this.recorrido = recorrido;
	}
}

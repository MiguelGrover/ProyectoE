package kaban;

import java.util.Date;

public class Tarea {
	private String descripcion;
	private int estado;
	private String Categoria;
	private String Prioridad;
	private String Propietario;
	private Date FechaDeEntrega;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getPrioridad() {
		return Prioridad;
	}
	public void setPrioridad(String prioridad) {
		Prioridad = prioridad;
	}
	public String getPropietario() {
		return Propietario;
	}
	public void setPropietario(String propietario) {
		Propietario = propietario;
	}
	public Date getFechaDeEntrega() {
		return FechaDeEntrega;
	}
	public void setFechaDeEntrega(Date fechaDeEntrega) {
		FechaDeEntrega = fechaDeEntrega;
	}
	public Date getFechaDeCreacion() {
		return FechaDeCreacion;
	}
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		FechaDeCreacion = fechaDeCreacion;
	}
	private Date FechaDeCreacion;
}

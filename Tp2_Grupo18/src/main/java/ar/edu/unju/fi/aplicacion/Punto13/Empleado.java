package ar.edu.unju.fi.aplicacion.Punto13;

import java.time.LocalDate;

public class Empleado {
	String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public Double getHorasTrabajas() {
		return horasTrabajas;
	}

	public void setHorasTrabajas(Double horasTrabajas) {
		this.horasTrabajas = horasTrabajas;
	}

	LocalDate fechaIngreso = LocalDate.of(1900,01,01);
	String legajo = "-99999";
	String email;
	Double sueldo;
	Double horasTrabajas;
	
	
	
	public Empleado() {
		
	}
	public Empleado(String nombre,String legajo,Double horasTrabajas) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.horasTrabajas = horasTrabajas;	
	}
	
	public Empleado(String nombre, LocalDate fechaIngreso, String legajo, String email, Double sueldo,
			Double horasTrabajas) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.legajo = legajo;
		this.email = email;
		this.sueldo = sueldo;
		this.horasTrabajas = horasTrabajas;
	}
	
	public Empleado(String nombre, LocalDate fechaIngreso, Double horasTrabajas) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.horasTrabajas = horasTrabajas;
	}
	
	public Empleado(String nombre, Double horasTrabajas) {
		super();
		this.nombre = nombre;
		this.horasTrabajas = horasTrabajas;
	}
	

	public Double calcularSueldo(double hs) {
		double h=0.0;
		double hextra=0.0;
		double total=0.0;
		if (hs <= 160) {
			
			total = 600 * 160;
		}
		else {
			hextra = hs - 160;
			double Sextra = hextra * 650;
			h = 600 * 160;
			total = Sextra + h;
		}
		return total;
	}
	public void imprimir(Double horas, Double a) {
		System.out.println("Nombre: " + nombre + " FechaIngreso: " + fechaIngreso + " Legajo: " + legajo + " Email: " + email + " Horas Trabajadas: " + horas + " Sueldo: " + a);
	}
	public void Mostrar() {
		System.out.println("Nombre: " + nombre + " FechaIngreso: " + fechaIngreso + " Legajo: " + legajo + " Horas Trabajadas: " + horasTrabajas);
		
	}
}

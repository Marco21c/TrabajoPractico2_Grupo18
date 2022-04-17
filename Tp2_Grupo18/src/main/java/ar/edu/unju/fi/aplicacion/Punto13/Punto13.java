package ar.edu.unju.fi.aplicacion.Punto13;

import java.time.LocalDate;
import java.util.Scanner;

//no es necesario importar Empleado ya que esta dentro del mismo paquete
public class Punto13 {

	public static void main(String[] args) {
		// 
		double horastrabajadas= 0.0;
		double sueldot= 0.0;
		LocalDate fechaIngreso = LocalDate.of(2022, 11, 10);
		//constructor por defecto
		Empleado unEmpleado = new Empleado("pepe", fechaIngreso, "L1305", "punto13_tp2@grupo18.com", sueldot, horastrabajadas);
		Scanner dato =new Scanner(System.in);
		
		System.out.println("ingrese cantidad de horas trabajadas: ");
		horastrabajadas = dato.nextDouble();
		System.out.println("el sueldo de pepe "+unEmpleado.calcularSueldo(horastrabajadas));
	}

}

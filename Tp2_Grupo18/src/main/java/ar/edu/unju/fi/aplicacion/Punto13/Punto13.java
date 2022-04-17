package ar.edu.unju.fi.aplicacion.Punto13;

import java.time.LocalDate;
import java.util.Scanner;

public class Punto13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double horastrabajadas= 0.0;
		double sueldot= 0.0;
		LocalDate fechaIngreso = LocalDate.of(2022, 11, 10);
		Empleado unEmpleado = new Empleado("pepe", fechaIngreso, "L1305", "punto13_tp2@grupo18.com", sueldot, horastrabajadas);
		Scanner dato =new Scanner(System.in);
		
		System.out.println("ingrese cantidad de horas trabajadas: ");
		horastrabajadas = dato.nextDouble();
		System.out.println("el sueldo de pepe "+unEmpleado.calcularSueldo(horastrabajadas));
	}

}

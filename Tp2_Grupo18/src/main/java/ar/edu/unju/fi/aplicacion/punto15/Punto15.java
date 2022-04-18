package ar.edu.unju.fi.aplicacion.punto15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Punto15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Persona unaPersona= new Persona();
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese fecha con el siguiente formato (yyyy,mmm,dd): ");
    String fecha = entrada.next();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy,MM,dd");
    LocalDate fecha1 = LocalDate.parse(fecha,formato);   
    
    unaPersona.calculo_años(fecha1);
    unaPersona.signo_zodiaco(fecha1);
    unaPersona.estacion(fecha1);
	}
 
}
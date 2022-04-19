package ar.edu.unju.fi.aplicacion.punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //b1
	ProcesoFecha pf1 = new ProcesoFecha(LocalDate.of(2020, 05, 04),LocalDate.of(2021, 05, 10));
	System.out.println("Fecha1: " + pf1.getFecha1());
	System.out.println("Fecha2: " + pf1.getFecha2());
    //b2
	ProcesoFecha pf2 = new ProcesoFecha(LocalTime.of(10,30,10), LocalTime.of(12, 11, 05));
	System.out.println("Hora 1: " + pf2.getTime1().plusHours(5) + "  Hora 2: " + pf2.getTime2().minusMinutes(20));
    //b3
	String comparacion = pf1.compararFechas();
	System.out.println(comparacion);
	//b4
	LocalDateTime Comb1 = LocalDateTime.of(pf1.getFecha1(),pf2.getTime1());
	LocalDateTime Comb2 = LocalDateTime.of(pf1.getFecha2(),pf2.getTime2());
	ProcesoFecha pf3 = new ProcesoFecha(Comb1,Comb2);
	System.out.println("Combinacion 1: " + Comb1 + " Combinacion 2: " + Comb2);
	//b5 
	ProcesoFecha pf4 = new ProcesoFecha(LocalDate.of(2001, 05, 04),LocalDate.now());
     Period p = pf4.contarTiempoTranscurrido();
     String F1 = pf4.formatearFecha(pf4.getFecha1());
     String F2 = pf4.formatearFecha(pf4.getFecha2());
     System.out.println("Han transcurrido " + p.getYears() + " Años " +p.getMonths()+" Meses y "+ p.getDays()+ " dias" + " desde la fecha " + F1 + " hasta la fecha "+ F2);
     //b6 y b7
    //Entrada para capturar el teclado 
 	Scanner entrada = new Scanner(System.in);
	//format para el formato de las fechas
 	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");   
   // bucle do while para poder repetir en caso de error
   boolean validar= true;
   do {	
   try {
	System.out.println("Ingrese una fecha con el siguiente formato (dd/MM/yyyy): ");
	String Fech1 = entrada.next();
    LocalDate nuevaFecha1 = LocalDate.parse(Fech1,format);
    validar=false;
   } catch(DateTimeParseException e) {
	   System.out.println("Hubo un error al ingresar la fecha. Intente de nuevo. Error -> " + e);
   }
   }while(validar);
   // Nuevo objeto
    ProcesoFecha pf5 = new ProcesoFecha();
	// Se le asigna una fecha al atributo fecha1 con set 
    pf5.setFecha1(LocalDate.of(2020, 12, 25));
    //Se muestra el valor en el atributo fecha1 con get
	LocalDate mostrarFecha = pf5.getFecha1().plusDays(365);
	System.out.println(mostrarFecha);
	
    
    boolean validar2 = true;
    do {
    try {
    System.out.println("Ingrese una fecha con el siguiente formato (dd/MM/yyyy): ");
    String Fech2 = entrada.next();	
    LocalDate nuevaFecha2 = LocalDate.parse(Fech2,format);
	pf5.setFecha2(nuevaFecha2);
	LocalDate nuevaFecha3 = pf5.getFecha2().minusMonths(6);
	validar2 = false; 
	System.out.println(nuevaFecha3);
    }catch(DateTimeParseException ee) {
 	   System.out.println("Hubo un error al ingresar la fecha. Intente de nuevo. Error -> " + ee);
    }
    }while(validar2);
	
  }
   }
